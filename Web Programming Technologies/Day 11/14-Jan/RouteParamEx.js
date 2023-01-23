import axios from "axios"
import { useEffect, useState } from "react"
import { Link } from "react-router-dom"

export default function RouteParamEx()
{
    let [availableItems,setAI] =useState([])

    //This should be called on mount only
    useEffect(()=>{
        axios.get("./shopstock.json")
        .then((response)=>{
            console.log("getting response..",response.data)
           setAI(response.data)         
        })
    },[])

    function getRows()
    {
         return availableItems.map((item)=>{
             return <tr key={item.id}><td>{item.item_name}</td><td><Link to={`/update/${item.id}`}>Update</Link></td></tr>
         })       
    }


    return(
        <table>
            {getRows()}
        </table>
    )
}