<html>
<head>
  <title>Login Validation</title>
</head>
<body>
  <h2 align="center">Log in Validation</h2>

  <%
     String str1=request.getParameter("t1");
     String str2=request.getParameter("t2");
     String message = "";

     if(str1.equalsIgnoreCase("snrao") && str2.equals("java"))
     {
       message = "Your Login is Successful";
     }
     else
     {
       message = "Sorry, your Login is Failed";
     }
  %>

  <h3 align="center"><%= message %></h3>
</body>
</html>
