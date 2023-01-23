import { useSelector } from "react-redux"

export default function MyC2()
{
    let counter= useSelector((state)=>{return state.counter})
    return(
        <div style={{borderStyle:"solid" , borderWidth:"3px"}}>
        <p>{localStorage.getItem("data111")}</p>
        <p>{counter}</p>
        </div>
    )
}