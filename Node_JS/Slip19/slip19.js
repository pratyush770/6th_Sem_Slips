const express = require("express");
const app = express();
const port = 8080;
app.get('/',(req,res)=>{
    res.render("home.ejs");
});
app.get('/new.ejs',(req,res)=>{
    res.render("new.ejs");
});
app.get('/past.ejs',(req,res)=>{
    res.render("past.ejs");
});
app.get('/comments.ejs',(req,res)=>{
    res.render("comments.ejs");
});
app.listen(port,()=>{
    console.log(`Server is listening on port ${port}`);
});