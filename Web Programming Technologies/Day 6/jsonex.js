let obj={id:12,cost:444,desc:"QQQ"}

console.log(obj.cost)
let str =JSON.stringify(obj)
console.log(typeof(obj),typeof(str))
console.log("obj=",obj)
console.log("str=",str)

let o2 = JSON.parse(str)
console.log(typeof(o2),o2)

//ERRONEOUS USE -
//let o3=JSON.parse(obj)
//let o3 = JSON.stringify(str)
//console.log(o3)
//let o4 =JSON.parse(o3)
//console.log(o4)