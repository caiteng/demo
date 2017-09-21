<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

	<head>
		<meta charset="utf-8">
		<title>Layui</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="/plugins/layui/css/layui.css" media="all" />
	</head>

	<body>

		<div style="margin: 15px;">
			<fieldset class="layui-elem-field layui-field-title">
				<legend>引用区块 - 默认风格</legend>
			</fieldset>

			<blockquote class="layui-elem-quote">这个貌似不用多介绍，因为你已经在太多的地方都看到</blockquote>

			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
				<legend>引用区块 - 一般风格</legend>
			</fieldset>

			<blockquote class="layui-elem-quote layui-quote-nm">
				猿强，则国强。国强，则猿更强！
				<br>——孟子（好囖。。其实这特喵的是我说的）
			</blockquote>

			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
				<legend>字段集区块 - 默认风格</legend>
			</fieldset>

			<fieldset class="layui-elem-field">
				<legend>爱好</legend>
				<div class="layui-field-box">
					你可以在这里放任何内容，比如表单神马的
				</div>
			</fieldset>

			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
				<legend>字段集区块 - 带标题的横线</legend>
			</fieldset>

			<fieldset class="layui-elem-field layui-field-title">
				<legend>标题</legend>
				<div class="layui-field-box">
					内容区域
				</div>
			</fieldset>

			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
				<legend>纯横线</legend>
			</fieldset>

			<p>华丽的</p>
			<hr>
			<p>分割线</p>

			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
				<legend>纯圆角</legend>
			</fieldset>

			<div class="layui-inline">
				<img src="http://fly.layui.com/avatar/168.jpg" class="layui-circle">
			</div>
			<p style="margin-top: 15px;">会不定期增加的亲</p>
		</div>
		<script type="text/javascript" src="/plugins/layui/layui.js"></script>
	</body>

</html>