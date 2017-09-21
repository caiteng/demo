<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>Paging</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">

		<link rel="stylesheet" href="/plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="/css/global.css" media="all">
		<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
	</head>

	<body>
		<div style="margin: 15px;">
			<blockquote class="layui-elem-quote">
				<h1>Tab 组件说明文档</h1></blockquote>
			<fieldset class="layui-elem-field">
				<legend>参数</legend>
				<div class="layui-field-box">
					<table class="layui-table">
						<thead>
							<tr>
								<th>属性名称</th>
								<th>类型</th>
								<th>默认值</th>
								<th>描述</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td style="text-align: center;">elem</td>
								<td style="text-align: center;">string</td>
								<td style="text-align: center;">undefined</td>
								<td>
									<p>内容容器. 1/id选择器 : #id 2/类选择器：.class</p>
								</td>
							</tr>
							<tr>
								<td style="text-align: center;">closed</td>
								<td style="text-align: center;">boolean</td>
								<td style="text-align: center;">true</td>
								<td>
									<p>关闭</p>
								</td>
							</tr>
							<tr>
								<td style="text-align: center;">autoRefresh</td>
								<td style="text-align: center;">boolean</td>
								<td style="text-align: center;">false</td>
								<td>
									<p>自动刷新</p>
								</td>
							</tr>
							<tr>
								<td style="text-align: center;">contextMenu</td>
								<td style="text-align: center;">boolean</td>
								<td style="text-align: center;">false</td>
								<td>
									<p>右键菜单</p>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</fieldset>
			<fieldset class="layui-elem-field">
				<legend>方法</legend>
				<div class="layui-field-box">
					<table class="layui-table">
						<thead>
							<tr>
								<th>名称</th>
								<th>参数说明</th>
								<th>描述</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td style="text-align: center;">exists</td>
								<td style="text-align: center;">
									<p>参数名：title</p>
									<p>类型：string</p>
								</td>
								<td>
									<p>检索tab选择卡是否存在，如果存在则返回索引值，不存在返回-1</p>
									<p>示例</p>
									<p>
										<pre class="layui-code">
var index = tab.exists('用户中心');
//e.g. 
//result:1
										</pre>
									</p>
								</td>
							</tr>
							<tr>
								<td style="text-align: center;">getTabId</td>
								<td style="text-align: center;">
									<p>参数名：title</p>
									<p>类型：string</p>
								</td>
								<td>
									<p>获取tab选项卡id</p>
									<p>示例</p>
									<p>
										<pre class="layui-code">
var id = tab.getTabId('用户中心');		
//e.g. 
//result:1488434851738
										</pre>
									</p>
								</td>
							</tr>
							<tr>
								<td style="text-align: center;">tabAdd</td>
								<td style="text-align: center;">
									<p>参数名：data</p>
									<p>类型：object</p>
								</td>
								<td>
									<p>参数说明</p>
									<p>data.href //需要加载的地址</p>
									<p>data.icon //图标</p>
									<p>data.title //标题</p>
									<br/>
									<p>添加一个tab选择卡，如果tab选择卡存在则获取焦点</p>
									<p>示例</p>
									<p>
										<pre class="layui-code">
								var id = tab.tabAdd({
									href:'http://fly.zhengjinfan.cn/',
									icon:'fa-user',
									title:'百度'
								});
										</pre>
									</p>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</fieldset>
		</div>
		<script type="text/javascript" src="/plugins/layui/layui.js"></script>
	</body>

</html>