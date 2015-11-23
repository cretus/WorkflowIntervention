<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
  
  

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html  >
<head>
  
 
 
 
 
 
 
 

 
 
 
 
 
 
 
 
	<title> ListeInterventions </title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
		body{background-color: Pale sky;}
            .login{padding-top: 65px;}
            .center{float: none; margin-left: auto; margin-right: auto;}
	</style>
	
	
	
	<link rel="stylesheet" href="<c:url value="/resources/components/css/bootstrap.min.css"/>">
  <link rel="stylesheet" href="<c:url value="/resources/components/css/bootstrap-theme.min.css"/>">
  <script src="<c:url value="/resources/js/AdminServiceUrgence.js"/>" type="text/javascript"></script>
  <script src="<c:url value="/resources/components/js/bootstrap.min.js"/>" type="text/javascript"></script>
  <script src="<c:url value="/resources/components/js/angular/angular.min.js"/>" type="text/javascript"></script>
 

<script  type ="text/javascript">


function TimedRefresh(t){
	setTimeout("location.reload(true);",t)
}
</script>







</head>
<body  style ="text-align: center;background-color: #F7F7F6;padding-top: 65px;float: none; margin-left: auto; margin-right: auto;" onload ="JavaScript: TimedRefresh(10000);">


  	 
  





<h1 style="text-align:Center;"> Etape du Parcours </h1>

<font face="verdana" size="2">
Date Actuelle :<%= new java.util.Date() %>
</font>

<!--   Main container -->
<c:url var="addAction" value="/parcours/test">   </c:url>

<form:form action="${addAction}" commandName="parcours">

<div class="score">
 
 <table class="table table-bordered" >
 
 <thead>
 <tr>
        
         <th> IDWorkflowStep</th>
         <th> FirstStep</th>
         <th> SecondStep</th>
         <th> ThirdStep</th>
         <th> FourStep</th>
         <th> FiveStep</th>
        
    </tr>
   <tr>
    <td><c:out value= "${contact.idworkflow_step}"/></td> 
    <td><c:out value= "${contact.firstStep}"/></td>
    <td><c:out value= "${contact.secondStep}"/></td>
    <td><c:out value= "${contact.thirdStep}"/></td>
    <td><c:out value= "${contact.fourStep}"/></td>
     <td><c:out value= "${contact.fiveStep}"/></td>     
   
   </tr>
 </thead>
 </table>
</div>
</form:form>

</body>
</html>

