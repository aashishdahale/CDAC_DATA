import axios from "axios"
import { useEffect, useState } from "react"

export default function HttpGetEx()
{
    let [options,setOpt] = useState()

    useEffect(()=>{
        axios.get("./shopstock.json").then(resp=>{
            
            let d = resp.data.map((e,index)=>{
                return <option key={e.id} value={index}>{e.item_name}{e.unit_cost}</option>
            })
            setOpt(d)

        })
    },[])

    return(
        <select>{options}</select>
    )
}
