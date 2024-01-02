const concat = function(fname,lname){
    return `${fname}${lname}`
};

const calAge = (dob)=>{
    const birthDate = new Date(dob);  // 2004-3-1
    const currentDate = new Date();   // 2023-12-31

    let age = currentDate.getFullYear() - birthDate.getFullYear();  // 19
    const monthDiff = currentDate.getMonth() - birthDate.getMonth();  // 9
  
    if (monthDiff < 0 || (monthDiff === 0 && currentDate.getDate() < birthDate.getDate())) {
      age--;
    }
  
    return age;
}

module.exports={
    concat,
    calAge,
};