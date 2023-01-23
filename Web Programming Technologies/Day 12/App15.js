import { useState } from "react";
import { Provider } from "react-redux";
import store from "../storage/mystore";
import Add from "./Add";
import MyC1 from "./MyC1";
import MyC1WithRedux from "./MyC1WithRedux";
import MyC2 from "./MyC2";
import Show from "./Show";
import UseRefEx from "./UseRefEx";

export default function App15()
{
    let [x,setX] =useState(0)
    return(
        <Provider store={store}>
        {/* <UseRefEx></UseRefEx>
        
        <div>
            <MyC1WithRedux></MyC1WithRedux> 
             <input type="text" onChange={(e)=>{setX(e.target.value)}} ></input>
            <p>{x}</p>
            <MyC1></MyC1>
            <MyC2></MyC2>
             */}
        <Add></Add>
        <Show></Show>
    </Provider>
    )
}