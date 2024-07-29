// Create a webapp with 5 pages like about, contact etc.. using ExpressJS.
const express = require('express');
const app = express();

app.get('/',(req,res)=>{
    res.send(`Hello World`);
});
app.get('/about',(req,res)=>{
    res.send(`Hello From About Section!`);
});
app.get('/contact',(req,res)=>{
    res.send(`Hello From Contact Section!`);
});
app.get('/service',(req,res)=>{
    res.send(`Hello From Service Section!`);
});
app.get('/product',(req,res)=>{
    res.send(`Hello From Product Section!`);
});
app.get('/home',(req,res)=>{
    res.send(`Hello From Home Section!`);
});

const port = 3000;
app.listen(3000,()=>{
    console.log(`Server Listen At ${port} : `);
});