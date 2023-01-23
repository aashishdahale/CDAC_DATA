import { Route, Routes } from "react-router-dom";
import ShowTable from "../routing/ShowTable";
import Home from "./Home";
import HttpGetEx from "./httpGetex";
import PostHttpEx from "./PostHttpEx";
import RouteParamEx from "./RouteParamEx";
import Update from "./Update";

export default function AppRouteEx()
{

    return(
        <Routes>
            <Route path="/" element={<Home></Home>}>
            <Route path="/httppost" element={<PostHttpEx></PostHttpEx>}></Route>
            <Route path="/httpget" element={<HttpGetEx></HttpGetEx>}></Route>
            <Route path="/mathstable/:num" element={<ShowTable></ShowTable>}></Route>
            <Route path="/show" element={<RouteParamEx></RouteParamEx>}></Route>
            <Route path="/update/:id" element={<Update></Update>}></Route>
            
            </Route>
        </Routes>
    )
}