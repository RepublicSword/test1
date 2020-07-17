<%--
  Created by IntelliJ IDEA.
  User: Redtrees
  Date: 2020/7/16
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Welcome to here</title>
</head>
<body>
<form action="/order-web/HimilyServlet" method="Post">
    用户名：<input type="text" value="请输入用户名" name="user" size="20px"><br>
    密码：<input type="password" value="请输入密码" name="pswd" size="20px"><br>

    <input type="submit" value="提交" size="10px">
</form>
</body>
</html>