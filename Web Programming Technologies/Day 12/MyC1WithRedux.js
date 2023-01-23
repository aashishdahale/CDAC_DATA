import { useDispatch, useSelector } from "react-redux"

export default function MyC1WithRedux()
{
    let counter = useSelector((state)=>{return state.counter})
    let mydispatch = useDispatch()
    function handler1()
    {
        mydispatch({type:"increment"})
    }

    function handler2()
    {
        mydispatch({type:"decrement"})
    }

    return(
        <div>
            <h1>Counter={counter}</h1>
            <button onClick={handler1}>INCR</button>
            <button onClick={handler2}>DECR</button>
        </div>
    )
}