import { useState } from "react"

export default function Decr(props)
{

    let handler =()=>{
        
        props.modifier("d")
        // let v=num
        // v--
        // setNum(v)
    }

    return(
        <div>
            {/* <p>{num}</p> */}
            {/* <button onClick={handler} >DECREMENT</button> */}
            <button onClick={ ()=>{ props.modifier("d")} }>DECREMENT</button>
        </div>
    )
}