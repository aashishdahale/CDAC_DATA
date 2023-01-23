import React from "react";

export default class Incr extends React.Component
{
   

    //Life Cycle method 
    componentDidMount=()=>{
        //this.setState({num:this.props.initialval})
    }

    handler=()=>{
        //let v = this.state.num
        //v++
        ///this.setState({num:v})

        this.props.modifier("i")

    }

    //view
    render()
    {
        return(
            <div>
                {/* <p>{this.state.num}</p> */}
                <button onClick={this.handler} >INCREMENT</button>
            </div>
        )
    }
}