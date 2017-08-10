<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <%--<script src="<%=request.getContextPath()%>/static/bui/js/jquery-1.8.1.min.js"></script>--%>
    <script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
<body>
username: <input type="text" id="username"><br><br>
password: <input type="password" id="password"><br><br>
<button id="loginbtn">登录</button>
</body>
<script type="text/javascript">
    $('#loginbtn').click(function() {
        var param = {
            username : $("#username").val(),
            password : $("#password").val()
        };
        $.ajax({
            type: "post",
            url: "<%=request.getContextPath()%>" + "/checkLogin.json",
            data: param,
            dataType: "json",
            success: function(data) {
                console.log(data);
                if(data.success){
                    alert(data.success);
                    //登录成功
                    window.location.href = "<%=request.getContextPath()%>" +  "/loginsuccess";
                }else{
                    alert(data.error);
                }
            },
            error: function(data) {
                alert("登录失败");
            }
        });
    });
</script>
</html>