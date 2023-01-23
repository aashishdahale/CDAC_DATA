//import AddComponent,{SayHi as Hi,SayBye} from "./AddComponent";
import {SayHi as Hi,SayBye} from "./AddComponent";
import AC from "./AddComponent"
import Show from "./Show";
import TestJSX from "./TestJSX";
import Welcome from "./Welcome";

function App() {
  let n="meenal"
  return (
      <>
          {/* <h1>Hello to React </h1>
          <AC ></AC>
          <Hi></Hi>
          <SayBye></SayBye>
          <Show></Show> 
          <TestJSX></TestJSX> */}
          <Welcome fname="sonal"></Welcome>
          <Welcome fname={n}></Welcome>
          <Welcome fname="xxx"></Welcome>

      </>
  )
}

export default App;
