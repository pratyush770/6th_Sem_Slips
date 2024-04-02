const express = require('express');
const app = express();
const multer = require('multer');
const port = "8080";
const path = require('path');
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));
app.get("/",(req,res)=>{
    res.render("slip9");
});
const storage = multer.diskStorage({
    destination:function(req,file,cb){
        cb(null,'uploads/');
    },
    filename:function(req,file,cb){
        cb(null,file.originalname);
    }
});
const upload = multer({storage:storage});
app.post('/upload',upload.single('file'),(req,res)=>{
    res.send("File uploaded successfully");
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
});