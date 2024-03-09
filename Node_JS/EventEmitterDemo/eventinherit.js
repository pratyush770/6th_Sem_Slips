var events = require('events').EventEmitter;
var util = require('util');
function LoopProcessor(num){
    var t = this; // to get the current instance
    setTimeout(function(){
        for(var i = 1;i<=num;i++)
        {
            t.emit('beforeProcessing',i);
            console.log('Processing number : ' + i);
            t.emit('afterProcessing',i);
        }
    },1000); // will start the function after 1 sec
}
util.inherits(LoopProcessor,events);  // enables instances of LoopProcessor to emit events.
var event = new LoopProcessor(3);
event.on('beforeProcessing',function(data){
    console.log('About to start process for ' + data);
});
event.on('afterProcessing',function(data){
    console.log('Completed processing for ' + data);
});