<%--
  User: win10
  Date: 2020/4/28
  Time: 22:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="userlist" method="post">
    用户1编号：<input type="text" name="userList[0].id">
    用户1名字：<input type="text" name="userList[0].name">
    用户2编号：<input type="text" name="userList[1].id">
    用户2名字：<input type="text" name="userList[1].name">
    用户3编号：<input type="text" name="userList[2].id">
    用户3名字：<input type="text" name="userList[2].name">
    <input type="submit" value="提交">

</form>

</body>
</html>
