import { useState } from "react";
import Decr from "./Decr";
import Incr from "./Incr";

export default function IncrDecr()
{
    let [num,setNum] = useState(0)

    function changeValue(choice)
    {
        if(choice=="i")
        {
            let v = num
            v++
            setNum(v)
        }
        if(choice=="d")
        {
            let v = num
            v--
            setNum(v)
        }




    }

    return(
        <div>
            <p>{num}</p>
            <Incr   modifier={changeValue}></Incr>
            <Decr  modifier={changeValue} ></Decr>
        </div>
    )


}