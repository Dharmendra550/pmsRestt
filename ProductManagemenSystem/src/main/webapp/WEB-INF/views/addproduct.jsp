<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="saveProduct" method="post" modelAttribute="epmodel">
<table border="1" height="500" width="500">
<tr>
 <td>productid</td>
 <td><form:input   path="productid"/></td> 
</tr> 

<tr>  
<td>productname</td>
 <td><form:input   path="productname"/></td>
</tr>

<tr>
<td>price</td>
<td><form:input   path="price"/></td>
</tr>
        
 <tr>
<td>discount</td>
<td> <form:input   path="discount"/></td>
</tr>   
      
   <tr>
       <td  colspan="2"  align="center">
          <input  type="Submit"  value="save">  
       </td>    
  </tr>
  </table>
  </form:form>