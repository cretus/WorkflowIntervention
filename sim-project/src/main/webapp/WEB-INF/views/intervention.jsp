<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Intervention</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Intervention 
</h1>
<a href="<c:url value='/operators' />" >Log out</a>
<c:url var="addAction" value="/intervention/add" ></c:url>

<form:form action="${addAction}" commandName="intervention">
<table>
<c:if test="${!empty intervention.cityDeparture}">
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
</c:if>
<c:if test="${empty intervention.cityDeparture}">
	<tr>
		<td>
			<form:label path="wording">
				<spring:message text="Wording"/>
			</form:label>
		</td>
		<td>
			<form:textarea path="wording" rows="5" cols="30" />
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="estateIntervention">
				<spring:message text="Intervention estate"/>
			</form:label>
		</td>
		<td>
			<form:input path="estateIntervention" size="20" value="Signalized" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="statePatient">
				<spring:message text="Patient state"/>
			</form:label>
		</td>
		<td>
			<form:select path="statePatient" >
				<form:option value="normal">Normal</form:option>
				<form:option value="urgent">Urgent</form:option>
				<form:option value="critical">Critical</form:option>
			</form:select>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="addressIntervention">
				<spring:message text="Address"/>
			</form:label>
		</td>
		<td>
			<form:input path="addressIntervention" size="40" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="cityDeparture">
				<spring:message text="City"/>
			</form:label>
		</td>
		<td>
			<form:select path="cityDeparture" >
				<c:forEach items="${listCity}" var="city">
					<form:option value="${city.nameCity}">${city.nameCity}</form:option>
				</c:forEach>
			</form:select>
		</td> 
	</tr>
</c:if>
<c:if test="${!empty intervention.cityDeparture}">
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
			<form:label path="idSector">
				<spring:message text="Sector number"/>
			</form:label>
		</td>
		<td>
			<form:input path="idSector" readonly="true" />
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
			<form:input path="estateIntervention" size="20" value="Signalized" readonly="true" />
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
				<spring:message text="City"/>
			</form:label>
		</td>
		<td>
			<form:input path="cityDeparture" size="40" readonly="true" />
		</td> 
	</tr>
	<tr>
		<td>
		</td>
		<td>
			<spring:message text="Vehicle choice"/>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="vehicleIntervention">
				<spring:message text="Intervention vehicle"/>
			</form:label>
		</td>
		<td>
		<c:if test="${empty intervention.vehicleIntervention}">
			<form:select path="vehicleIntervention" >
				<c:forEach items="${listCars}" var="car">
					<form:option value="${car.matriculation}">Matricualtion : ${car.matriculation} --- Equipment : ${car.equipment} --- Location : ${car.addressName}</form:option>
				</c:forEach>
			</form:select>
		</c:if>
		<c:if test="${!empty intervention.vehicleIntervention}">
			<form:input path="vehicleIntervention" size="40" readonly="true" />
		</c:if>
		</td> 
	</tr>
	<c:if test="${intervention.vehicleResponse == 'OK'}">
	<tr>
		<td>
			Response : 
		</td>
		<td>
			Vehicle confirmed
		</td> 
	</tr>
	</c:if>
	<c:if test="${intervention.vehicleResponse == 'KO'}">
	<tr>
		<td>
			Response : 
		</td>
		<td>
			Vehicle not available
		</td> 
	</tr>
	</c:if>
</c:if>
	<tr>
		<td colspan="2">
		<c:if test="${intervention.vehicleResponse == 'N'}">
			<c:if test="${!empty intervention.cityDeparture}">
				<input type="submit"
					value="<spring:message text="Demand vehicle"/>" />
			</c:if>
		</c:if>
		<c:if test="${intervention.vehicleResponse == 'KO'}">
			<c:if test="${!empty intervention.cityDeparture}">
				<input type="submit"
					value="<spring:message text="Demand vehicle"/>" />
			</c:if>
		</c:if>
		<c:if test="${empty intervention.vehicleResponse}">
			<c:if test="${empty intervention.cityDeparture}">
				<input type="submit"
					value="<spring:message text="Search vehicle"/>" />
			</c:if>
		</c:if>
		<c:if test="${intervention.vehicleResponse == 'OK'}">
			<a href="<c:url value='/interventions' />" >Retour</a>
		</c:if>
		</td>
	</tr>
</table>	
</form:form>
<h3>Intervention list for sector number ${variable} : <a href="<c:url value='/visualisermap/' />" >Visualiser MAP</a></h3>

	<table class="tg">
	<tr>
		<th width="40">Interventions</th>
		<th width="60">Estate</th>
		<th width="120">Wording</th>
		<th width="40">City departure</th>
		<th width="80">Address</th>
		<th width="40">Vehicle</th>
		<th width="40">Delete</th>
		<th width="40">Intervention card</th>
		<th width="40"> Etat du Parcours</th>
	</tr>
	<c:forEach items="${listIntervention}" var="intervention">
	
		<tr>
			<td>${intervention.idIntervention}</td>
			<td>${intervention.estateIntervention}</td>
			<td>${intervention.wording}</td>
			<td>${intervention.cityDeparture}</td>
			<td>${intervention.addressIntervention}</td>
			<td>${intervention.vehicleIntervention}</td>
			<td><a href="<c:url value='/delete/${intervention.idIntervention}' />" >Delete</a></td>
			<td><a href="<c:url value='/interventionCard/${intervention.idIntervention}' />" >Details</a></td>
		 <td>	<a href="<c:url  value ="/parcours/test ?id=${intervention.idAll_Interventions}"/>">Suivre Trajet</a> </td>
		</tr>
		
	</c:forEach>
	</table>

<br>
</body>
</html>
