<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP EL Examples</title>
</head>
<body>
<%
	List<String> serverNames = new ArrayList<String>();
	serverNames.add("WebLogic - Oracle");
	serverNames.add("JBoss/Wildfly - Oracle");
	serverNames.add("Glassfish - Oracle");
	serverNames.add("webSphere - IBM");
	serverNames.add("Tomcat - Apache");
	serverNames.add("Resin");
	serverNames.add("Geronimo");
	
	pageContext.setAttribute("serverNames", serverNames);
 %>
 
 <strong>Simple EL Example : </strong>${requestScope.person}
 <br><br>
 <strong>Simple EL Example without Scope : </strong>${person}
 <br><br>
 
 
 <strong>Simple EL Example : </strong>${requestScope.employee}
 <br><br>
 <strong>Simple EL Example without Scope : </strong>${employee}
 <br><br>
 <strong>Simple EL Example without Scope : </strong>${address}
 <br><br>
 
 
 <strong>Simple Array[] EL Example : </strong>${applicationScope["User.Cookie"] }
 <br><br>
 <strong>Simple Multiple EL Example : </strong>${sessionScope.employee.address.address}
 <br><br>
 
 <strong>List EL Example : </strong><br>
 ${serverNames[0] };<br>
 ${serverNames[1] };<br>
 ${serverNames[2] };<br>
 ${serverNames[3] };<br>
 ${serverNames[4] };<br>
 ${serverNames[5] };<br>
 ${serverNames[6] };<br>
 <br><br> 
 
 <strong>Header Information EL Example : </strong>${header["Accept-Encoding"] };
  <br><br>
  
<Strong>Cookie EL Example : </Strong><br>
${cookie1.value}<br>
${cookie2.value}<br>
${cookie3.value}<br>
${cookies[0].value}<br>
${cookies[1].value}<br>
${cookies[2].value}<br>
${mycookies[0].value}<br>
${mycookies[1].value}<br>
${mycookies[2].value}<br>
<br><br>
 
 <Strong>pageContext EL Example :</Strong>${initParam.AppID };
 <br><br>
 <Strong>Arithmetic Operator EL Example :</Strong>${initParam.AppID + 200};
 <br><br>
  
 <Strong>Relational Operator EL Example :</Strong>${initParam.AppID < 200 };
 <br><br>
 
 <Strong>Arithmetic Operator EL Example :</Strong>${initParam.AppID - 20 };
 <br><br>
 
  <Strong>Math.PI Constant :</Strong>${initParam.PI };
 <br><br>
  <Strong>Math.E Euler Constant :</Strong>${initParam.Euler };
 <br><br>
 
 
 
 
 
 
</body>
</html>


