let arr=[12,13,"delhi",true,2.3]
console.log(arr,typeof(arr))
console.log(arr.length)
arr.push(23,100,45)
console.log(arr,arr.length,arr[4])
//let rv = arr.splice(0,1)

let rv = arr.splice(0,0,"stars","moon","planets")
console.log(`rv = ${rv} and arr=${arr} and len = ${arr.length}`)