//Create a webapp in NodeJS which reads ƒles like about.txt, contact.txt and display it using http core module.

const http = require('http');
const fs = require('fs');
const server = http.createServer((req, res) => {
    if (req.url == '/about') {
        try {
            fs.readFile('about.txt', (err, data) => {
                
                res.end(data.toString());
            });
        } catch (err) {
            if(err) throw err;
        }  
    } 
    else if (req.url == '/contact') {
        try {
            fs.readFile('contact.txt', (err, data) => {
                res.end(data.toString());
            });
        } catch (err) {
            if(err) throw err;
        }
    } else {
        res.end("Hello World!");
    }
});
const port = 3000;
server.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});  