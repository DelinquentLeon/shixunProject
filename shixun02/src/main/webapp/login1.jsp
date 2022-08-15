<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- 引入css文件 -->
		<link rel="stylesheet" href="./login1.css" />
		<!-- 引入jquery -->
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<title>登录</title>
	</head>

	<body>
		<!-- 最外层的大盒子 -->
		<div class="box">
			<!-- 滑动盒子 -->
			<div class="pre-box">
				<h1>WELCOME</h1>
				<p>JOIN US!</p>
				<div class="img-box">
					<img src="./img/cheng.PNG" alt="" />
				</div>
			</div>
			<!-- 注册盒子 -->
			<div class="register-form">
				<!-- 标题盒子 -->
				<div class="title-box">
					<h1>JOIN US!</h1>
				</div>
				<!-- 输入框盒子 -->
				<form action="login">
					<div class="input-box">
						<input type="text" required placeholder="学号*" name="number"/>
						<input type="text" required placeholder="姓名*" name="name"/>
						<input type="text" required placeholder="性别*" name="sex"/>
						<input type="text" required placeholder="年龄*" name="age"/>
						<input type="text" required placeholder="专业*" name="major"/>
						<input type="text" required placeholder="地址" name="province"/>
						<input type="text" required placeholder="爱好" name="hobby"/>
					</div>
					<!-- 按钮盒子 -->
					<div class="btn-box">
						<button>提交</button>
						<!-- 绑定点击事件 -->
						<!-- <p onclick="mySwitch()">已有账号?去登录</p> -->
						<br/>
						<p>${message}</p>
					</div>
					
				</form>
			</div>
			<!-- 登录盒子 -->
			<div class="login-form">
				<!--
				标题盒子
				<div class="title-box">
					<h1>登录</h1>
				</div>
				输入框盒子
				<div class="input-box">
					<input type="text" placeholder="用户名" />
					<input type="password" placeholder="密码" />
				</div>
				按钮盒子
				<div class="btn-box">
					<button>登录</button>
					绑定点击事件
					<p onclick="mySwitch()">没有账号?去注册</p>
				</div>
				-->
			</div>
		</div>
	</body>
</html>
