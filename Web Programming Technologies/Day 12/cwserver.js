//import express from "express"; //add "type":"module"  in package.json
let express= require("express")

let app = express()


app.get('/', (request, response) => {
    return response.send('OK');
  });
  
  app.get('/data', (request, response) => {
    return response.send({"name":"prachi","gender":"female"});
  });

app.post('/postit',(req,res)=>{
    console.log("the post request received ....")
    res.status(404).send("All well")
})

app.put('/putit',(r,res)=>{
    res.send("put request recd")
})

app.delete('/deleteit',(r,res)=>{
    res.send("delete request recd")
})

app.get('/queryparam', (req,res)=>{
      let uname= req.query.user
      res.send("Thank you "+uname)
})


//Passing Path Parameters from the request url
app.get('/greet/:uname/:city',(req,res)=>{

    let user1 = req.params.uname
    let city = req.params.city
    res.send(`Welcome ${user1} from ${city}`)
    //res.render('greet',{user:user1})
  })
  





app.listen(5000, () => {
    console.log('App is listening on port 5000');
  });

console.log("end of express file")