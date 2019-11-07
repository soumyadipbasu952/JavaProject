<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.Mini.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	ArrayList<Member> list=(ArrayList)session.getAttribute("userList");

if(list.isEmpty())
{
	
%>
No records found
<% 
}
else
{
%>
<table border="1px">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Date of Birth</th>
		<th>City</th>
	</tr>
	
<%
	for(Member m:list)
	{
%>
<tr>
		<td><a href="http://localhost:9090/PeopleClub/fetchUserController?id=<%= m.getId()%>"><%= m.getId() %></a></td>
		<td><%= m.getFname() %></td>
		<td><%= m.getLname() %></td>
		<td><%= m.getDob() %></td>
		<td><%= m.getCity() %></td>
</tr>

<% 
	}
%>
	
</table>
<%
}
%>

</body>
</html>