<%--
  Created by IntelliJ IDEA.
  User: wq
  Date: 2022/3/18
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<jsp:include page="pub.jsp"></jsp:include>
base:${base}
    <form action="${base}/user/login" method="post">
        用户名:  <input type="text" name="userName"><br>
        密码:  <input type="password" name="userPassword"><br>
        性别:  <input type="radio" name="gender">男  <input type="radio" name="gender">女<br>
        地址:  <input type="text" name="address"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
