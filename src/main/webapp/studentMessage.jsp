<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/7
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息页面</title>
</head>
<body>
    <s:form action="stuMessageUpdate" method="POST">
        <s:textfield name="student.stuID" key="学号"/>
        <s:textfield name="student.name" key="姓名"/>
        <s:textfield name="student.password" key="密码"/>
        <s:textfield name="student.classname" key="班级"/>
        <s:textfield name="student.departname" key="专业"/>
        <s:textfield name="student.email" key="邮箱"/>
        <s:submit value="修改"/>
    </s:form>
    <s:form action="stuMessageDelete" method="POST">
        <s:hidden name="stuID" value="%{student.stuID}"/>
        <s:submit value="删除"/>
    </s:form>
</body>
</html>
