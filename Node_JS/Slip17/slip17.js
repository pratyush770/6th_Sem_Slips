const mysql = require('mysql');
const port = 8080;
const express = require('express');
const app = express();
const con = mysql.createConnection({
    host:"localhost",
    port:3307,
    user:"root",
    password:"matsumoto",
    database:"mydatabase"
});
con.connect((err)=>{
    if(err)
    {
        console.log("Database not connected...");
        return;
    }
    console.log("Database connected successfully...");
});
app.get('/',(req,res)=>{
    const q = "SELECT * FROM emp ORDER BY sal";
    con.query(q,(err,details)=>{
        if(err)
        {
            console.log("Error fetching records...");
            return;
        }
        res.render("slip17.ejs",{details});
    });
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
})