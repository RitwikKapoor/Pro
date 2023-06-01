<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%
// String id = request.getParameter("userid");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "studentbase";
String userid = "root";
String password = "new_password";
try {
	Class.forName(driver);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>
	<td>name</td>
	<td>roll no</td>
	<td>marks</td>
</tr>

<%
try{
	connection = DriverManager.getConnection(connectionUrl+database, userid, password);
	statement=connection.createStatement();
	String sql ="select * from student1";
	resultSet =statement.executeQuery(sql);
	while(resultSet.next()){
%>
	<tr>
		<td><%=resultSet.getString("name") %></td>
		<td><%=resultSet.getString("rollno") %></td>
		<td><%=resultSet.getString("marks") %></td>
	</tr>
<%
}
	connection.close();
} catch (Exception e) {
	e.printStackTrace();
}
%>
</table>
</body>
</html>
