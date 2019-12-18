<%--
  Created by IntelliJ IDEA.
  User: anjubao
  Date: 2019/2/25
  Time: 下午8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet的API的访问</title>
    <h1>Struts2访问Servlet的API</h1>
    <h3>方式一：完成解耦合的方式</h3>
    <form action="${ pageContext.request.contextPath }/requestDemo1.action" method="post">
        姓名:<input type="text" name="name"/><br/>
        密码:<input type="password" name="password"><br/>
        <input type="submit" value="提交">
    </form>

    <h3>方式二：使用原生的方式访问</h3>
    <form action="${ pageContext.request.contextPath }/requestDemo2.action" method="post">
        姓名:<input type="text" name="name"/><br/>
        密码:<input type="password" name="password"><br/>
        <input type="submit" value="提交">
    </form>

    <h3>方式三：接口注入的方式</h3>
    <form action="${ pageContext.request.contextPath }/requestDemo3.action" method="post">
        姓名:<input type="text" name="name"/><br/>
        密码:<input type="password" name="password"><br/>
        <input type="submit" value="提交">
    </form>
</head>
<body>



</body>
</html>
