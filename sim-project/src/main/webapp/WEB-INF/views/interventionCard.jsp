<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Intervention card</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Intervention card
</h1>
<a href="<c:url value='/interventions' />" >Retour</a>
<form:form action="/" commandName="intervention">
<table>
	<tr>
		<td>
			<form:label path="idIntervention">
				<spring:message text="Intervention Number"/>
			</form:label>
		</td>
		<td>
			<form:input path="idIntervention" readonly="true" size="8"  disabled="true" />
			<form:hidden path="idIntervention" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="wording">
				<spring:message text="Wording"/>
			</form:label>
		</td>
		<td>
			<form:textarea path="wording" rows="5" cols="30" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="date">
				<spring:message text="Date"/>
			</form:label>
		</td>
		<td>
			<form:input path="date" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="estateIntervention">
				<spring:message text="Intervention estate"/>
			</form:label>
		</td>
		<td>
			<form:input path="estateIntervention" size="20" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="statePatient">
				<spring:message text="Patient state"/>
			</form:label>
		</td>
		<td>
			<form:input path="statePatient" size="20" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="addressIntervention">
				<spring:message text="Address"/>
			</form:label>
		</td>
		<td>
			<form:input path="addressIntervention" size="40" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="cityDeparture">
				<spring:message text="City departure"/>
			</form:label>
		</td>
		<td>
			<form:input path="cityDeparture" size="40" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="cityArrival">
				<spring:message text="City arrival"/>
			</form:label>
		</td>
		<td>
			<form:input path="cityArrival" size="40" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="vehicleIntervention">
				<spring:message text="Intervention vehicle"/>
			</form:label>
		</td>
		<td>
			<form:input path="vehicleIntervention" size="40" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="hospitalIntervention">
				<spring:message text="Intervention hospital"/>
			</form:label>
		</td>
		<td>
			<form:input path="hospitalIntervention" size="40" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="idSector">
				<spring:message text="Sector number"/>
			</form:label>
		</td>
		<td>
			<form:input path="idSector" size="40" readonly="true" />
		</td> 
	</tr>
</table>	
</form:form>
<br>
</body>
</html>
