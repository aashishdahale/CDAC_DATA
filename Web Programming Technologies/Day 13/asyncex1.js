function hello()
{
    return "hello"
}


async function hi()
{
   // return "hi"    
}

console.log(hello())
console.log(hi())


async function test()
{
    console.log("1")
    await new Promise((res,rej)=>{
        setTimeout(()=>{
            console.log("2")
            rej("job done")},2000)
    })
    console.log("3")
}

test()







