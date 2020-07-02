<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="saveHotel" method="post" modelAttribute="ehModel">
<table border="1" height="1000" width="1000">
<tr>
<td>hotelid</td>
<td><form:input path="hotelid"/></td><br>
</tr>

<tr>
<td>location</td>
<td><form:input path="location"/></td><br>
</tr>

<tr>
<td>roomno</td>
<td><form:input path="roomno"/></td><br>
</tr>

<tr>
<td>cost</td>
<td><form:input path="cost"/></td><br>
</tr>

<tr>
<td>rating</td>
<td><form:input path="rating"/></td><br>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Register">
</td>
</tr>
</table>
</form:form>