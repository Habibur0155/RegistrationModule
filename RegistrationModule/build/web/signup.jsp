<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
</head>
<body style="background: url(img/sunset.jpg); background-size: cover; background-attachment: fixed;">
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3>Register Here!!...</h3>
						
						<div class="form">
							<!-- Creating form -->
							
							<form action="Register" method="post">
								<div class="row">
							        <div class="input-field col s6">
							          <input id="first_name" name="first_name" type="text" class="validate">
							          <label for="first_name">First Name</label>
							        </div>
							        <div class="input-field col s6">
							          <input id="last_name" name="last_name" type="text" class="validate">
							          <label for="last_name">Last Name</label>
							        </div>
						      </div>
						      <div class="row">
						        <div class="input-field col s12">
						          <input id="password" type="password" name="password" class="validate">
						          <label for="password">Password</label>
						        </div>
						      </div>
						      <div class="row">
						        <div class="input-field col s12">
						          <input id="email" type="email" name="email" class="validate">
						          <label for="email">Email</label>
						        </div>
						      </div>
						      
						      <button class="btn waves-effect waves-light" type="submit" name="action">Submit</button>
							  
							</form>
							
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>