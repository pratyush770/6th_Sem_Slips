const express = require('express');
const app = express();
const mysql = require('mysql');
const path = require('path');
const port = 8080;
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
        console.log("Error connecting database",err);
        return;
    }
    console.log("Database connected successfully...");
});

// signup
app.get('/',(req,res)=>{
    res.render("signup");
});
app.post('/signup',(req,res)=>{
    const q = "INSERT INTO signup(email,pwd) VALUES(?,?)";
    const email = req.body.email;
    const pwd = req.body.pwd;
    con.query(q,[email,pwd],(err)=>{
        if(err)
        {
            console.log("Signup unsuccessful");
            res.send("Signup unsuccessful");
        }
        console.log("Signup successful");
        res.send("Signup successful");
    });
});


// login
app.get('/login',(req,res)=>{
    res.render("login");
});
app.post('/login',(req,res)=>{
    const email = req.body.email;
    const pwd = req.body.pwd;
    const q =`SELECT email,pwd FROM signup WHERE email = ?`;
    con.query(q,[email],(err,result)=>{
        if(err)
        {
            console.log("Error reading record",err);
            return;
        }
        const data = result[0];
        if(pwd!=data.pwd)
        {
            console.log("Login unsuccessful");
            res.send("Login unsuccessful");
        }
        else
        {
            console.log("Login successful");
            res.send("Login successful");
        }
    });
});
app.listen(port,()=>{
    console.log(`Server is running on port ${port}`);
});