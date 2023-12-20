const con = require('./name');
const prompt = require('prompt-sync')();
const fname = prompt("Enter the first name : ");
const lname = prompt("Enter the last name : ");
const dob = "2004-3-1";
console.log(`After concatenation : ${con.concat(fname,lname)}`);
const age = con.calAge(dob);
console.log(`Your current age is : ${age}`);