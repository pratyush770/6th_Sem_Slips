const express = require('express');
const app = express();
const mysql = require('mysql');
const port = 8080;
const path = require('path');
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
        console.log("Database not connected...");
        return;
    }
    console.log("Database connected successfully...");
});
app.get('/',(req,res)=>{
    const q = "SELECT COUNT(*) AS total_records FROM teacher";
    con.query(q,(err,result)=>{
        if(err)
        {
            console.log("Error counting records");
            return;
        }
        const totalCount = result[0].total_records;
        console.log("The total count is : "+ totalCount);
        res.send("Record inserted successfully");
    });
});
app.get('/add',(req,res)=>{
    res.render("add");
});
app.post('/new',(req,res)=>{
    const q2 = "INSERT INTO teacher VALUES(?,?,?)";
    const tid = req.body.tid;
    const tname = req.body.tname;
    const sal = req.body.sal;
    con.query(q2,[tid,tname,sal],(err)=>{
        if(err)
        {
            console.error(err);
        }
        console.log("Record inserted successfully");
        res.redirect("teacher.ejs");
    });
});
app.get('/view',(req,res)=>{
    const q1 = "SELECT * FROM teacher";
    con.query(q1,(err,details)=>{
        if(err)
        {
            console.log("Error fetching records");
            return;
        }
        console.log("Records fetched successfully");
        res.render("view",{details});
    });
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
});