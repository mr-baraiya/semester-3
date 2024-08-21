//3. Create a restful CRUD API using NodeJS, Express and MongoDB for product. (C )
//1. Create a restful CRUD API using NodeJS, Express and MongoDB for faculty. (A)

const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const Product = require('./Product');//local module relative path 
const connectString = "mongodb+srv://i_am_vishal_1014:vishal_1014@cluster0.r4bt2.mongodb.net/Demo";
const port = 3000;

mongoose.connect(connectString).then(()=>{
    console.log("Connected Succesfully!");

    const app = express();
    app.use(bodyParser.urlencoded());
    //getAll
    app.get('/products/',async (req,res)=>{
        try{
            const ans = await Product.find();
            res.send(ans);
        }catch(error){
            console.log(error);
        }
    });
    //getByid
    app.get('/products/:id',async (req,res)=>{
        try {
            const ans = await Product.findOne({id : req.params.id});
            if(!ans){
                res.status(404).send({message : "product Not Found"});
            }
            res.send(ans);
        } catch (error) {
            console.log(error);
        }
    });
    // //getBy_Id
    // app.get('/products/:id',async (req,res)=>{
    //     try {
    //         const ans = await Product.findById(req.params.id);
    //         if(!ans){
    //             res.status(404).send({message : "product Not Found"});
    //         }
    //         res.send(ans);
    //     }catch(error){
    //         console.log(error);
    //     }
    // });

    //create
    app.post('/products/',async (req,res)=>{
        try{
            let product = new Product({...req.body});
            const ans = await product.save();
            res.send(ans);
            console.log("product Aided Succesfully.");
        }catch(error){
            console.log(error);
        }
    });

    //update
    app.patch('/products/:id',async (req,res)=>{
        try{
            const product = await Product.findOne({id : req.params.id});
            if(!product){
                res.status(404).send({message : "product Not Found"});
            }
            product.id = req.body.id;
            product.name = req.body.name;
            product.price = req.body.price;
            product.company = req.body.company;
            const ans = await product.save();
            res.send(ans);
            console.log("product Updated Succesfully.");
        }catch(error){
            console.log(error);
        }
    });
    //delete
    app.delete('/products/:id',async (req,res)=>{
        try{
            const ans = await Product.deleteOne({id : req.params.id});
            if(!ans){
                res.status(404).send({message : "Product Not Found"});
            }
            res.send(ans);
            console.log("product Deleted Succesfully.");
        }catch(error){
            console.log(error);
        }
    });

    app.listen(port,() => {
        console.log(`Server Started At ${port}...`);
    });
});