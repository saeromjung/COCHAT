<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>新規登録</title>
</head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新規アカウント</title>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei"
	rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="regbox box">
			<img class="avatar" src="img/cochatlogo.png">
			<h1>アカウント登録</h1>
			<form action="RegisterServlet" method="POST">
				<p>Username</p>
				<input type="text" placeholder="Username" name="name" required>
				<p>Useremail</p>
				<input type="text" placeholder="Useremail" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="登録"> <a
					href="index.jsp">アカウントお持ちの方</a>
			</form>
		</div>
	</div>
</body>
</html>