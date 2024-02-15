const mysql = require('mysql');
const prompt = require('prompt-sync')();
const port="8080";
const express = require('express');
const app = express();
const con = mysql.createConnection({
    host:"localhost",
    port:"3307",
    user:"root",
    password:"matsumoto",
    database:"mydatabase"
});
con.connect((err)=>{
    if(err)
    {
        throw err;
    }
    console.log("Database connected successfully");
});
const q1 = "SELECT * FROM emp";
app.get('/',(req,res)=>{
    con.query(q1,(err,result)=>{
        if(err)
        {
            throw err;
        }
        console.log("Records fetched successfully...");
        res.send(result);
    });
});
let ename = prompt("Enter the name of the employee : ");
let usal = prompt("Enter the salary you want to update :");
const q2 = `UPDATE emp SET sal = ? WHERE FullName = ?`;
con.query(q2,[usal,ename],(err)=>{  // the values [usal,ename] get passed in ? in the query
    if(err)
    {
        throw err;
    }
    console.log("Salary updated successfully");
});
app.listen(port,()=>{
    console.log(`Server is running on port ${port}`);
})