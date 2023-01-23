
let c=0
id = setInterval(function (){
    console.log("hi")
    c++
    if(c>=5)
    clearInterval(id)
},1000)

console.log("Last line of the code ")
/*
setInterval( function(){
    clearInterval(id)
},5000)
*/


