<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Om Namah Shivaya</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"crossorigin="anonymous">
</head>

</head>
<body>
	<div class="container">
	<div class="row text-center" style="color: tomato;">
		<h2>User Registration with JSP, Servlet and Hibernate</h2>
	</div>
	<hr>
		<div class="row col-md-10 col-md-offset-3">	
			
			<div class="card card-body">
			
				<h2>User Register Form</h2>
				<div class="col-md-8 col-md-offset-3">

					<form action="<%=request.getContextPath()%>/register" method="post">

						<div class="form-group">
							<label for="uname">First Name:</label> <input type="text"
								class="form-control" id="uname" placeholder="First Name"
								name="firstName" required>
						</div>

						<div class="form-group">
							<label for="uname">Last Name:</label> <input type="text"
								class="form-control" id="uname" placeholder="last Name"
								name="lastName" required>
						</div>

						<div class="form-group">
							<label for="rollno">Roll No:</label> <input type="text"
								class="form-control" id="rollno" placeholder="Roll No"
								name="rollno" required>
						</div>

						<div class="form-group">
							<label for="email">Mail Id:</label> <input type="email"
								class="form-control" id="mailId" placeholder="Mail Id"
								name="mailId" required>
						</div>
						
						<div class="form-group">
							<label for="number">Mobile No:</label> <input type="number" min=0 
								class="form-control" id="phoneno" placeholder="Mobile No"
								name="phoneno" required>
						</div>
						
						<div class="form-group">
							<label for="month">Pursuing Year:</label> <input type="month"
								class="form-control" id="studingyear" placeholder="Pursuing Year"
								name="studingyear" required>
						</div>
						
						<div class="form-group">
							<label for="month">Passout Year:</label> <input type="month"
								class="form-control" id="passoutyear" placeholder="Passout Year"
								name="passoutyear" required>
						</div>
						
						<div class="form-group">
							<label for="textarea">Address:</label> <input type="text"
								class="form-control" id="address" placeholder="Address"
								name="address" required>
						</div>

						<button type="submit" class="btn btn-primary">Submit</button>

					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>