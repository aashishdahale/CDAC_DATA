<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product Data</h1>
<table>
<tr>
<th>Product Id</th>
<th>Name</th>
<th>Quantity</th>
<th>Price</th>
<th>Action</th>
</tr>
<c:forEach var="prod" items="${plist}">
   <tr>
   <td>${prod.pid}</td>
   <td>${prod.pname}</td>
   <td>${prod.qty}</td>
   <td>${prod.price}</td>
   <td><a href="deleteProduct/${prod.pid}">delete</a>/ <a href="editProduct/${prod.pid}">edit</a></td>
   </tr>

</c:forEach>


</table>
<a href="addproduct">Add product</a>
</body>
</html>