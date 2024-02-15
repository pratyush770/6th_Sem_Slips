// connecting mysql with nodejs with basic operations
// const mysql = require('mysql');
// const prompt = require('prompt-sync')();
// const port = 8080;
// const express = require('express');
// const app = express(); 

// creating mysql connection
// const con = mysql.createConnection({
//     host:"localhost",
//     port:"3307",
//     user:"root",
//     password:"matsumoto",
//     database:'mysqldemo'
// });
// con.connect((err)=>{
//     if(err)
//     {
//         throw err;
//     }
//     console.log("Connected successfully");
// });

// creating a database
// const q = "CREATE DATABASE IF NOT EXISTS mysqldemo";
// con.query(q,(err,result)=>{
//     if(err)
//     {
//         throw err;
//     }
//     console.log("Database created successfully");
// });

// creating a table inside the database
// const q1 = `CREATE TABLE IF NOT EXISTS person(
// pid INT PRIMARY KEY,
// pname VARCHAR(45),
// age INT)`;
// con.query(q1,(err,result)=>{
//     if(err)
//     {
//         throw err;
//     }
//     console.log("Table created successfully");
// });

// inserting a recording in the table by taking user input
// const pid = prompt("Enter the id of the person : ");
// const pname = prompt("Enter the name of the person : ");
// const age = prompt("Enter the age of the person : ");
// const q2 = "INSERT INTO person VALUES(?,?,?)";
// con.query(q2,[pid,pname,age],(err)=>{
//     if(err)
//     {
//         throw err;
//     }
//     console.log("Record inserted successfully");
// });

// fetching all the records
// app.get('/',(req,res)=>{
//     const q3 = "SELECT * FROM person";
//     con.query(q3,(err,result)=>{
//         if(err)
//         {
//             throw err;
//         }
//         res.send(result);
//     });
// });

// updating a record
// let pname = prompt("Enter the name of the person : ");
// let age = prompt("Enter the age you want to update : ");
// const q4 = "UPDATE person SET age = ? where pname = ?";
// con.query(q4,[age,pname],(err)=>{
//     if(err)
//     {
//         throw err;
//     }
//     console.log("Age updated successfully");
// });

// deleting a record
// let pname = prompt("Enter the name of the person you want to delete : ");
// const q5 = "DELETE FROM person WHERE pname = ?";
// con.query(q5,[pname],(err)=>{
//     if(err)
//     {
//         throw err;
//     }
//     console.log("Record deleted successfully");
// });

// app.listen(port,()=>{
//     console.log(`Server is listening to port ${port}`);
// });