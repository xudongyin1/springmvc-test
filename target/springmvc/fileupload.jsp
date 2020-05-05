<%--
  User: win10
  Date: 2020/5/1
  Time: 19:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form action="file/upload" method="post" enctype="multipart/form-data">
     <input type="file" name="img">
       <input type="submit" value="上传">
       <input type="file" name="img">
       <input type="submit" value="上传">
   </form>
     <img src="${path}">
</body>
</html>
