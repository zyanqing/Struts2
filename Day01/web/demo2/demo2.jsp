<%--
  Created by IntelliJ IDEA.
  User: anjubao
  Date: 2019/2/19
  Time: 下午2:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Action类的编写</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/actiondemo1.action">Action的编写方式一：Action类是一个POJO的类</a>

<br>

<a href="${pageContext.request.contextPath}/actiondemo2.action">Action的编写方式二：实现一个Action的接口</a>

<br>

<a href="${pageContext.request.contextPath}/actiondemo3.action">Action的编写方式三：Action类继承ActionSupport类</a>

</body>
</html>

