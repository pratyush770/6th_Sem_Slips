var a = require('./fact');  // require keyword is used to import module in which the name of the module is written
const prompt = require('prompt-sync')();
const n = prompt("Enter a number : ");
console.log("The factorial of the number is : " + a.factorial(n));