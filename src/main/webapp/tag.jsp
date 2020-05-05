<%--
  User: win10
  Date: 2020/5/2
  Time: 15:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>学生信息</h1>
    <form:form modelAttribute="student">
        学生id：<form:input path="id"/><br>
        学生姓名：<form:input path="name"/><br>
        学生年龄：<form:input path="age"></form:input><br>
        checkbox:<form:checkbox path="flag"></form:checkbox><br>
<%--        爱好：<form:checkbox path="hobby" value="运动"/>运动<br>--%>
<%--        <form:checkbox path="hobby" value="看电影"/>看电影<br>--%>
<%--        <form:checkbox path="hobby" value="玩游戏"/>玩游戏<br>--%>
<%--        <form:checkbox path="hobby" value="听音乐"/>听音乐<br>--%>
<%--        <form:checkbox path="hobby" value="读书"/>读书<br>--%>
        爱好：<form:checkboxes path="selectHobby" items="${student.hobby}"></form:checkboxes><br>
        radio:<form:radiobutton path="radioId" value="2"></form:radiobutton><br>
        年级:<form:radiobuttons path="selectGrade" items="${student.grademap}"/><br>
<%--        所在城市：<form:select path="selectCity" items="${student.citiesmap}"/><br>--%>
<%--        所在城市：<form:select path="selectCity">--%>
<%--                      <form:options items="${student.citiesmap}"/>--%>
<%--                </form:select><br>--%>
        所在城市：<form:select path="selectCity">
                     <form:option value="1">杭州</form:option>
                     <form:option value="2">金州</form:option>
                     <form:option value="3">广州</form:option>
    </form:select><br>
        自我介绍：<form:textarea path="my" cssStyle="color: #ff0000"></form:textarea>


    </form:form>
</body>
</html>
