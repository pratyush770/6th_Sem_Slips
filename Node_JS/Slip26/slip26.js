const express = require('express');
const app = express();
const port = 8080;
const path = require('path');
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));
app.get('/',(req,res)=>{
    res.render("home");
});
app.get('/prod',(req,res)=>{
    res.render("product");
});
app.get('/cont',(req,res)=>{
    res.render("contact");
});
app.get('/feed',(req,res)=>{
    res.render("feedback");
});
app.listen(port,()=>{
    console.log(`Server is listening on port ${port}`);
});