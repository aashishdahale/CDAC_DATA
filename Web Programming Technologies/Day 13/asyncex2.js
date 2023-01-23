async function somef1()
{
    console.log("1")
    let p =   await new Promise((resolve,reject)=>{
                    
                        setTimeout(()=>resolve("OK"),2000)
                    }
                    ) 
    console.log(p)
   console.log("2")
   return p;
}

//console.log(somef1())
p=somef1()
p.then((resolve)=>{console.log(resolve)})