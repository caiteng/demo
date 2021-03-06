<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <title>index Page</title>
</head>
<link rel="stylesheet" href="/css/login/reset.css"/>
<link rel="stylesheet" href="/css/login/supersized.css"/>
<link rel="stylesheet" href="/css/login/style.css"/>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="/js/login.js"></script>
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
<script src="/js/common/html5shiv.js"></script>
<style>
    canvas{position: fixed; top: 0px; left: 0px; }
</style>
<body>
    <input type="text" id="name" />
    <button onclick="readContent()">登录</button>

Welcome<br/><input id="text" type="text"/>
<button onclick="send()">发送消息</button>
<hr/>
<button onclick="closeWebSocket()">关闭WebSocket连接</button>
<hr/>
<div id="message"></div>
<table id="tb" class="altrowstable">
    <th align="center"  colspan="9">实时信息监控</th>
</table>
</body>

<script type="text/javascript">
    var websocket = null;

    function readContent(){
        var name = document.getElementById('name').value;
        if(name==''){
            return;
        }
        $.ajax({
            type: "POST",
            url: '/validate',
            data: {name:name},
            success: function(data) {
                support(data);
            }
        });
    }
    //连接
    function support(token){
        //判断当前浏览器是否支持WebSocket
        if ('WebSocket' in window) {
            websocket = new WebSocket("ws://localhost:1902/webSocket?token="+token);
        }
        else {
            alert('当前浏览器 Not support websocket')
        }
        //连接发生错误的回调方法
        websocket.onerror = function () {
            setMessageInnerHTML("WebSocket连接发生错误");
        };
        //连接成功建立的回调方法
        websocket.onopen = function () {
            setMessageInnerHTML("WebSocket连接成功");
        }
        //接收到消息的回调方法
        websocket.onmessage = function (event) {
            setMessageInnerHTML(event.data);
        }
        //连接关闭的回调方法
        websocket.onclose = function () {
            setMessageInnerHTML("WebSocket连接关闭");
        }
    }

    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        closeWebSocket();
    }
    //将消息显示在网页上
    function setMessageInnerHTML(innerHTML) {
        var msg=innerHTML.split(" - ")

        var table=document.getElementById("tb");
        var row;
        row=table.insertRow(1);
        for(var i=0;i<msg.length;i++){
            var cell = row.insertCell(i);
            cell.appendChild(document.createTextNode(msg[i]));
        }
        if(table.rows.length>50){
            table.deleteRow(table.rows.length-1);
        }
        //  document.getElementById('message').innerHTML += innerHTML + '<br/>';
    }
    //关闭WebSocket连接
    function closeWebSocket() {
        websocket.close();
    }
    //发送消息
    function send() {
        var message = document.getElementById('text').value;
        websocket.send(message);
    }
</script>
</html>