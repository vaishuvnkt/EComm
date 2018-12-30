<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:errors path="category1.*"/>
<form action="${pageContext.request.contextPath}/addcategory" method="POST">

Category Name: <input type="text" name="cName"/>

Category Type: <input type="text" name="cType"/>

<input type="submit" value="Submit"/>

</form>

</body>
</html>