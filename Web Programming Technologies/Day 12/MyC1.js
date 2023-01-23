import { useSelector } from "react-redux"

export default function MyC1()
{
    let c = useSelector((state)=>{return state.counter})
    //localStorage.setItem("data111","This is test data")
    return(
        <>
        <p>In C1  {c}</p>
        </>
        // <input type="text" onBlur={
        //     (e)=>{
        //         localStorage.setItem("data111",e.target.value)
        //     }
        // } />
    )
}