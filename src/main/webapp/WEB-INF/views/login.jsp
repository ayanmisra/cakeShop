<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Login Page</title>
	</head>		

	<body>
	
		<form class='form-horizontal' name='loginForm' action="<c:url value='/home' />" method='POST'>
						
							<div class="form-group error-text">
								<label class="control-label col-sm-offset-3 col-sm-9">No account exists, please use the SIGN UP button below</label>
							</div>
							<div class="form-group">
						<label class="control-label col-sm-3">Username:</label>
						<div class="col-sm-9">
							<input type="text" name="email"  class="form-control" required>
						
						</div>
						
					</div>
							<div class="form-group">
								<label class="control-label col-sm-3">Password:</label>
								<div class="col-sm-9">
									<input type="password" name="password" class="form-control" required>
								</div>
							</div>
							<input type="hidden" class="form-control" name="${_csrf.parameterName}" value="${_csrf.token}" >
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-gray" ng-disabled="loginForm.$invalid">OK</button>
									
								</div>
							</div>
						</form>
	</body>
</html>