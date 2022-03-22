<%--
  Created by IntelliJ IDEA.
  User: wq
  Date: 2022/3/18
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pub</title>
</head>
<body>
<%
    String base = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
            request.getContextPath()+"/";
    request.setAttribute("base",base);
%>
</body>
</html>
