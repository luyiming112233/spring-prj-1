<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/9
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>签到系统管理员端</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">签到系统管理员端</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">学生信息</a></li>
            <li class="layui-nav-item"><a href="">教师信息</a></li>
            <li class="layui-nav-item"><a href="">签到信息</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;addStudent.jsp">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    姓名<%--JWW:登录后显示姓名--%>
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出<%--JWW:实现退出功能--%></a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">信息插入</a>
                    <dl class="layui-nav-child">
                        <dd><a href="addStudent.jsp">添加学生</a></dd>
                        <dd><a href="javascript:;">批量添加</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">信息查询</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">学号查询</a></dd>
                        <dd><a href="javascript:;">姓名查询</a></dd>
                        <dd><a href="javascript:;">班级查询</a></dd>
                        <dd><a href="javascript:;">专业查询</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <div class="layui-text" style="font-size: 25px; color: #393D49;width: 400px;height: 50px;padding: 25px;">
            按班级查找学生</div>

    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="../layui/layui.all.js"></script>
<script>
    ;!function(){
        //无需再执行layui.use()方法加载模块，直接使用即可
        var form = layui.form
            ,layer = layui.layer;

        //…
    }();
</script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>
