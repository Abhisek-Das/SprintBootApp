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
<tr><th>Subject Id</th><th>SubTitle</th><th>DurationInHours</th></tr> 

<c:forEach var="subj" items="${list}">   
   <tr>  
   <td>${subj.subjectId}</td>  
   <td>${subj.subtitle}</td>  
   <td>${subj.durationInHours}</td>  
   </tr>  
   </c:forEach>  
   </table>

 
</body>
</html>