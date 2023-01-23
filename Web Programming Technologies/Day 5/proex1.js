let obj = {name:'prachi',city:'pune' }
let pro = {age:45,qualification:'ME'}
let pro2 = {hobby:'sleeping'}
//EXPLICTLY doing PROTOTYPE CHAINING --------------
Object.setPrototypeOf(obj,pro)
Object.setPrototypeOf(pro,pro2)

console.log(Object.getPrototypeOf(obj),Object.getPrototypeOf(pro),Object.getPrototypeOf(pro2))
console.log(obj.city,obj.hobby ,obj.qualification,obj.name)


let d = new Date()
console.log(d.getFullYear())
d.getFullYear = function()
{
    console.log("test")
    return 0
}
d.getFullYear()



