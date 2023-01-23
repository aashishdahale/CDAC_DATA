import React from "react";
import { useParams } from "react-router-dom";

export default function ShowTable()
{
    let obj= useParams()  // Hook reads the path parameters from the URL 
    let n =obj.num

    let arr=[1,2,3,4,5,6,7,8]
    let newarr= arr.map((i)=>{ return <tr key={i+""}><td>{`${n} * ${i}=${n*i}`}</td></tr>})

    return (
        <div>
            <table border="1">
            <tbody>
            {newarr}
            </tbody>
            </table>
        </div>
    )

}