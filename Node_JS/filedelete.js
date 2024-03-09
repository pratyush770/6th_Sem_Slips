const fs = require('fs');
var file = "a.txt";
fs.unlink(file,(err=>{
    if(err)
    {
        console.error(err);
    }
    console.log(file + " deleted successfully...")
}));
getFilesInDirectory();
function getFilesInDirectory()
{
    console.log("The available files are...");
    var files = fs.readdirSync(__dirname);
    files.forEach(file=>{
        console.log(file);
    })
}