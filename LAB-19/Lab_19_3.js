/*3. Create a webapp in NodeJS which reads ƒles like about.txt, contact.txt and display it 
using express (C )
*/
const fs = require('fs');
const express = require('express');
const app = express();

app.get('/',(req,res)=>{
    res.send(`Hello World`);
});
app.get('/about',(req,res)=>{
    fs.readFile('about.txt', (err, data) => {
        if(err) throw {err};     
        res.send(data.toString());
    });
});
app.get('/contact',(req,res)=>{
    fs.readFile('contact.txt', (err, data) => {
        if(err) throw {err};     
        res.send(data.toString());
    });
});
app.post('/',(req,res)=>{
    res.send(`Hello from Post method.`);
});
const port = 3000;
app.listen(3000,()=>{
    console.log(`Server Listen At ${port} : `);
});