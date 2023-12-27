<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./NewFile.css">
</head>
<body>
<% String msg = (String) request.getAttribute("msg");

if(msg!=null){%>
<script type="text/javascript">
function msg(){
	alert("Data Added");
}
msg();
</script>
<%} %>
<div>
<form action="AddStationary1" method="post">
<table class="table1">
<tr>
<td><label>Enter item name</label></td>
<td><input type="text" name="item" id="item"></td>
</tr>
<tr>
<td><label>Enter item count</label></td>
<td><input type="number" name="count" id="count"></td>
</tr>
<tr>
<td><label>Enter item unit</label></td>
<td><input type="text" name="unit" id="unit"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="submit"></td>
</tr>
</table>
</form>
<table class="table3">
    <form action="./addItem.jsp">
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