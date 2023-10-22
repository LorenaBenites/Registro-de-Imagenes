<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body {
            font-family: Arial, sans-serif;
            background-color: #0e2433;
            color: white;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #0e2433;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        h2 {
            color: #45b6fe;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            text-align: left;
        }

        input[type="text"],
        input[type="password"],
        input[type="email"] {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #fff;
            color: #0e2433;
        }

        input[type="submit"] {
            background-color: #45b6fe;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .message {
            background-color: #45b6fe;
            color: white;
            padding: 10px;
            margin-top: 20px;
            border-radius: 5px;
        }

</style>

</head>
<body>
	  <div class="container">
        
        <h2>Admin and User Login Page</h2>
        <form 
         action="/login"
         method="post">          
            <div class="form-group">
                <label for="username">Email:</label>
                <input  type="email" id="username" name="username" placeholder="Enter your email" required>
            </div>
            
            <div class="form-group">
                <label for="password">Password:</label>
                <input  type="password" id="password" name="password" placeholder="Enter your password" required>
            </div>
            <input type="submit" value="Register">
        </form>
        
    </div>
</body>
</html>