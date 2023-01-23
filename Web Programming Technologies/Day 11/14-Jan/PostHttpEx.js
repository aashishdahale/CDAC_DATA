import axios from "axios"
import { useState } from "react"

export default function PostHttpEx()
{
    let name12=""
    let job12 = ""
    let [theresponse,setResp] = useState(null)

    function handler2()
    {
        let data_to_be_Sent = {name:name12,job:job12}
        let promise =axios.post("https://reqres.in/api/users" ,data_to_be_Sent)
        promise.then(response=>{
            console.log(response.status)
            setResp(response.data)
        })
    }


    function handler()
    {
        let data_to_be_Sent = {name:name12,job:job12}
        fetch("https://reqres.in/api/users",
        {
            method:"POST",
            body:JSON.stringify(data_to_be_Sent),
            headers:{'Content-Type':'application/json'},
        }
        ).then((resp)=>{
            return resp.json()
        }).then(resp=>{
            setResp(resp)
        })
    }

    return(
        <div>
            Name : <input type="text" onBlur={(e)=>{ name12=e.target.value}} />
            Job : <input type="text" onBlur={(e)=>{ job12=e.target.value}} />
            <button onClick={handler}>post with fetch</button>
            <button onClick={handler2}>post with axios </button>
            {theresponse?
            <div>
            <p>{theresponse.name} </p>
            <p>{theresponse.job} </p>
            <p>{theresponse.id} </p>
            <p>{theresponse.createdAt} </p>
            </div>
            :null}

        </div>
    )

}