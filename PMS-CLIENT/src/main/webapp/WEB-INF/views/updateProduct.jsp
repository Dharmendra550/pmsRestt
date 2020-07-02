<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="update" method="post" modelAttribute="pbean2">
<body bgcolor="blue">
<table border=1 height=500 width=500>
<tr>
   <td>Productid:</td>
   <td><form:input path="productid"/></td><br>
</tr>
   
<tr>
   <td>Productname:</td>
   <td><form:input path="productname"/></td><br>
</tr>
   
<tr>
   <td>Price:</td>
   <td><form:input path="price"/></td><br>
</tr>

 <tr>
   <td>Manufacturer:</td>
   <td><form:input path="manufacturer"/></td><br>
</tr>

<tr>
<td colspan=2 align="center">
<input type="submit" value="submit">
</td>
</tr>
</table>
</body>
</form:form>