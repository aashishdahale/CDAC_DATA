let v1 = function(n1,n2)  //anonymous function
{
    let div = n1/n2
    return div
}

console.log(typeof(v1))
let rv = v1(12,5)
console.log(rv)

//lamda function or fat arrow notation
let v2 = (n1,n2)=>{ let rem = n1%n2;  return rem}
console.log(typeof(v2))
console.log(v2(14,10))

let v3 = (n1,n2)=>n1/n2
console.log(v3(13,3))

let v4 =n2=>n2*n2
console.log(v4(5))




