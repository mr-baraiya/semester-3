const http = require('http');
const fs = require('fs');

const server = http.createServer((req,res)=>{
    fs.readFile('index.html',(err,data)=>{
        if(err) throw {err}
        res.end(data);
    });
    if(req.url === '/home'){
        res.end(fs.readFileSync('home.html'));
    }else if(req.url === '/skills'){
        res.end(fs.readFileSync('skills.html'));
    }else if(req.url === '/services'){
        res.end(fs.readFileSync('services.html'));
    }else if(req.url === '/contact'){
        res.end(fs.readFileSync('contact.html'));
    }else if(req.url === '/about'){
        res.end(fs.readFileSync('about.html'));
    }else{
        fs.readFile('index.html',(err,data)=>{
            if(err) throw {err}
            res.end(data);
        });
    }
});
const port = 3685;
server.listen(port,()=>{
    console.log(`Server is listening on port ${port}....`);
});
//alt + shift + f