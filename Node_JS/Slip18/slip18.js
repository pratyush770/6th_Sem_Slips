const a = require('./rect');
const prompt = require('prompt-sync')();
const l = prompt("Enter the length of the rectangle : ");
const b = prompt("Enter the breadth of the rectangle : ");
const area = a.area(l,b);
console.log(`The length of the rectangle is : ${l}`);
console.log(`The breadth of the rectangle is : ${b}`);
console.log(`The area of the rectangle is : ${area}`);