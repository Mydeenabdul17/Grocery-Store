<%@page import="java.util.List"%>
<%@page import="com.superMarket.dto.Grocery"%>
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
List<Grocery> grocery = (List<Grocery>) request.getAttribute("list");
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
if(grocery!=null){
for(Grocery g:grocery){
%>
<tr>
<td class="col1"><%=g.getId() %></td>
<td><%=g.getItem() %></td>
<td class="col1"><%=g.getCount() %></td>
<td><%=g.getUnit() %></td>
</tr>
<%} }else{%>
<tr>
<td>No Products to Show</td>
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