<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of students</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script>
	function confirmIt(){
		return confirm("Are You Sure");
	}
</script>
</head>
<body>
	<h1>List Of Students</h1>
	<a href="showFormForAdd" class="btn btn-primary">Add Student</a>
	<br>
	<table class="table">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Passes</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="temp" items="${students}">
			<tr>
				<td>"${temp.firstName}"</td>
				<td>"${temp.lastName}"</td>
				<td>"${temp.passes}"</td>
				<td>
				<a href="showFormForUpdate?theId=${temp.id}" class="btn btn-primary">Update</a>
				</td>
				<td>
				<a href="deleteStudent?theId=${temp.id}" class="btn btn-danger" onclick="return confirmIt()">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>