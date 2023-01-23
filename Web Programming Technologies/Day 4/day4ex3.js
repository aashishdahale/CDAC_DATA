//Named function 
function multiply(n1,n2)
{
    if(typeof(n1)== "number" && typeof(n2)=="number")
    {
    let m = n1*n2
    return m
    }
    else
      return "You sent it wrong"
}

let rv = multiply("hi","hello")
//let rv = multiply(12,10)
console.log(rv)