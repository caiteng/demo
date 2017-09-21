﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

	<head>
		<meta charset="utf-8">
		<title>Layout</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">

		<link rel="stylesheet" href="/plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="/plugins/font-awesome/css/font-awesome.min.css" />
		<link rel="stylesheet" href="/css/layout.css" media="all" />
	</head>

	<body>
		<div class="layui-layout layui-layout-admin beg-layout-container">
			<div class="layui-header beg-layout-header">
				<div class="beg-layout-main beg-layout-logo">
					<a href="http://beginner.zhengjinfan.cn/demo/beginner_admin/" target="_blank">LOGO</a>
				</div>
				<div class="beg-layout-main beg-layout-side-toggle">
					<i class="fa fa-bars" aria-hidden="true"></i>
				</div>
				<!--一级菜单-->
				<div class="beg-layout-main beg-layout-menu" id="menu">
					<ul class="layui-nav beg-layout-nav" lay-filter="">
						<li class="layui-nav-item layui-this">
							<a href="javascript:;" data-module-id="1">
								<i class="fa fa-desktop" aria-hidden="true"></i>
								<cite>内容管理</cite>
							</a>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;">
								<i class="fa fa-shopping-bag" aria-hidden="true"></i>
								<cite>商品管理</cite>
							</a>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;" data-module-id="3">
								<i class="fa fa-users" aria-hidden="true"></i>
								<cite>会员管理</cite>
							</a>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;">
								<i class="fa fa-tv" aria-hidden="true"></i>
								<cite>订单管理</cite>
							</a>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;">
								<i class="fa fa-gears" aria-hidden="true"></i>
								<cite>设置</cite>
							</a>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;">
								<i class="fa fa-plug" aria-hidden="true"></i>
								<cite>扩展</cite>
							</a>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;">
								<i class="fa fa-paper-plane" aria-hidden="true"></i>
								<cite>社区</cite>
							</a>
						</li>
					</ul>
				</div>
				<div class="beg-layout-main beg-layout-panel">
					<ul class="layui-nav beg-layout-nav" lay-filter="user">
						<li class="layui-nav-item">
							<a href="javascript:;" class="beg-layou-head">
								<img src="images/0.jpg" />
								<span>beginner</span>
							</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="javascript:;" data-tab="true" data-url='user.html'>
										<i class="fa fa-user-circle" aria-hidden="true"></i>
										<cite>个人信息</cite>
									</a>
								</dd>
								<dd>
									<a href="javascript:;" data-tab="true" data-url="setting.html">
										<i class="fa fa-gear" aria-hidden="true"></i>
										<cite>设置</cite>
									</a>
								</dd>
								<dd>
									<a href="login.html">
										<i class="fa fa-sign-out" aria-hidden="true"></i>
										<cite>注销</cite>
									</a>
								</dd>
							</dl>
						</li>
					</ul>
				</div>
			</div>
			<!--侧边导航栏-->
			<div class="layui-side beg-layout-side" id="side" lay-filter="side"></div>
			<!--内容区域-->
			<div class="layui-body beg-layout-body">
				<div class="layui-tab layui-tab-brief layout-nav-card" lay-filter="layout-tab" style="border: 0; margin: 0;box-shadow: none; height: 100%;">
					<ul class="layui-tab-title">
						<li class="layui-this">
							<a href="javascript:;">
								<i class="fa fa-dashboard" aria-hidden="true"></i>
								<cite>控制面板</cite>
							</a>
						</li>
					</ul>
					<div class="layui-tab-content">
						<div class="layui-tab-item layui-show">
							<iframe src="main.jsp"></iframe>
						</div>
					</div>
				</div>
			</div>
			<!--页脚-->
			<div class="layui-footer beg-layout-footer">
				<p>2016 &copy;
					<a href="http://m.zhengjinfan.cn/">beginner.zhengjinfan.cn</a> LGPL license
				</p>
			</div>
		</div>		
		<script src="/plugins/layui/layui.js "></script>
		<script src="/js/LayUI_backEnd/layout.js "></script>
	</body>

</html>