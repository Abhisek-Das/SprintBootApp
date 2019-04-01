<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>
<body>

<form:form modelAttribute="book" action="saveBook" method="post">
      <label >Book Id: </label>
      <form:input path="bookId"  />
      <br/>

      <label >Title: </label>
      <form:input path="title" />
      <br/>

      <label >Price: </label>
      <form:input path="price"  />
      <br/>

      <label >Volume: </label>
     <form:input path="volume" />
      <br/>
      
      <label >Publish Date: </label>
     <form:input path="publishDate" />
      <br/>
      
      <input type="submit" value="Submit" />
    </form:form>


 </body>
</html>