<%--
  User: win10
  Date: 2020/5/2
  Time: 18:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="account" action="/login" method="post">
    姓名：<form:input path="name"/><form:errors path="name"></form:errors><br>
    密码：<form:input path="password"/><form:errors path="password"></form:errors><br>
    <input type="submit" value="登录">
</form:form>
</body>
</html>
