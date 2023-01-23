import React from "react";

export default class EventExC extends React.Component
{
    handler()
    {
        console.log("hello from class ")
    }

    render()
    {
        return(
            <>
            <button onClick={this.handler}>show hello from class Component</button>
            </>
        )
    }
}