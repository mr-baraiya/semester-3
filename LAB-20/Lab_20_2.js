//2. Demonstrate the use of static middleware in Express. (A)
const express = require('express');
const app = express();

app.use("/home/labmanual",express.static('pdf'));
app.use("/home/phota",express.static('images'));
app.use("/home/media",express.static('music'));

app.get('/home',(req,res)=>{
    res.send('request for labmanual , phota , media.');
});

app.listen(3000,()=>{
    console.log('Server is running on port 3000...');
});