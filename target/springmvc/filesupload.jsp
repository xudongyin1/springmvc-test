<%--
  User: win10
  Date: 2020/5/2
  Time: 10:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/file/uploads" method="post" enctype="multipart/form-data">
    file1:<input type="file" name="imgs"><br>
    file2:<input type="file" name="imgs"><br>
    file3:<input type="file" name="imgs"><br>
    <input type="submit" value="上传">
</form>
<a:forEach items="${files}" var="file">
    <img src="${file}" width="300px">
</a:forEach>
</body>
</html>
