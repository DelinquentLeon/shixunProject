<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!-- 新 Bootstrap5 核心 CSS 文件 -->
		<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
		 
		<!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
		<script src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>
		 
		<!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
		<script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>
		<style type="text/css">
			#login{
				width: 50%;
				height: 600px;
				margin: auto auto;
			}
			.form_btn{
				width: 100%;
			}
		</style>
	</head>
	<body>
		<div id="login">
			<form action="login">
			  <div class="mb-3 mt-3">
			    <label for="numberr" class="form-label">number:</label>
			    <input type="text" class="form-control" 
			    id="numberr" placeholder="Enter number" name="number">
			  </div>
			  <div class="mb-3">
			    <label for="namee" class="form-label">name:</label>
			    <input type="text" class="form-control" 
			    id="namee" placeholder="Enter name" name="name">
			  </div>
			  <div class="mb-3">
			    <label for="sexx" class="form-label">name:</label>
			    <input type="text" class="form-control" 
			    id="sexx" placeholder="Enter sex:" name="sex">
			  </div>
			  <div class="mb-3">
			    <label for="agee" class="form-label">age:</label>
			    <input type="text" class="form-control" 
			    id="agee" placeholder="Enter age" name="age">
			  </div>
			  <div class="mb-3">
			    <label for="majorr" class="form-label">major:</label>
			    <input type="text" class="form-control" 
			    id="majorr" placeholder="Enter major" name="major">
			  </div>	  
			  <div class="mb-3">
			    <label for="provincee" class="form-label">province:</label>
			    <input type="text" class="form-control" 
			    id="provincee" placeholder="Enter province" name="province">
			  </div>
			  <div class="mb-3">
			    <label for="hobbyy" class="form-label">hobby:</label>
			    <input type="text" class="form-control" 
			    id="hobbyy" placeholder="Enter hobby" name="hobby">
			  </div>
		  			  
			  <div class="form-check mb-3">
			    <label class="form-check-label">
			      <input class="form-check-input" type="checkbox" name="remember"> remember name
			    </label>
			  </div>
			  <button type="submit" class="btn btn-primary form_btn">submit</button>
			  ${message}
			</form>
		</div>
		
	</body>
</html>