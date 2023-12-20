const area = function(r){
    return Math.PI*r*r;
};

const circ = (r)=>{
    return 2*Math.PI*r;
};

module.exports={  // for multiple exports use module.exports
    area,
    circ,
};