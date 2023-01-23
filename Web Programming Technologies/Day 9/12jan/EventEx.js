export default function EventEx()
{
    function handler()
    {
        console.log("hello..")
    }
    return(
        <div>
            <button onClick={handler}>Show Hello</button>
        </div>
    )
}