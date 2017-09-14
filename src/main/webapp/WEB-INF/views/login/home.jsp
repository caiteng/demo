<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<style>

        body{background-color: #080708
        }
    </style>
        <script type="text/javascript" src="/js/effect/login-canvas-particle.js"></script>
</head>
<body>
<shiro:guest>
    欢迎游客访问，<a href="${pageContext.request.contextPath}/login">登录</a>
</shiro:guest>
<br>
<shiro:user>
    欢迎[<shiro:principal/>]登录，<a href="${pageContext.request.contextPath}/logout">退出</a>
</shiro:user>
<br>
<shiro:authenticated>
    用户[<shiro:principal/>]已身份验证通过
</shiro:authenticated>
<br>
<shiro:notAuthenticated>
    未身份验证（包括记住我）
</shiro:notAuthenticated>
<br>
<shiro:principal/>




<%--<!-- 背景div -->--%>
<div id="mydiv" style="height:600px;"></div>

</body>
</html>

