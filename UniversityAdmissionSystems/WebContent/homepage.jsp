<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<form action="offered.obj" >
<table align="center">
<tr>
	<td>Enter your desired university</td>
 	<td>
 		<select id="universityName" name="universityName">
		<option> </option>
		<c:forEach items="${list}" var="list">
			<option><c:out value="${list}">${list}</c:out></option>
		</c:forEach>
		</select>
	</td>
	<td><input type="submit" value="Submit"/></td>
</tr>

</table>
</form>
</body>
</html>