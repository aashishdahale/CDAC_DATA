import { useDispatch } from "react-redux"

export default function Add()
{
    let mydispatcher = useDispatch()
    function handler(e)
    {
        mydispatcher({type:"add",data:e.target.value})
    }
    return(
        <input type="text" onBlur={handler} />
    )

}