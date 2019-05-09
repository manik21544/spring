<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style type="text/css">
	.errors{color:red}
</style>
</head>
<body>
<h1>Student Form</h1>
<br><br>
	<form:form modelAttribute="student" action="processForm" method="POST">
		<form:hidden path="id"/>
		First Name :<form:input path="firstName"/>
		<br><br>
		Last Name :<form:input path="lastName"/>
		<br><br>
		Passes :<form:input path="passes"/>
		<form:errors path="passes" class="errors"></form:errors>
		<br><br>
		<button type="submit">Submit</button>
		<br><br>
	</form:form>
</body>
</html>