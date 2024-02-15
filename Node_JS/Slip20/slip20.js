const fs = require('fs');
const prompt = require('prompt-sync')();
let fileName = prompt("Enter the file name with extension : ");
const readableStream = fs.createReadStream(fileName,'utf-8');
readableStream.on('data',(chunk)=>{
    console.log("Received chunk of data...");
    console.log(chunk);
});
readableStream.on('end',()=>{
    console.log("Finished reading the data from the file...");
});
readableStream.on('error',(err)=>{
    if(err)
    {
        console.log("Error reading file...");
    }
});