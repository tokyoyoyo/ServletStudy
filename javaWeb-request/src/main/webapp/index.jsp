<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>
<body>
<h1>登录</h1>
<%--这里提交的路径，需要寻找到项目的路径--%>
<%--${pageContext.request.contextPath}代表当前的项目--%>
<div style="text-align:center">

<form action="${pageContext.request.contextPath}/login" method="Post">
     username <input name="username" type="text"> <br>
     password: <input name="password" type="password"> <br>
     hobbies:
     <input name="hobbies" type="checkbox" value="女孩">女孩
     <input name="hobbies" type="checkbox" value="代码">代码
     <input name="hobbies" type="checkbox" value="电影">电影
     <input name="hobbies" type="checkbox" value="爬山">爬山
     <br>
     <input type="submit">
 </form>

</div>
</body>
</html>


