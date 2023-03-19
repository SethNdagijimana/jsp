<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up </title>


<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">


<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="main">

		
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
						<img src="images/sign-up2.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">Already Have an account
							</a>
					</div>

					<div class="signin-form">
						<h2 class="form-title">Sign Up</h2>
						<form method="POST" action="SignUpJspServlet" class="register-form"
							id="login-form">
							<div class="form-group">
								<label for="Email"><i
									class="zmdi zmdi-email material-icons-name"></i></label> <input
									type="email" name="email" id="username"
									placeholder="Your email" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" />
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Sign Up" />
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>

	</div>

	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>