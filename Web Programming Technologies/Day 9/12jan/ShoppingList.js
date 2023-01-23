import React from "react";

export default class ShoppingList extends React.Component
{
    constructor()
    {
        super()
        this.itemname=""
        this.state={allitems:[]}
    }

    handler1=(e)=>{
        this.itemname =e.target.value
    }

    handler2=()=>{
        let localv = [...this.state.allitems]
        localv.push(this.itemname)
        //this.state.allitems.push(this.itemname)
        this.setState({allitems:localv})
    }

    render()
    {
        return(
            <>
            <input type="text" onChange={this.handler1} />
            <button onClick={this.handler2}>OK</button>
            <div>
            {this.state.allitems}
            </div>
            </>
        )
    }
}