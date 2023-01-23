import { useEffect, useState } from "react";

export default function LifeCycleOfFuncComp()
{
    let [num,setNum] = useState(0)
    useEffect(()=>{
        console.log("the component is mounted")
    },[])

    useEffect(()=>{
         return ()=>{ console.log("this function is for cleanup before unmounting")}
    },[])

    useEffect(()=>{
        console.log("the state of  has changed ")
    } ,[num])


    return(
        <>
        <p>Function component Life Cycle</p>
        <button onClick={()=>{
            let v = num
            v++
            setNum(v)
        }}>OK</button>
        </>
    )
}