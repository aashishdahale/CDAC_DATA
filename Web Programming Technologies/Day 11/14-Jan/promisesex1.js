let v = new Promise((res,rej)=>{
  setTimeout(()=>{ 
    let x = 1+1
    if(x===2){
        console.log("promise executed successfully")
        res("Success")
    }
    else{
        rej("Failed")
    }
}, 2000)
})
v.then((res)=>{ console.log("In the Then Callback ",res)})
v.catch((rej)=>{console.log("In the Catch Callback ",rej)})
console.log("code ends",v)