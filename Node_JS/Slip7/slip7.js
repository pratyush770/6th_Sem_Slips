const fs = require('fs');
const prompt = require('prompt-sync')();
let fileName1 = prompt("Enter the name of the first file with extension : ");
let fileName2 = prompt("Enter the name of the second file with extension : ");
fs.readFile(fileName1,(err,data)=>{
    if(err)
    {
        console.log("Error reading file",err);
        return;
    }
fs.appendFile(fileName2,data,(err)=>{
    if(err)
    {
        console.log("Error appending file",err);
    }
    console.log("File appended successfully");
});
})