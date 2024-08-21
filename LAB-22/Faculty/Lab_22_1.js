//1. Create a restful CRUD API using NodeJS, Express and MongoDB for faculty. (A)

const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const Faculty = require('./Faculty');//local module relative path 
const connectString = "mongodb+srv://i_am_vishal_1014:vishal_1014@cluster0.r4bt2.mongodb.net/Demo";
const port = 3000;

mongoose.connect(connectString).then(()=>{
    console.log("Connected Succesfully!");

    const app = express();
    app.use(bodyParser.urlencoded());
    //getAll
    app.get('/facultys/',async (req,res)=>{
        try{
            const ans = await Faculty.find();
            res.send(ans);
        }catch(error){
            console.log(error);
        }
    });
    //getByid
    app.get('/facultys/:id',async (req,res)=>{
        try {
            const ans = await Faculty.findOne({id : req.params.id});
            if(!ans){
                res.status(404).send({message : "faculty Not Found"});
            }
            res.send(ans);
        } catch (error) {
            console.log(error);
        }
    });
    // //getBy_Id
    // app.get('/facultys/:id',async (req,res)=>{
    //     try {
    //         const ans = await Faculty.findById(req.params.id);
    //         if(!ans){
    //             res.status(404).send({message : "faculty Not Found"});
    //         }
    //         res.send(ans);
    //     }catch(error){
    //         console.log(error);
    //     }
    // });

    //create
    app.post('/facultys/',async (req,res)=>{
        try{
            let fac = new Faculty({...req.body});
            const ans = await fac.save();
            res.send(ans);
            console.log("faculty Aided Succesfully.");
        }catch(error){
            console.log(error);
        }
    });

    //update
    app.patch('/facultys/:id',async (req,res)=>{
        try{
            const fac = await Faculty.findOne({id : req.params.id});
            if(!fac){
                res.status(404).send({message : "faculty Not Found"});
            }
            fac.id = req.body.id;
            fac.name = req.body.name;
            fac.email = req.body.email;
            fac.sub = req.body.sub;
            const ans = await fac.save();
            res.send(ans);
            console.log("faculty Updated Succesfully.");
        }catch(error){
            console.log(error);
        }
    });
    //delete
    app.delete('/facultys/:id',async (req,res)=>{
        try{
            const ans = await Faculty.deleteOne({id : req.params.id});
            if(!ans){
                res.status(404).send({message : "Faculty Not Found"});
            }
            res.send(ans);
            console.log("faculty Deleted Succesfully.");
        }catch(error){
            console.log(error);
        }
    });

    app.listen(port,() => {
        console.log(`Server Started At ${port}...`);
    });
});