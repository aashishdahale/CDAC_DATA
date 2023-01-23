<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
      import="java.util.List, com.demo.beans.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  List<Product> plst= request.getAttribute("plist"); %>
<table border='2'>
<tr>
<th>Name</th>
<th>id</th>
<th>category</th>
</tr>
<%for( Product p:lst) %>

</table>
</body>
</html>