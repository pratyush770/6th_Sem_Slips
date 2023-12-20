const concat = function(fname,lname){
    return `${fname}${lname}`
};

const calAge = (dob)=>{
    const birthDate = new Date(dob);
    const currentDate = new Date();

    let age = currentDate.getFullYear() - birthDate.getFullYear();
    const monthDiff = currentDate.getMonth() - birthDate.getMonth();
  
    if (monthDiff < 0 || (monthDiff === 0 && currentDate.getDate() < birthDate.getDate())) {
      age--;
    }
  
    return age;
}

module.exports={
    concat,
    calAge,
};