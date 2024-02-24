const express = require('express');
const app = express();
const port = 8080;
const path = require('path');
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));
app.get('/',(req,res)=>{
    res.render("home");
});
app.get('/about',(req,res)=>{
    res.render("about");
});
app.get('/hist',(req,res)=>{
    res.render("history");
});
app.get('/feed',(req,res)=>{
    res.render("feedback");
});
app.listen(port,()=>{
    console.log(`Server is listening on port ${port}`);
});