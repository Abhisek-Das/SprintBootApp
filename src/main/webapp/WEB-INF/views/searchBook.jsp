<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Book List</title>
</head>
<body>

<table border="2" width="70%" cellpadding="2">  
<tr><th>Book Id</th><th>Title</th><th>Price</th><th>Volume</th><th>Publish Date</th></tr> 

 <%-- <c:forEach var="book" items="${list}">   --%> 
   <tr>  
   <td>${book.bookId}</td>  
   <td>${book.title}</td>  
   <td>${book.price}</td>  
   <td>${book.volume}</td>  
   <td>${book.publishDate}</td> 
   </tr>  
    <%-- </c:forEach>   --%>
   </table>

 </body>
</html>