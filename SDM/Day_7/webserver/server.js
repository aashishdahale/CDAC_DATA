//require is a inbuilt function is used to import moduel

var  http=require('http');


//Request handler
var onReceive=function(request, response){


    //console.log(request);

    response.write("<h1>Online shopping site</h1>");
    response.write("<hr/>");
    response.write("<ol>"+
                "<li>cloths</li>"+
                "<li>footwears</li>"+
                "<li>grocery</li>"+
                "</ol>");
    
    response.end();


   // console.log(response);
}

//Creates a http server
var server=http.createServer(onReceive);
//Keep server in listening mode
server.listen(4000);
console.log("server is listening on port 4000");