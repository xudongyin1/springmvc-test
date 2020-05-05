<%--
  User: win10
  Date: 2020/4/29
  Time: 17:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.user}
<hr>
${sessionScope.user}
<hr>
${applicationScope.user}
</body>
</html>
