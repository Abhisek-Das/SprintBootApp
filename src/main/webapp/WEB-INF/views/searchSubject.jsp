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
<tr><th>Subject Id</th><th>Subject Title</th><th>Duration in Hours</th></tr> 

   <tr>  
   <td>${subject.subjectId}</td>  
   <td>${subject.subtitle}</td>  
   <td>${subject.durationInHours}</td>  
   
   </tr>  
    
   </table>

 </body>
</html>