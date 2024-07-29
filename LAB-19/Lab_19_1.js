//. Create a hello world webapp using ExpressJS.
const express = require('express');
const app = express();

app.get('/',(req,res)=>{
    res.send(`Hello World`);
});

const port = 3000;
app.listen(3000,()=>{
    console.log(`Server Listen At ${port} : `);
});