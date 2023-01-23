import { useState } from "react";
import ConditionalRenderEx from "./ConditionalRenderEx";
import IncrDecr from "./IncrDecr";
import LifeCycleOfClassComp from "./LifecycleOfClassComp";
import LifeCycleOfFuncComp from "./LifecycleOfFuncComp";
import ShoppingCart from "./ShoppingCart";

export default function App2()
{
    let [cb,setCB] = useState(false)
    let [n,setN] = useState(0)
    return(
        <>
        <input type="number" onInput={(e)=>{setN(e.target.value)}} />
        <input type="checkbox" onChange={(e)=>{setCB(e.target.checked)}}/>
        {cb?<LifeCycleOfFuncComp num={n} ></LifeCycleOfFuncComp>:null}
        {/*<ShoppingCart></ShoppingCart>
         <ConditionalRenderEx></ConditionalRenderEx>
        <IncrDecr></IncrDecr>*/}
        </>
    )
}