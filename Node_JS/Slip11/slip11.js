const express = require('express');
const app = express();
const port = 8080;

let clgInfo={
    name: 'Garware College of Commerece',
    location: 'KarveNagar, Near Deccan Gymkhana Pune',
    course:'BBA, BBA-IB, BCOM and BCA',
};
app.get('/',(req,res)=>{
    res.send(`<h2>This is my college information</h2> 
    <br>
    <h2>The name of my college is : ${clgInfo.name}</h2>
    <br>
    <h2>The location of my college is : ${clgInfo.location}</h2>
    <br>
    <h2>The courses provided in my college are : ${clgInfo.course}</h2>`)
});
app.listen(port,()=>{
    console.log(`Server is listening to port ${port}`);
})