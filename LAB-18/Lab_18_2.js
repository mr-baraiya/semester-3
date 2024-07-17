//Create a webapp with 5 pages like about, contact etc.. using “http” core module in NodeJS.

const http = require('http');
const server = http.createServer((req,res)=>{
    if(req.url === '/home'){
        res.end('Hello World from Home page.');
    }else if(req.url === '/about'){
        res.end('Hello World from About page.');
    }else if(req.url === '/contact'){
        res.end('Hello World from Contact page.');
    }else if(req.url === '/service'){
        res.end('Hello World from Service page.');
    }else if(req.url === '/product'){
        res.end('Hello World from Product page.');
    }else{
        res.end('Hello World!');
    }
});
const port = 3000;
server.listen(port,()=>{
    console.log(`Server is listening on port ${port}`);
});
