const fs = require('fs');
const prompt = require('prompt-sync')();
let fileName = prompt("Enter the file name with extension : ");
fs.readFile(fileName,'utf-8',(err,data)=>{
    if(err)
    {
        console.log("Error reading file",err);
        return;
    }
let lineCount = data.split('\n').length;
console.log(`The total number of lines in ${fileName} is ${lineCount}`);
});