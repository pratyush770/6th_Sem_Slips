const express = require("express");
const app = express();
const port = 8080;
const mysql = require('mysql');
const path = require('path');
app.set("view engine","ejs");  // uses ejs as default view engine
app.set("views",path.join(__dirname,"/views")); // uses view as feault directory
app.use(express.json());  // used to get input from user from json or url
app.use(express.urlencoded({extended:true}));  // used to get input from user from json or url
const con = mysql.createConnection({
    host:'localhost',
    port:3307,
    user:'root',
    password:'matsumoto',
    database:'studentdb'
});
con.connect((err)=>{
    if(err)
    {
        console.log("Database not connected successfully");
        return;
    }
    console.log("Database connected successfully...");
});
app.get('/',(req,res)=>{
    res.render("student");
});
app.post('/student',(req,res)=>{
    // Get the entered fields from the ejs here
    const dob = req.body.dob;
    const mobile = req.body.mobile;
    const email = req.body.email;
    const q = "INSERT INTO student VALUES(?,?,?)";
    con.query(q,[dob,mobile,email],(err)=>{
        if(err)
        {
            console.log("Record not inserted successfully",err);
            return;
        }
        console.log("Record inserted successfully...");
    });
    const q1 = "SELECT * FROM student";
    con.query(q1,(err,details)=>{
        if(err)
        {
            console.log("Error fetching records...",err);
            return;
        }
        console.log("Records fetched successfully...");
        res.render("details",{details});
    });
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
});