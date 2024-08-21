//2. Create a restful CRUD API using NodeJS, Express and MongoDB for student. (B)

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
    // //getBy_Id
    // app.get('/students/:id',async (req,res)=>{
    //     try {
    //         const ans = await Student.findById(req.params.id);
    //         if(!ans){
    //             res.status(404).send({message : "Student Not Found"});
    //         }
    //         res.send(ans);
    //     }catch(error){
    //         console.log(error);
    //     }
    // });

    //create
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
    app.patch('/students/:rNo',async (req,res)=>{
        try{
            const stu = await Student.findOne({rNo : req.params.rNo});
            if(!stu){
                res.status(404).send({message : "Student Not Found"});
            }
            stu.rNo = req.body.rNo;
            stu.name = req.body.name;
            stu.email = req.body.email;
            stu.sem = req.body.sem;
            const ans = await stu.save();
            res.send(ans);
            console.log("Student Updated Succesfully.");
        }catch(error){
            console.log(error);
        }
    });
    //delete
    app.delete('/students/:rNo',async (req,res)=>{
        try{
            const ans = await Student.deleteOne({rNo : req.params.rNo});
            if(!ans){
                res.status(404).send({message : "Student Not Found"});
            }
            res.send(ans);
            console.log("Student Deleted Succesfully.");
        }catch(error){
            console.log(error);
        }
    });

    app.listen(port,() => {
        console.log(`Server Started At ${port}...`);
    });
});