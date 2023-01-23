import { Link, Outlet } from "react-router-dom";

export default function Home()
{
    let x=23
    return(
        <div>
            <h1>this is the landing page ....</h1>
            <p><Link to="/httppost">Http Post Example</Link></p>
            <p><Link to="/httpget">Http Get Example</Link></p>
            <p><Link to={`/mathstable/${x}`}>Maths Table</Link></p>
            <p><Link to="/show">Route Params Example</Link></p>
            <div style={{borderStyle:"solid",borderWidth:"2px"}}>
                  <Outlet></Outlet>  {/* the component will be rendered here*/}
            </div>

        </div>
        
    )
}