<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<form:form action="updateEmployee" method="post" modelAttribute="emp">
<body bgcolor="yellow">
<table bgcolor="purple">
<tr>
 <td>Empno</td>
 <td><form:input   path="empno" readonly="true"/></td> 
</tr> 

<tr>  
<td>Empname</td>
 <td><form:input   path="empname"/></td>
</tr>

<tr>
<td>salary</td>
<td><form:input   path="sal"/></td>
</tr>
        
 <tr>
<td>Deptno</td>
<td> <form:input   path="deptno"/></td>
</tr>   
      
   <tr>
       <td  colspan="2"  align="center">
          <input  type="Submit"  value="UPDATE">  
       </td>    
  </tr>
  </table>
  </body>
  </form:form>