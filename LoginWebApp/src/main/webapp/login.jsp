<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
${logonerror}
<form action="login" method="get">
<input type="text" name="username" placeholder="Enter User Name">
<input type="password" name="password" placeholder="Enter Password">
<input type="submit" value="submit">
</form>

</body>
</html>