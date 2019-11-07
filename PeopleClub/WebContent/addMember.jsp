<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="http://localhost:9090/PeopleClub/AddMemberController">
Enter your ID: <input type="number" name="id" width="100px">
<br><br>

Enter your First Name: <input type="text" name="fname" width="100px">
<br><br>
Enter your Last Name: <input type="text" name="lname" width="100px">
<br><br>

Enter your Date of Birth: <input type="text" name="dob" width="100px">
<br><br>
Enter the name of your City: <input type="text" name="city" width="100px">
<br><br>





<input type="submit" value ="Add Member" width="100px">
<br><br>
</form>
</center>

</body>
</html>