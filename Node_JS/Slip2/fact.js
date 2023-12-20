exports .factorial = function(n)  // user defined module
{
    var fact = 1,i;
    for(i=1;i<=n;i++)
    {
        fact = fact*i;
    }
    return(fact);
}