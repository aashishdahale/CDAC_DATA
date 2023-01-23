let x = new Promise( (resolve,reject)=>{   
    setTimeout(()=>{ 
        let x = Math.random()*10
        if( x<5) 
        {
            reject(x)
        }
        else
        {
            resolve(x)
        }
     },1000)

})

x.then(resolvedVal=>{console.log("Eureka !!! your score is ",resolvedVal)} )
x.catch(rejectedVal=>{console.log("Oh !!! you failed ",rejectedVal)} )

