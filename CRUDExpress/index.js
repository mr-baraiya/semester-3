//CRUD using expressjs
//Thunder Client
//https://expressjs.com/en/guide/routing.html
const express = require('express');
const app = express();
app.use(express.json())
let list = [];

app.get('/',(req,res)=>{
    res.list
    res.send(`Hello World`);
});
app.post('/',(req,res)=>{
    res.send(`Hello World`);
});
app.put('/',(req,res)=>{
    res.send(`Hello World`);
});
app.delete('/',(req,res)=>{
    res.send(`Hello World`);
});

const port = 3000;
app.listen(3000,()=>{
    console.log(`Server Listen At ${port} : `);
});