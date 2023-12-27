<%@page import="java.util.List"%>
<%@page import="com.superMarket.dto.Grocery"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./updateItems.css">
</head>
<body>
<% String msg = (String) request.getAttribute("msg");

if(msg!=null){%>
<script type="text/javascript">
function msg(){
	alert("Data Updated");
}
msg();
</script>
<%} %>
<%
List<Grocery> grocery = (List<Grocery>) request.getAttribute("list");
%>

<div class="div1">
<table border="1px" class="table1">
<tr class="row1">
<td>Id</td>
<td>Item</td>
<td>Count</td>
<td>Unit</td>
</tr>
<%
for(Grocery g:grocery){
%>
<tr>
<td class="col1"><%=g.getId() %></td>
<td><%=g.getItem() %></td>
<td class="col1"><%=g.getCount() %></td>
<td><%=g.getUnit() %></td>
</tr>
<%} %>
</table>
</div>

<div class="div2">
    <table class="table2">
    <form action="updateGrocery" method="post">
        <tr>
            <td><label>Enter item id</label></td>
            <td><input type="number" name="id" id="id"></td>
        </tr>
        <tr>
            <td><label>Enter item count</label></td>
            <td><input type="number" name="count" id="count"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" class="submit">
            </td>
        </tr>
    </form>
    </table>
    <table class="table3">
    <form action="./updateItem.jsp">
        <tr>
            <td colspan="2">
            <input type="submit" value="Back" class="submit">
            </td>
        </tr>
    </form>
    </table>
    
    
    </div>
</body>
</html>