//Rest parameters 
function sum(...n)
{
    let s = 0
    for(let i=0;i<n.length;i++)
    {
        s=s+n[i]
    }
    console.log(s)
}

sum(10,20,30,40,50,60)
sum()

str="hello"
//str.concat()
arr=[]
//arr.push()

/* Not Allowed
function f3 (...n,...p)
{

}*/


/* Not Allowed
function f2(...n,name)
{

}*/

//OK
function f4(name,addr,...n)
{

}








