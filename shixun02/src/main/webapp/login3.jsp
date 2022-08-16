<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- 引入css文件 -->
    <link rel="stylesheet" href="login3.css" />
    <!-- 引入jquery -->
    <!-- 新 Bootstrap5 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">

    <!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
    <script src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>

    <!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
    <title>登录</title>
</head>

<body>
    <!-- 最外层的大盒子 -->
    <div class="box">
        <!-- 滑动盒子 -->
        <div class="pre-box">
            <h1>WELCOME TO</h1>
            <p style="font-size: 25px">CQU!</p>
            <div class="img-box">
                <img src="./img/cqu.png" alt="" />
            </div>
        </div>
        <!-- 登录盒子 -->
        <div class="login-form"></div>
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
					<input type="text" required placeholder="性别*" name="sex" list="sites"/>
					<input type="number" required placeholder="年龄*" name="age"/>
					<input type="text" required placeholder="专业*" name="major"   list="major"/>
					<input type="text" required placeholder="省份*"  name="province"list="area"/>
					<input type="text" required placeholder="爱好*"  name="hobby"   list="hobby"/>
                </div>
                <!-- 按钮盒子 -->
                <div class="btn-box">
                    <button id="btn" onclick="submit()">提交</button>
                </div>
            </form>
        </div>
        <script>
            var btn = document.getElementById('btn')
            btn.onclick = function () {
                alert("${message}")
            }
        </script>
    </div>

    <!-- 选项 -->
    <datalist id="sites">
        <option value="男">
        <option value="女">
    </datalist>
    <datalist id="major">
        <option value="计算机科学与技术">
        <option value="信息安全">
        <option value="物联网工程">
        <option value="软件工程">
    </datalist>
    <datalist id="area">
        <option value="北京">
        <option value="天津">
        <option value="河北省">
        <option value="山西省">
        <option value="内蒙古自治区">
        <option value="辽宁省">
        <option value="吉林省">
        <option value="黑龙江省">
        <option value="上海">
        <option value="江苏省">
        <option value="浙江省">
        <option value="安徽省">
        <option value="福建省">
        <option value="江西省">
        <option value="山东省">
        <option value="河南省">
        <option value="湖北省">
        <option value="湖南省">
        <option value="广东省">
        <option value="广西壮族自治区">
        <option value="海南省">
        <option value="重庆">
        <option value="四川省">
        <option value="贵州省">
        <option value="云南省">
        <option value="西藏自治区">
        <option value="陕西省">
        <option value="甘肃省">
        <option value="青海省">
        <option value="宁夏回族自治区">
        <option value="新疆维吾尔自治区">
        <option value="台湾省">
        <option value="香港特别行政区">
        <option value="澳门特别行政区 ">
    </datalist>
    <datalist id="hobby">
        <option value="运动类">
        <option value="娱乐类">
        <option value="社交类">
        <option value="智力类">
        <option value="收藏类">
        <option value="乐器类">
        <option value="文艺类">
        <option value="其他类">
    </datalist>


</body>

</html>