import C2 from "./C2"
import "./c1.css"

export default function C1()
{
    let discount = 10;
    let clsnm = "outline"
    return(
        <div className={clsnm} > 
         {/*<div className="outline"> */}
        <C2 discount={discount}></C2>
        </div>
    )


}