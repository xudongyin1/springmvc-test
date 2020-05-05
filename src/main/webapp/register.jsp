<%--
  User: win10
  Date: 2020/5/2
  Time: 22:13
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form:form modelAttribute="person" method="post" action="/register ">
       用户姓名：<form:input path="username"/><form:errors path="username"></form:errors><br>
       密码：<form:input path="password"/><form:errors path="password"></form:errors><br>
       邮箱：<form:input path="email"/><form:errors path="email"/><br>
       电话：<form:input path="phone"/><form:errors path="phone"></form:errors><br>
       <input type="submit" value="登录">
   </form:form>
</body>
</html>
