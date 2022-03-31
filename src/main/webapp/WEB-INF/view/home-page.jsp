
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Music</title>
</head>
<body>
	<table>
		<c:forEach var="tempMusic" items="${musics}">
			<tr>
				<td>${tempMusic.id}</td>
				<td>${tempMusic.name}</td>
				<td>${tempMusic.description}</td>
			</tr>


		</c:forEach>
	</table>

</body>
</html>