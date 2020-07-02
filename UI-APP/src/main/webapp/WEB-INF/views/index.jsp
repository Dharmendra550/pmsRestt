<br>
<br>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2 style="border:2px solid cyan; color:indigo;">
<c:if test="${message ne null }">
<c:out value="${message}"/>
</c:if>
</h2>
<br>
1.New Customer<a href="registerPage">SignUp</a><br>
2.Existing Customer<a href="loginPage">SignIn</a>