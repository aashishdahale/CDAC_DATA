import { useSelector } from "react-redux";

export default function Show()
{
    let arr= useSelector((state)=>{return state.mylist})

    return(
        <ul>{ arr.map((e,index)=>{return <li key={index}>{e}</li>})}</ul>
    )
}