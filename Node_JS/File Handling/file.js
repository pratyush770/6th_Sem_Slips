const fs = require("fs"); // file system module which is in-built

// synchronous call returns value
// asynchronous call never returns value


// synchronous call for writing data into file
//fs.writeFileSync("./test.txt","This is my first created file");   // creates a file named test.txt with the entered data

// asynchronous call for writing data into file
// fs.writeFile("./demo.txt","This is my second created file",(err)=>{});


// synchronous call for reading file
// const result = fs.readFileSync("./test.txt","utf-8");
// console.log(result);


// asynchronous call for reading file
// fs.readFile("./demo.txt","utf8",(err,result)=>{
//     if(err){
//         console.log("Error",err);
//     }
//     else{
//         console.log(result);
//     }
// })


// synchronous call for appending data into file
// fs.appendFileSync("./test.txt","Hello World\n");


// synchronous call for copying file
// fs.cpSync("./test.txt","./copy.txt");


// synchronous call for deleting file
// fs.unlinkSync("./copy.txt");


// synchronous call for getting status of a file
// console.log(fs.statSync("./test.txt"));    // returns the status
// console.log(fs.statSync("./test.txt").isFile());   // return true if it is a file


// synchronous call for making a directory
// fs.mkdirSync("my-docs");   // creates a directory named my-docs
// fs.mkdirSync("my-doc/pratyush/nodejs",{recursive:true});   // creates a directory with subdirectories

// open a file 
// fs.open("a.txt",'r',function (err,f)
// {
//     if(err)
//     {
//         console.error(err);
//     }
//     else
//     {
//         console.log(f);
//     }
// });
