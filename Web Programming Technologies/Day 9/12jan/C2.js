import React from "react";
import C3 from "./C3"

export default class C2 extends React.Component
{
     render()
     {
        return(
            <div>
            <p style={{backgroundColor:'red'}}>The Bill is as shown Below -</p>
            <C3 discount={this.props.discount} ></C3>
            </div>
        )
     }
}