var events = require('events');
var eventEmitter = new events.EventEmitter();
const fun1 = (msg)=>{
    console.log("Message from function 1 : " + msg);
}
const fun2 = (msg)=>{
    console.log("Message from function 2 : " + msg);
}
const fun3 = (msg)=>{
    console.log("Message from function 3 : " + msg);
}
eventEmitter.on('myEvent',fun1);   // for registering the events
eventEmitter.on('myEvent',fun2);
eventEmitter.on('myEvent',fun3);

eventEmitter.removeListener('myEvent',fun2);  // for removing a specific event
// eventEmitter.removeAllListeners('myEvent');  // for removing all events

eventEmitter.emit('myEvent',"Hello World");  // for calling event

console.log(`Default max listeners for events are ${eventEmitter.getMaxListeners()}`);  // to get the default max listeners
eventEmitter.setMaxListeners(6);  // to set the default max listeners
console.log(`Max listeners for events are ${eventEmitter.getMaxListeners()}`);