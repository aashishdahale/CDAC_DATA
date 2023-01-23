import React from "react";

export default class ShowCapsC extends React.Component
{
    constructor()
    {
        super()
        this.state={sum:0}
        this.n1=0
        this.n2=0
    }

    //We can use Lambda functions so that the "this" of the object is available
    handler3=(e)=>
    {
        let id = e.target.id
        if(id === "1")
            this.n1 =parseInt(e.target.value)
        
        if(id === "2")
            this.n2=parseInt(e.target.value)
        
        console.log("n1=",this.n1,"n2=",this.n2)
    }

    addHandler=()=>
    {
        let s = this.n1 + this.n2
        this.setState({sum:s})  // this will RERENDER the page 
    }

    render()
    {
        return(
        <div style={{borderWidth:"2px",borderStyle:"solid", marginTop:"20px"}}>
            <input type="number" id="1" onChange={this.handler3}/>
            <input type="number" id="2" onChange={this.handler3}/>
            <button onClick={this.addHandler}>Add</button>
            <p>Result : {this.state.sum}</p>
        </div>
        )
   
    }
}