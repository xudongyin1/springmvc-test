<%--
  User: win10
  Date: 2020/4/29
  Time: 12:23
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.5.0.js"></script>
    <script type="text/javascript">
        $(function(){
            var user = {
                "id":1,
                "name":"张三"
            };
            $.ajax({
                url:"/json",
                data:JSON.stringify(user),
                type:"POST",
                contentType:"application/json;charset=UTF-8",
                dataType:"JSON",
                success:function(data){
                    console.log(data.id+"---"+data.name);
                }
            })
        });
    </script>
</head>
<body>

</body>
</html>
