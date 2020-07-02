<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="red">
<h2 style="border:2px solid green; color:white; width:500px;">
<c:if test="${message ne null}">
<c:out value="${message}">
</c:out>
</c:if>
</h2>

<br>
1.<a href="addEmployee"><font size=10>Add Employee</font></a><br>

2.<a href="listEmployees"><font size=10>List Employees</font></a>
</body>

<br>
<a href="logoutMe"><font size=10>Logout</font></a>