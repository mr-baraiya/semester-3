const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;
app.use(bodyParser.urlencoded());

let students =[ 
    {
        rno : 101,
        name : 'Vishal',
        branch : 'cse',
    },
    {
        rno : 102,
        name : 'rahul',
        branch : 'it',
    },
    {
        rno : 103,
        name : 'yadav',
        branch : 'cevil',
    }
];
//getAllX
app.get('/students',(req,res)=>{
    res.send(students);
});

//getXbyID
app.get('/students/:rno',(req,res)=>{
    const ans = students.find(stu => stu.rno == req.params.rno);
    res.send(ans);
});
//post
app.post('/students',(req,res)=>{
    students.push(req.body);
    res.send("Student Aided Successfully.");
});
//update using patch
app.patch('/students/:rno',(req,res)=>{
    const ans = students.findIndex(stu => stu.rno == req.params.rno);
    students[ans] = req.body;
    res.send("Updated Successfully.");
});
//update using put
app.put('/students/:rno',(req,res)=>{
    const ans = students.findIndex(stu => stu.rno == req.params.rno);
    students[ans] = req.body;
    res.send("Updated Successfully.");
});
//delete
app.delete('/students/:rno',(req,res)=>{
    const idx = students.findIndex(stu => stu.rno == req.params.rno);
    students.splice(idx,1);
    res.send("Deleted Successfully.");
});

app.all('*',(req,res)=>{
    res.send("Please Entter th e valid Request :");
});
app.listen(port,()=>{
    console.log("Server Listen At",port);
});