<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>learn springmvc</title>
</head>

<body>
    <a href="welcome">First SpringMVC - {默认请求方式为get | 请求地址：方法映射}</a>
    <br><br>

    <a href="controller/welcome2">SpringMVC - {默认请求方式为get | 请求地址：类映射+方法映射}</a>
    <br><br>

    <form action="controller/welcome3" method="post">
        <input type="submit" value="POST请求方式">
    </form>
    <br>

    POST请求方式，且name=23、age!=18<br>
    <form action="controller/welcome4" method="post">
        name:<input name="name">
        age:<input name="age">
        <input type="submit" value="POST请求方式">
    </form>

    <br>
    ant风格的请求路径：<br>
    ?  单字符<br>
    *  任意字符<br>
    ** 任意目录<br>
    <a href="controller/welcome4/abc/test">
        ant风格的请求路径：controller/welcome4/任意字符/test
    </a>
    <br><br>

    通过@PathVariable获取动态参数：<br>
    <a href="/controller/welcome5/zs">
        前端参数表示方法：类的映射路径/方法的映射路径/参数值
        请求完成后到控制台查看接收的参数值
    </a>
    <br>

</body>

</html>