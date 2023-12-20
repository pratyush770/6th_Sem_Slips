var a = require('./circle');

const prompt = require('prompt-sync')();
const r = prompt("Enter the radius : ");
const area = a.area(r);
const circ = a.circ(r);

console.log(`The entered radius is ${r}`);
console.log(`The area of the circle is ${area.toFixed(2)}`);
console.log(`The circumference of the circle is ${circ.toFixed(2)}`);
