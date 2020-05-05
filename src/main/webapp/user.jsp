<%--
  User: win10
  Date: 2020/4/26
  Time: 17:15
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
       <form action="/hello/save" method="post">
           用户ID：<input type="text" name="id"><br>

           用户名：<input type="text" name="name"><br>
           用户地址：<input type="text" name="address.name"><br/>
           <input type="submit" value="提交">

       </form>

</body>
</html>
