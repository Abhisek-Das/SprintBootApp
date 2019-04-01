<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Book Id</th><th>Title</th><th>Price</th><th>Volume</th><th>Publish Date</th></tr> 

<c:forEach var="bk" items="${list}">   
   <tr>  
   <td>${bk.bookId}</td>  
   <td>${bk.title}</td>  
   <td>${bk.price}</td>  
   <td>${bk.volume}</td>  
   <td>${bk.publishDate}</td> 
   </tr>  
   </c:forEach>  
   </table>

 
</body>
</html>