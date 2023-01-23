import { useState } from "react"

export default function ShowCaps()
{
    let text=""
    function handler1(eventsrc)
    {
        text=eventsrc.target.value
        //console.log(eventsrc)
        //console.log(eventsrc.target.value)
    }

    function handler2()
    {
        console.log(text.toUpperCase())
    }

    let n1=0,n2=0
    function handler3(e)
    {
        let id = e.target.id
        if(id === "1")
            n1=parseInt(e.target.value)
        
        if(id === "2")
            n2=parseInt(e.target.value)
        

    }

    let [sum,setSum] = useState(0)
    function addHandler()
    {   
        sum=n1+n2
        setSum(sum)  //The component should RERENDER 
        console.log("sum=",sum)
    }
    return(
        <>
        <div style={{borderWidth:"2px",borderStyle:"solid"}}>
            <input type="text" onChange={handler1}/>
            <button onClick={handler2}>show caps</button>
        </div>
        
        <div style={{borderWidth:"2px",borderStyle:"solid", marginTop:"20px"}}>
            <input type="number" id="1" onChange={handler3}/>
            <input type="number" id="2" onChange={handler3}/>
            <button onClick={addHandler}>Add</button>
            <p>Result : {sum}</p>
        </div>
        
        </>
    )
}