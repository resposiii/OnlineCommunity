<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/6 0006
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="u_register" method="post">
    <input type="text" name="username"/>
    <input type="text" name="password"/>
    <input type="number" min="1" max="200" name="age"/>
    <input type="radio" name="gender" value="男">男
    <input type="radio" name="gender" value="女">女
    <input type="submit" value="提交">
</form>
</body>
</html>
