<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户注册</title>
</head>
<body>
<h1>用户注册</h1>
<form action="register" method="post">
  用户名：<input type="text" name="username" required><br><br>

  密码：<input type="password" name="password" required><br><br>

  邮箱：<input type="email" name="email" required><br><br>

  性别：
  <input type="radio" name="gender" value="男" checked>男
  <input type="radio" name="gender" value="女">女<br><br>

  学号：<input type="text" name="studentId" required><br><br>

  出生日期：<input type="date" name="birth" required><br><br>

  电话号码：<input type="tel" name="phone" required><br><br>

  <button type="submit">注册</button>
</form>
</body>
</html>