const buffer1 = Buffer.from("Hello");
const buffer2 = Buffer.from("World");

const con = Buffer.concat([buffer1,buffer2]);

console.log(`The buffers after concatenating are : ${con}`);

const result = buffer1.compare(buffer2);
if(result<0)
{
    console.log("buffer1 is smaller than buffer2");
}
else if(result==0)
{
    console.log("buffer1 is equal to buffer2");
}
else
{
    console.log("buffer1 is bigger than buffer2");
}

const copyBuffer = Buffer.alloc(buffer1.length);
buffer1.copy(copyBuffer)


console.log('Copied Buffer:',copyBuffer.toString());