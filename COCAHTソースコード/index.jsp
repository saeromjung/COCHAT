<%@ page language="java" contentType="text/html;  charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ホーム</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

</head>
<body>
	<div class="container">
		<div class="box">
			<img class="avatar" src="img/user-avatar.png">
			<h1>ログイン<br>アカウント</h1>
			<form action="LoginServlet" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Login"> <a
					href="#">パスワード忘れた方</a><br> <a href="registration.jsp">新規アカウント登録</a>
			</form>
		</div>
	</div>
</body>
</html>