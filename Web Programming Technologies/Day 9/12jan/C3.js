export default function C3(props)
{

    let amount=5000
    let disc = props.discount
    let finalamt = amount - (disc*amount/100)
    const myinlinestyle ={
        backgroundColor : 'blue',
        border : '1px solid black',
        padding : '16px ',
        fontSize : '2em',
        cursor : 'pointer'
      } 

    return(
        <p style={myinlinestyle} >The Bill amount is {finalamt} after {disc} percent discount </p>
    )



}