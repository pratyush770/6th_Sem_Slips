const express = require('express');
const app = express();
const port = 8080;
app.get('/',(req,res)=>{
    res.render("events.ejs");
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
});