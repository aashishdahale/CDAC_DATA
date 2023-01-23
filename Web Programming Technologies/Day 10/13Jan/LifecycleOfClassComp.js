import { Component } from "react";

export default class LifeCycleOfClassComp extends Component
{
    constructor()
    {
        super()
        this.state={fname:"pune"}
    }

    componentDidMount=()=>
    {
        console.log("The component has been mounted")
    }

    componentWillUnmount=()=>
    {
        console.log("The component will be removed")
    }

    componentDidUpdate=(prevProps,prevState)=>{
        console.log("component did update ")
        console.log("pehle kya tha",prevProps.num,prevState.fname)
        console.log("ab kya hai",this.props.num,this.state.fname)
    }

    render()
    {
        return(
            <>
            <p> Life cycle of class {this.props.num}</p>
            <button onClick={()=>{
                let v = this.state.fname.toUpperCase()
                this.setState({fname:v})}}>Ok</button>
            </>
        )
    }


}