import { useParams } from "react-router-dom";

export default function Update()
{
    let params = useParams()
    let id = params.id

    return(
        <p> I got {id}</p>
    )
}
