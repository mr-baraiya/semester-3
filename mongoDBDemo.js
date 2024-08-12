const express = require('express');
const app = express();
const mongoose = require('mongoose');
const connectString = "mongodb+srv://i_am_vishal_1014:vishal_1014@cluster0.r4bt2.mongodb.net/";
const port = 3000;

mongoose.connect(connectString).then(()=>{
    console.log("Connected Succesfully!");
});

app.get('/home',(req,res)=>{
    res.send("Welcome To my Server.")
});

app.listen(port,() => {
    console.log(`Server Started At ${port}...`);
});