<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<br>
<a href="addEmployee">AddNewEmployee</a>
<body bgcolor="orange">
<table border="1">
<tr>
   <th>EmpNo</th>
   <th>EmpName</th>
   <th>SALARY</th>
   <th>DEPTNO</th>
   <th>ACTIONS</th>
</tr>
<c:if test="${!empty employees }">
<c:forEach items="${employees }" var="e">
<tr>
<td><c:out value="${e.empno }"/></td>
<td><c:out value="${e.empname }"/></td>
<td><c:out value="${e.sal }"/></td>
<td><c:out value="${e.deptno }"/></td>
<td>
<a href="editEmployee?id=${e.empno }"><img src="download.png" height="40" width="40"></a>
&nbsp; &nbsp; &nbsp; &nbsp;
<a href="deleteEmployee?id=${e.empno }"><img src="images.jpg" height="40" width="40"></a>
</td>
</tr>
</c:forEach>
</c:if>
</table>
</body>


<br>
<a href="logoutMe"><font size=50>Logout</font></a>