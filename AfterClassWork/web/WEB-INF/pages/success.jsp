<%--
  Created by IntelliJ IDEA.
  User: wq
  Date: 2022/3/18
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页面</title>
</head>
<body>
    <h3>登录成功!</h3>
    用户信息如下:
    ${user.id}  ${user.userName}  ${user.userPassword}  ${user.gender}  ${user.birthday}  ...
</body>
</html>
