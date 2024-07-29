// Demonstrate “child_process” core module in NodeJS.

const child_process = require('child_process');
console.log(child_process);

child_process.exec('dir',(err,stdout,stdin) => {
    console.log(stdout);
});