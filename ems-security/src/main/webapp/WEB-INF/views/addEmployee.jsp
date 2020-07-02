<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="saveEmployee" method="post" modelAttribute="emodel">
<body bg color="yellow">
<table bgcolor="purple">
<tr>
<td>Empno</td>
<td><form:input  path="empno"/></td>
</tr>

<tr>
<td>Empname</td>
<td><form:input  path="empname"/></td>
</tr>

<tr>
<td>Salary</td>
<td><form:input  path="sal"/></td>
</tr>

<tr>
<td>Deptno</td>
<td><form:input  path="deptno"/></td>
</tr>

<td colspan="3" allign="center">
<input type="submit" value="SAVE">
</td>
</table>
</body>
</form:form>