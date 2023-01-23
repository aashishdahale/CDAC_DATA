import { useRef, useState } from "react"

export default function ConditionalRenderEx ()
{
     let [s,setSel] = useState(false)
      let cbval =useRef()
     function handler(e){
        console.log("handler called",e.target.checked)
        setSel(e.target.checked)
        //console.log("selection",cbval.current.checked)
        console.log("selec",s)
     }

    return(
        <div>
           Show List : <input type="checkbox" onChange={handler} ref={cbval}/>
           <span>Selection : {""+s}</span>

           {s?<ListEx></ListEx> : "" }
        </div>
    )


}

export function ListEx()
{
    return(
        <ol>
        <li>Airport Road</li>
            <li>Baner</li>
            <li>Magarpatta City</li>
            <li>Hinjewadi</li>
        </ol>
    
    )
}


