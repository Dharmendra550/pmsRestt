<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border=1 color="indigo">
<tr>
   <th>PRODUCTID</th>
   <th>PRODUCTNAME</th>
   <th>PRICE</th>
   <th>MANUFACTURER</th>
 </tr>  
<c:forEach items="${products}" var="p">

<tr>
   <td><c:out value="${p.productid }"/></td>&nbsp; &nbsp;
    <td><c:out value="${p.productname}"/></td>&nbsp; &nbsp;
     <td><c:out value="${p.price}"/></td>&nbsp; &nbsp;
      <td><c:out value="${p.manufacturer}"/></td>&nbsp; &nbsp;
 </tr>   
 </c:forEach>  
</table>
