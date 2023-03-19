<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<jsp:useBean id="studBean" class="com.sms.beans.StudentBean" scope="request" />
<title>Admission</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
		 <font style="color: red">
        ${studBean.errorMessage}
        </font>
        <font style="color: green">
        ${studBean.infoMessage}
        </font>				<h2 class="form-title">Registration </h2>
					
	<form method="POST" action="RegisterJspServlet" class="register-form"
	id="register-form">
	<div class="form-group">
	<label for="name"><i
	class="zmdi zmdi-account material-icons-name"></i></label>
        <input
            type="text" name="name" id="name" placeholder="Your Name" value="${studBean.fullname}" />
	</div>
	<div class="form-group">
	<label for="email"><i class="zmdi zmdi-email"></i></label> <input
            type="email" name="email" id="email" placeholder="Your Email"  value="${studBean.email}"/>
	</div>
	<div class="form-group">
	<label for="age"><i class="zmdi zmdi-male-female"></i></label> <input
            type="text" name="gender" id="pass" placeholder="Your Gender"  value="${studBean.gender}"/>
	</div>
	<div class="form-group">
	<label for="age"><i class="zmdi zmdi-accounts-add"></i></label>
	<input type="number" name="age" id="re_pass"
               placeholder="Your Age" value="${studBean.age}" />
	</div>
	<div class="form-group">
	<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
	<input type="text" name="contact" id="contact"
               placeholder="Contact no" value="${studBean.contact}"/>
	</div>
	<div class="form-group">
	<input type="checkbox" name="agree-term" id="agree-term"
	class="agree-term" /> <label for="agree-term"
	class="label-agree-term"><span><span></span></span>I agree all statements in <a href="#" class="term-service">Terms
	of service</a></label>
	</div>
          <% if (request.getAttribute("action") == null) { %>
	<div class="form-group form-button">
	<input type="submit" name="signup" id="signup"
	class="form-submit" value="Register" />
	</div>
        <%} else {%>
        <input type="submit" name="signup" id="signup"
	class="form-submit" value="${action}" />
	</div>
        <%}%>
	</form>
	</div>
				
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>



</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>