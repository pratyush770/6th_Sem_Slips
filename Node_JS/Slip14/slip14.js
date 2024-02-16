const express = require('express');
const app = express();
const port = 8080;
const path = require('path');
const mysql = require('mysql');
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));
app.use(express.json());
app.use(express.urlencoded({extended:true}));
const con = mysql.createConnection({
    host:"localhost",
    port:"3307",
    user:"root",
    password:"matsumoto",
    database:"studentdb"
});
con.connect((err)=>{
    if(err)
    {
        console.log("Error connecting database...",err);
        return;
    }
    console.log("Database connected successfully...");
});
app.get('/',(req,res)=>{
    res.render("employee");
});
app.post('/employee',(req,res)=>{
    const q = "INSERT INTO employee VALUES(?,?,?)";
    const dob = req.body.dob;
    const doj = req.body.doj;
    const salary = req.body.sal;
    con.query(q,[dob,doj,salary],(err)=>{
        if(err)
        {
            console.log("Error inserting record...",err);
            return;
        }
        console.log("Record inserted successfully");
    });
    const q1 = "SELECT * FROM employee";
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