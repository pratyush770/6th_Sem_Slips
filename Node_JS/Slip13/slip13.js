const mysql = require('mysql');
const con = mysql.createConnection({
    host:"localhost",
    port:"3307",
    user:"root",
    password:"matsumoto",
    multipleStatements:true
});

con.connect(function(err){
    if(err)
    {
        throw err;
    }
    console.log("Connected");
    createDatabaseAndTable();
});
 function createDatabaseAndTable(){
    const q = `CREATE DATABASE IF NOT EXISTS studentdb;
    USE studentDB;
    CREATE TABLE IF NOT EXISTS student(
            rno INT PRIMARY KEY,
            sname VARCHAR(45),
            per INT
        );
    `;
    con.query(q,(err,result)=>{
        if(err)
        {
            throw err;
        }
        console.log("Database created");
    });
 }