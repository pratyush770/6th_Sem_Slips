const express = require('express');
const app = express();
const multer = require('multer');  // used for uploading
const port = 8080;
app.get('/',(req,res)=>{
    res.render("slip9.ejs");  // the ejs file must always be inside a folder named 'views'
});
const storage = multer.diskStorage({
    destination:function(req,file,cb){
        cb(null,'uploads/')  // uploads the files in the folder named 'uploads'
    },
    filename:function(req,file,cb){
        cb(null,file.originalname)  // uploads the original file
    }
});
const upload = multer({storage:storage});
app.post('/upload',upload.single('file'),(req,res)=>{ 
     // upload.single('file') will return a single file
    res.send("File upload successfully");
})
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
});