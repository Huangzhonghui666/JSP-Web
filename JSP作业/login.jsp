<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录</title>
</head>
<body>
<h1>登录</h1>

<%
  String message = (String) request.getAttribute("message");
  if (message != null) {
    out.print("<p style='color:red'>" + message + "</p>");
  }
%>

<form action="login" method="post">
  用户名：<input type="text" name="username"><br>
  密码：<input type="password" name="password"><br>
  <button type="submit">登录</button>
</form>

<br>
<a href="register.jsp">去注册</a>
</body>
</html>