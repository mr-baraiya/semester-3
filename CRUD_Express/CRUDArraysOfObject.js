const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;
//app.use(bodyParser.urlencoded());
app.use(bodyParser.json());
//For Students
let students =[ 
    {
        id : 1011,
        name : 'Vishal',
        branch : 'cse',
    },
    {
        id : 1012,
        name : 'rahul',
        branch : 'it',
    },
    {   
        id : 1013,
        name : 'yadav',
        branch : 'cevil',
    }
];
//getAllX
app.get('/students',(req,res)=>{
    res.send(students);
});

//getXbyID
app.get('/students/:id',(req,res)=>{
    const ans = students.find(stu => stu.id == req.params.id);
    res.send(ans);
});
//post
app.post('/students',(req,res)=>{
    students.push(req.body);
    res.send("Student Aided Successfully.");
});
//update using patch
app.patch('/students/:id',(req,res)=>{
    const ans = students.findIndex(stu => stu.id == req.params.id);
    students[ans] = req.body;
    res.send("Updated Successfully.");
});
// app.patch('/students/:id',(req,res)=>{
//     const ans = students.findIndex(stu => stu.id == req.params.id);
//     let data = req.body;
//     students[ans] = {...students[ans],...data};
//     res.send("Updated Successfully.");
// });
//update using put
app.put('/students/:id',(req,res)=>{
    const ans = students.findIndex(stu => stu.id == req.params.id);
    students[ans] = req.body;
    res.send("Updated Successfully.");
});
//delete
app.delete('/students/:id',(req,res)=>{
    const idx = students.findIndex(stu => stu.id == req.params.id);
    students.splice(idx,1);
    res.send("Deleted Successfully.");
});

//For facultys
let facultys =[ 
    {
        id : 2011,
        name : 'Darshan',
        subject : 'DSA'
    },
    {
        id : 2012,
        name : 'Deven',
        subject : 'JAVA'
    },
    {   
        id : 2013,
        name : 'Dhairya',
        subject : 'Web Technology'
    }
];
//getAllX
app.get('/facultys',(req,res)=>{
    res.send(facultys);
});

//getXbyID
app.get('/facultys/:id',(req,res)=>{
    const ans = facultys.find(stu => stu.id == req.params.id);
    res.send(ans);
});
//post
app.post('/facultys',(req,res)=>{
    facultys.push(req.body);
    res.send("Faculty Aided Successfully.");
});
//update using patch
app.patch('/facultys/:id',(req,res)=>{
    const ans = facultys.findIndex(stu => stu.id == req.params.id);
    facultys[ans] = req.body;
    res.send("Updated Successfully.");
});
//update using put
app.put('/facultys/:id',(req,res)=>{
    const ans = facultys.findIndex(stu => stu.id == req.params.id);
    facultys[ans] = req.body;
    res.send("Updated Successfully.");
});
//delete
app.delete('/facultys/:id',(req,res)=>{
    const idx = facultys.findIndex(stu => stu.id == req.params.id);
    facultys.splice(idx,1);
    res.send("Deleted Successfully.");
});



app.get('/both',(req,res)=>{
    res.json(
        {
            "students" : students,
            "facultys" : facultys
        }
    ); 
});
app.listen(port,()=>{
    console.log("Server Listen At",port);
});