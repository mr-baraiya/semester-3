// Demonstrate “fs” core module in NodeJS.
const fs = require('fs');
//console.log(fs);
fs.exists('D:\\VS_CODES\\Web Tech\\LAB-17', (exists) =>{
    console.log(exists?'Found':'Not Found');
});

fs.stat('Lab_17_2.js',(err,data) => {
    console.log(data);
});

fs.readFile('demo.txt',(err,data) => {
    console.log(data.toString());
});

fs.unlink('demo.txt',(err,data) => {
    if(err){ throw err}
    console.log("File Deleted.");
});

fs.rename('demo.txt' ,'demo_1',(err,data) => {
    if(err){ throw err}
    console.log("File Deleted.");
});