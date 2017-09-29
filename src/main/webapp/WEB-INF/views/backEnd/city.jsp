<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

	<head>
		<meta charset="UTF-8">
		<title>City</title>
		<link rel="stylesheet" href="/plugins/layui/css/layui.css" media="all" />
	</head>

	<body>

		<div id="city"></div>

		<script type="text/javascript" src="/plugins/layui/layui.js" ></script>
		<script>
			layui.config({
				base: '/js/backEnd/'
			}).use('city', function() {
				var city = layui.city,
					$ = layui.jquery;

				$('#city').citys({
					code: 110000
				});

			});
		</script>
	</body>

</html>