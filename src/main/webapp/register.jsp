<%--
  Created by IntelliJ IDEA.
  User: luyiming
  Date: 2018/12/3
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>register</title>
</head>
<body>
<s:form action="register" method="post">
    <s:textfield name="loginUser.account"  key="用户名"/>
    <s:password name="loginUser.password"  key="密码"/>
    <s:textfield name="loginUser.name" key="姓名"/>
    <s:submit value="注册"/>
    <s:reset value="清除"/>
</s:form>
</body>
</html>
