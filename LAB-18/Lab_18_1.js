//Create a hello world webapp using “http” core module in NodeJS.
const http = require('http');
const server = http.createServer((req,res)=>{
    res.end('Hello World');
});
const port = 3000;
server.listen(port,()=>{
    console.log(`Server is listening on port ${port}`);
});
