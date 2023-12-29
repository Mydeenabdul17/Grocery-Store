<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./adminLogin.css">
<script type="text/javascript">
	function validate() {
		if (document.getElementById('userid').value == "thala") {

		} else {
			alert("Please enter correct user id");
			return false;
		}
		if (document.getElementById('password').value == "thala123") {

		} else {
			alert("Please enter correct password");
			return false;
		}
	}
</script>
</head>
<body>
	<div>
		<form action="./adminOptions.jsp" onsubmit="return validate()">
			<fieldset style="border: none;">
				<table>
					<tr>
						<td><label>User ID</label></td>
						<td><input type="text" name="userid" id="userid"></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><input type="text" name="password" id="password"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" class="submit"></td>
					</tr>
				</table>
			</fieldset>
		</form>
		<table style="padding-top: 10px;">
			<tr>
				<form action="./open.jsp">
					<td colspan="2" class="td" style="padding-top: 0px"><input
						type="submit" class="submit" value="Back"
						style="width: 100px; height: 40px; border-radius: 5px; margin-left: 113px">
					</td>
				</form>
			</tr>
		</table>
	</div>
</body>
</html>