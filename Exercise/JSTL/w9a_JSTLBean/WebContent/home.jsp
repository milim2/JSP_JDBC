<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Home Page</title>
<style>
 table, th, td{
  border: 1px solid black;
 }
</style>
</head>
<body>
	
	<%-- Using JSTL forEach and out to loop a list and display items in a table --%>
	<table>
		<tbody>
		<tr><th>ID</th><th>Name</th><th>Role</th></tr>
		<c:forEach items="${requestScope.empList }" var="emp">		
			<tr><td><c:out value="${emp.id }"></c:out></td>
				<td><c:out value="${emp.name }"></c:out></td>
				<td><c:out value="${emp.role }"></c:out></td></tr>
		</c:forEach>		
		</tbody>		
	</table>
	<br>
	<table>
		<tbody>
		<tr><th>Make</th><th>Model</th><th>Year</th><th>AIAssistant</th></tr>
		<c:forEach items="${requestScope.hcarList }" var="hcar">		
			<tr><td><c:out value="${hcar.make }"></c:out></td>
				<td><c:out value="${hcar.model }"></c:out></td>
				<td><c:out value="${hcar.year }"></c:out></td>
				<td><c:out value="${hcar.aiassistant }"></c:out></td></tr>
		</c:forEach>		
		</tbody>		
	</table>
	<br>
	<%-- c:catch example : catch divide by 0 exception (is, JAVA try/catch) --%>
	<c:catch var="exception1">
	<!--  java divide by 0 exception -->
	<% int x = 5/0; %>
	</c:catch>
	
	<c:if test="${exception1 ne null }">
	<p> Exception1 is : ${exception1 }<br>
	Exception Messages: ${exception1.message }</p>
	</c:if>
	<br>
	<c:catch var="exception2">
	<!-- Java array index out of Bounds exception -->
	<%
		int[] nums = new int[3];
		for(int val = 0; val < 5; val++) {
		 System.out.println("value is: " + nums[val]);
		 }		
	 %>
	</c:catch>
	<c:if test="${exception2 ne null }">
	<p> Exception2 is : ${exception2 }<br>
		Exception Messages: ${exception2.message }</p>
	</c:if>	
	<br>
	<br>
	<%-- c:url JSTL Core example : uses the URL sent by servlet url attributes --%>
	<a href="<c:url value="${requestScope.url }"></c:url>">Google Search</a>
	<br>
	<!-- <a href="<c:url value="${requestScope.url }"></c:url>">Sheridan FAST</a> -->
	
	
</body>
</html>