<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head >
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Login</title>
</head>
<body>
<!-- <h1><center>First HTML</center></h1>
 -->
<img  class="logo" src="images/zen-logo-copy.png">
<!-- Login Form -->


<!-- Tab links -->
<div class="tab">
  <button onclick="openCity(event, 'London')">London</button>
  <button onclick="openCity(event, 'Paris')">Paris</button>
  <button  onclick="openCity(event, 'Tokyo')">Tokyo</button>
</div>

<!-- <!-- Tab content -->
<div id="London" class="tabcontent">
  <h3>London</h3>
  <p>London is the capital city of England.</p>
</div>

<div id="Paris" class="tabcontent">
  <h3>Paris</h3>
  <p>Paris is the capital of France.</p> 
</div>

<div id="Tokyo" class="tabcontent">
  <h3>Tokyo</h3>
  <p>Tokyo is the capital of Japan.</p>
</div> -->

<form action="FirstServlet" method="post">

<div class="loginheader">
<div class="loginform">
<h1>Register</h1>
 <hr>
    <label  for="email"><b>Email</b></label><br>
    <input type="text" placeholder="Enter Email" name="email" required><br>
    
    
       <label for="psw"><b>Password</b></label><br>
    <input type="password" placeholder="Enter Password" name="psw" required><br>
    </hr>
    
    <button>Submit</button>

</div>
</div>


</form>




</body>
</html>