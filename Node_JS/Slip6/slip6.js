const express = require('express');
const app = express();
const fs = require('fs');
const prompt = require('prompt-sync')();
const port = 8080;
let fileName = prompt('Enter the file name with extension : ');
app.get("*",(req,res)=>{
    fs.readFile(fileName,"utf-8",(err,data)=>{
        if(err)
        {
            res.status(404).send("File not found");
            console.error("File not found");
        }
        else
        {
            res.status(200).send(data);
        }
    });
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
});
