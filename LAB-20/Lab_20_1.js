//1. Demonstrate the use of middleware in Express. (A)
//OR
//how to set username and password constaint on API

const express = require('express');
const app = express();
const bodyParser = require('body-parser');
app.use(express.urlencoded());

//default path '/' hase
app.use('/',(req, res, next) => {
    console.log('Middleware function called.');
    if(req.body.username == 'vishal' && req.body.password == '1014'){
        next();
    }else{
        res.send('Invalid username or password.');
    }
});

app.get('/home',(req,res)=>{
    console.log('req.path : ',req.path);
    console.log('req.baseUrl : ',req.baseUrl);//middleware path
    console.log('req.originalUrl : ',req.originalUrl);
    res.send('Welcome to home page.');
});

app.get('/home/hader',(req,res)=>{
    res.send('Welcome to hader page.');
});

app.listen(3000,()=>{
    console.log('Server is running on port 3000...');
});