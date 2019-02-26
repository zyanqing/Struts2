<%--
  Created by IntelliJ IDEA.
  User: anjubao
  Date: 2019/2/26
  Time: 上午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%-- 需要将struts2引入进来 --%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
    <title>Struts2的数据封装</title>
</head>
<body>

<h1>Struts2的数据封装</h1>

<h3>方式一：属性驱动：提供set方法的方式</h3>
<form action="${pageContext.request.contextPath}/userAction1.action" method="post">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    年龄：<input type="text" name="age"/><br>
    生日：<input type="date" name="birthday"/><br>
    工资：<input type="text" name="salary"/><br>
    <input type="submit" value="提交">
</form>

<h3>方式二：属性驱动-在页面中提供表达式方式</h3>
<form action="${pageContext.request.contextPath}/userAction2.action" method="post">
    用户名：<input type="text" name="user.username"/><br>
    密码：<input type="password" name="user.password"/><br>
    年龄：<input type="text" name="user.age"/><br>
    生日：<input type="date" name="user.birthday"/><br>
    工资：<input type="text" name="user.salary"/><br>
    <input type="submit" value="提交">
</form>

<h3>方式三：模型驱动-模型驱动方式</h3>
<form action="${pageContext.request.contextPath}/userAction3.action" method="post">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    年龄：<input type="text" name="age"/><br>
    生日：<input type="date" name="birthday"/><br>
    工资：<input type="text" name="salary"/><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
