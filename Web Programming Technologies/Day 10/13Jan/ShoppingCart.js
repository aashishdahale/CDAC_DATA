import { useState } from "react";
import AddItem from "./AddItem";
import ShowBill from "./ShowBill";
import ShowItems from "./ShowItems";

export default function ShoppingCart()
{
    let availableItems =[
        {id:1,item_name:"pen", unit_cost:20},
        {id:2,item_name:"pen2", unit_cost:30},
        {id:3,item_name:"pencil", unit_cost:10},
        {id:4,item_name:"eraser", unit_cost:15},
        {id:5,item_name:"marker", unit_cost:50},
        {id:6,item_name:"ruler", unit_cost:25},
    ]

    let [cart,setCart] = useState([])

    function add_to_cart(obj)
    {
        let temp = [...cart]
        temp.push(obj)
        console.log("temp ",temp)
        setCart(temp)
    }
     


     return(
        <div>
        <AddItem availableItems={availableItems} addfunc={add_to_cart}>  </AddItem>
        <ShowItems>   </ShowItems>
        <ShowBill></ShowBill>
        </div>
     ) 

}