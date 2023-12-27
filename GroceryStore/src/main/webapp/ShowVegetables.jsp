<%@page import="java.util.List"%>
<%@page import="com.superMarket.dto.Vegetables"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./showItem.css">
<style type="text/css">
input:hover {
	box-shadow: 4px 4px 8px 4px rgb(151, 149, 149);
}
</style>
</head>
<body>
<%
List<Vegetables> vegetables = (List<Vegetables>) request.getAttribute("list");
%>

<div>
<table>
<tr class="row1">
<td>Id</td>
<td>Item</td>
<td>Count</td>
<td>Unit</td>
</tr>
<%
for(Vegetables v:vegetables){
%>
<tr>
<td class="col1"><%=v.getId() %></td>
<td><%=v.getItem() %></td>
<td class="col1"><%=v.getCount() %></td>
<td><%=v.getUnit() %></td>
</tr>
<%} %>
</table>
</div>
<form action="./showItem.jsp">
        <input type="submit" name="Back" id="submit" value="Back" style="width: 100px;
    height: 40px;
    border-radius: 5px;
    margin-top: 5%;
    margin-left: 47%;">
    </form>
</body>
</html>