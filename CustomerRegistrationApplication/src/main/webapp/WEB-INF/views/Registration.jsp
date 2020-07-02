<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if  test="${message ne null}">
     <c:out  value="${message}"/>
  </c:if>
<form:form action="saveUser" method="post" modelAttribute="customer">
<Table bgcolor="yellow" height="20" width="30" align="center">
   <tr>
      <td>FirstName:</td>
      <td><form:input path="firstname"/></td>
      <td><form:errors path="firstname"/></td>
   </tr>   
<tr>
      <td>LastName:</td>
      <td><form:input path="lastname"/></td>
      <td><form:errors path="lastname"/></td>
   </tr> 
   
   <tr>
      <td>Email:</td>
      <td><form:input path="email"/></td>
      <td><form:errors path="email"/></td>
   </tr> 
   
   <tr>
      <td>Password:</td>
      <td><form:input path="password"/></td>
      <td><form:errors path="password"/></td>
   </tr> 
    <tr>
      <td>Gender:</td>
      <td><form:radiobutton path="gender" label="male"/></td>
    </tr>
    <tr>
      <td><form:radiobutton path="gender" label="female"/></td>
    </tr>
      <tr>
      <td><form:radiobutton path="gender" label="other"/></td>
    </tr>
    <tr>
      <td><form:errors path="errors"/></td>
   </tr> 
    <tr>
          <td><form:select path="country"/></td>
          <td><form:option value="">---select country---</form:option></td>
          <td><form:options items="${customer.countries}"/></td>
           <td><form:errors path="country"/></td>
    </tr>
         <tr>
         <td colspan="3" align="center">
         <input type="submit" value="Register">
         </td>
    </tr>
          
</Table>
</form:form>