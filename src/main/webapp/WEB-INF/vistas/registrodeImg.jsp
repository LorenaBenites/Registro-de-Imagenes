<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  
</head>
<body>
<div class="card">
	<div class="card-header">
		<p class="h4 mb-2 text-center bg-danger"> HELLO BITCHES</p>
	</div>
	<div class="card-body">
		<form class="text-center border border-light p-5" action="/addP" method="post" enctype="multipart/form-data">

			<!-- Name -->
			<input type="text" name="nompro" id="nompro" class="form-control mb-4"
				placeholder="Product Name">

			<!-- Price -->
			<input type="text" name="precio" id="precio" class="form-control mb-4"
				placeholder="Product Price">

			<!-- Description -->
			<textarea class="form-control mb-4" id="descrip" name="descrip"
				placeholder="Product Description">Product Description
                                 </textarea>
			<div class="custom-file mb-4">
				<input type="file" name="img" class="custom-file-input"
					id="customFile"> <label class="custom-file-label"
					for="customFile">Product Image</label>
			</div>
			<!-- Sign in button -->
			<button class="btn btn-info btn-block" type="submit">add</button>
		</form>
	</div>
</div>
</body>
</html>