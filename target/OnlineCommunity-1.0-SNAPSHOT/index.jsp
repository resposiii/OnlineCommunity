<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/3 0003
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="u_login" method="post">
    <input type="text" name="username"/>
    <input type="text" name="password"/>
    <input type="submit" value="提交"/>
</form>
<a href="register.jsp">注册</a>
<%--<form action="test" method="post">--%>
<%--    <input type="text" name="code">--%>
<%--    <img src="checkCode" alt="" width="100" height="32" class="passcode" style="height:43px;cursor:pointer;" onclick="this.src=this.src+'?'">--%>
<%--    <input type="submit" value="确定">--%>
<%--</form>--%>
</body>
</html>
