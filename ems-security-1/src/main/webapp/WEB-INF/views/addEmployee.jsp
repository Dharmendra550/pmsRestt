<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="saveEmployee" method="post" modelAttribute="emodel">
<body bgcolor="yellow">
<table bgcolor="purple" height="600" width="600" align="center">

<tr>
  <td><font size=10>Empno</font></td>
  <td><form:input path="empno"/></td>
</tr>  

<tr>
  <td><font size=10>Empname</font></td>
  <td><form:input path="empname"/></td>
</tr>  

<tr>
  <td><font size=10>salary</font></td>
  <td><form:input path="sal"/></td>
</tr>  

<tr>
  <td><<font size=10>Deptno</font></td>
  <td><form:input path="deptno"/></td>
</tr>  

<tr>
<td colspan="2" align="center">
<input type="submit" value="SAVE">
</td>
</tr>
</table>
</body>
</form:form>