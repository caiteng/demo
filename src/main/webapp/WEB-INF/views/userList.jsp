<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-07-25
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>test</title>
</head>
<table>
    <%--<c:forEach items="${users}" var="u">--%>
        <%--<tr>--%>
            <%--<td>${u.id}</td>--%>
            <%--<td>${u.name}</td>--%>
            <%--<td>${u.createTime}</td>--%>
            <%--<td>${u.lastLoginTime}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
        <td>${users.id}</td>
        <td>${users.name}</td>
        <td>${users.createTime}</td>
        <td>${users.lastLoginTime}</td>

</table>
<body>

</body>
</html>
