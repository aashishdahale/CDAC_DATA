import { useState } from "react"

export default function AddItem(props)
{
    let[ qty,setQty] = useState(0)
    let[selectedId,setId] = useState(0) //this.state={qty:0,selectedId:0}
    let availableItems = props.availableItems
    let viewarr = availableItems.map((item,index)=>{
           return <option key={item.id} value={index}>{item.item_name+" "+item.unit_cost}</option>  
        })

    function getCost()
    {
         return availableItems[selectedId].unit_cost * qty
        // for(let i=0;i<availableItems.length;i++)
        // {
        //     if(availableItems[i].id == selectedId)
        //     {
        //         return availableItems[i].unit_cost * qty
        //     }
        // }
    }
    //VIEW
     return(
        <div>
        <select onChange={(e)=>{setId(e.target.value)}}>{viewarr}</select>
        Quantity: <input type="number" onInput={(e)=>{ setQty(e.target.value) }}  />
        <p>Cost ={getCost()} </p>
        <button onClick={()=>{props.addfunc({...availableItems[selectedId],qty:qty})}}>Add To cart </button>
        </div>
     )
    

}