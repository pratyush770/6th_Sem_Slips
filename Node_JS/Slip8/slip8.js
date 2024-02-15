const fs = require('fs');
const prompt = require('prompt-sync')();
let fileName1 = prompt('Enter the first file name with extension : ');
let fileName2 = prompt('Enter the second file name with extension : ');
fs.readFile(fileName1,'utf-8',(err,data1)=>{
    if(err)
    {
        console.log("Error reading file",err);
        return;
    }
fs.readFile(fileName2,'utf-8',(err,data2)=>{
    if(err)
    {
        console.log("Error reading file",err);
        return;
    }
    const combinedData = `${data1}${data2}`;
    const upper = combinedData.toUpperCase();
fs.appendFile('c.txt',upper,(err)=>{
    if(err)
    {
        console.log("Error appending file",err);
        return;
    }
    console.log("Files appended successfully in uppercase");
});
});
});