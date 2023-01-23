export default function TestJSX()
{
    let v = <h1>Hello</h1>
    console.log("the type of v =",typeof(v),v)

    //first dont write return
    //then add return (v)
    //then use the following return
    return(
        <>
        {v}
        <TestJSX2></TestJSX2>
        </>
    )
}//end of TestJSX

export function TestJSX2()
{
    let calculate=(a,b)=>{
        let sum=a+b
        return sum
    }
    let age=12
    let jsxv1 = <p>The square of 21 is {21*21}</p>
    let city ="pune"
    let obj ={id:12,productName:"Pendrive",cost:200}
    return(
        <div>
        <h3>Welcome to {city} </h3>
        <p>The {obj.productName} costs rupees {obj.cost}</p>
        {jsxv1}
        <span >{age<18?"Child":"Adult"}</span>
        <p>The sum of 23 and 113 = {calculate(23,113)}</p>
        </div>
    )
}

