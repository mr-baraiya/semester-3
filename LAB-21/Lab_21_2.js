//2. Demonstrate the use mongoose functions. (A)

const express = require('express');
const mongoose = require('mongoose');
const connectString = "mongodb+srv://i_am_vishal_1014:vishal_1014@cluster0.r4bt2.mongodb.net/Students/";
const port = 3000;

mongoose.connect(connectString).then(()=>{
    console.log("Connected Succesfully!");

    const app = express();
    app.get('/home',(req,res)=>{
        res.send("Mongoose Functions.");
    });
    
    app.listen(port,() => {
        console.log(`Server Started At ${port}...`);
    });
});