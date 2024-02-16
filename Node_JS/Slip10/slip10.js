const express = require('express');
const app = express();
const port = 8080;
const path = require('path');
app.get('/',(req,res)=>{
    const imageFile = path.join(__dirname,'images','luffy.jpg');  // assumes the images folder is the server folder
    res.download(imageFile,'luffy.jpg');  // will download the file
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
});