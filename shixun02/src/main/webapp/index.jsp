<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 新 Bootstrap5 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">

<!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
<script
	src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- 
		JSP
		java server page
		这个页面中可以写java代码 也可以写html
	 -->
	 <h1>欢迎进入index页面</h1>
	 转发过来的数据是:${name}
	 <br/>
	 <a href="sexCount">
	 	<button type="button" class="btn btn-success">成功</button>
	 </a>
	 
	 
</body>
</html>