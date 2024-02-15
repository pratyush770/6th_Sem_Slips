const fs = require('fs');
const prompt = require('prompt-sync')();
let fileName = prompt("Enter the file name with extension : ");
let oldWord = prompt("Enter the word you want to replace :");
let newWord = prompt("Enter the word you want to replace with : ");
fs.readFile(fileName,'utf-8',(err,data)=>{
    if(err)
    {
        console.log("Error reading file",err);
        return;
    }
    let replacedContent = data.replace(new RegExp(oldWord,'g'),`<b>${newWord}</b>`);
    fs.writeFile(fileName,replacedContent,(err)=>{
        if(err)
        {
            console.log("Error writing file",err);
            return;
        }
        console.log("Content replaced successfully");
    })
})