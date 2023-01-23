function maths(f1)
{
    let rv = f1(12,10)
    console.log(rv)
}
function add(a,b){
    return a+b
}
maths(add)  //passing named function
//passing anonymous function 
maths(function(a,b){
    return a-b
})

maths((a,b)=>a*b) //passing a fat arrow /lamda function

let v1 = function (a,b){
    return a/b
}
maths(v1)







