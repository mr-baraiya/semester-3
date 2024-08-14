//4. Create a Database using MongoDBCompass for student. (B)
const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const Student = require('./Student');//local module relative path 
const connectString = "mongodb+srv://i_am_vishal_1014:vishal_1014@cluster0.r4bt2.mongodb.net/Demo";
const port = 3000;

mongoose.connect(connectString).then(()=>{
    console.log("Connected Succesfully!");

    const app = express();
    app.use(bodyParser.urlencoded());
    //getAll
    app.get('/students',async (req,res)=>{
        try{
            const ans = await Student.find();
            res.send(ans);
        }catch(error){
            console.log(error);
        }
    });
    //getByrNo
    app.get('/students/:rNo',async (req,res)=>{
        try {
            const ans = await Student.findOne({rNo : req.params.rNo});
            if(!ans){
                res.status(404).send({message : "Student Not Found"});
            }
            res.send(ans);
        } catch (error) {
            console.log(error);
        }
    });
    //getByName
    app.get('/students/:name',async (req,res)=>{
        try {
            const ans = await Student.findOne({name : req.params.name});
            if(!ans){
                res.status(404).send({message : "Student Not Found"});
            }
            res.send(ans);
        }catch(error){
            console.log(error);
        }
    });
    //getBy _Id
    app.get('/students/:id',async (req,res)=>{
        try {
            const ans = await Student.findById(req.params.id);
            if(!ans){
                res.status(404).send({message : "Student Not Found"});
            }
            res.send(ans);
        }catch(error){
            console.log(error);
        }
    });
    //post
    app.post('/students',async (req,res)=>{
        try{
            let stu = new Student({...req.body});
            const ans = await stu.save();
            res.send(ans);
            console.log("Student Aided Succesfully.");
        }catch(error){
            console.log(error);
        }
    });
    //update
    app.put('/students/:id',async (req,res)=>{
        try{
            const ans = await Student.findByIdAndUpdate(req.params.id,req.body,{new : true});
            if(!ans){
                res.status(404).send({message : "Student Not Found"});
            }
            res.send("Student Updated Succesfully.");
        }catch(error){
            console.log(error);
        }
    });
    //delete
    app.delete('/students/:id',async (req,res)=>{
        try{
            const ans = await Student.findByIdAndDelete(req.params.id);
            if(!ans){
                res.status(404).send({message : "Student Not Found"});
            }
            res.send("Student Deleted Succesfully.");
        }catch(error){
            console.log(error);
        }
    });

    app.listen(port,() => {
        console.log(`Server Started At ${port}...`);
    });
});