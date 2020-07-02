<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body bgcolor="light-grey">
<c:if test="${errMessage ne null }">
<h2 style="border:2px solid red"; color:blue; width:"200px">
<c:out value="${errormessage }">
</c:out>
</h2>
</c:if>
<form action="doLogin" method="post">
<table bgcolor="yellow">
<tr>
<td>UserName</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="SignIn">
</td>
</tr>
</table>
</form>
</body>
</html>