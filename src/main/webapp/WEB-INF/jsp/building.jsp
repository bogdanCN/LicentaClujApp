<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Building</title>
</head>
<body>
	<h1>Building</h1>
	<form:form action="building.do" method="POST" commandName="building">
		<table>
			<tr>
				<td>Building id</td>
				<td><form:input path="idBuilding" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="nameBuilding" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:input path="adress" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><form:input path="description" /></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" name="action" value="Add" />
					<input type="submit" name="action" value="Update" />
					<input type="submit" name="action" value="Delete" />
					<input type="submit" name="action" value="Search" />
				</td>
			</tr>
		</table>
	</form:form>
	<br>
	<table border="1">
		<th>Id</th>
		<th>Name</th>
		<th>Address</th>
		<th>Description</th>
	
		<c:forEach items="${buildingList}" var="building">
			<tr>
				<td>${building.idBuilding }</td>
				<td>${building.nameBuilding }</td>
				<td>${building.adress }</td>
				<td>${building.description }</td
			</tr>
		</c:forEach>
	</table>
</body>
</html>