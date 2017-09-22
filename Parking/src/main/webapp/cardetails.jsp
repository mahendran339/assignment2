<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.10.0/jquery.validate.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
.textbox ,select{ 
    -webkit-border-radius: 5px; 
    -moz-border-radius: 5px; 
 
    border: 1px solid #848484; 
    outline:0; 
    height:25px; 
    width: 175px; 
 }
 label.error{
 display: block;
 color:red;
 margin:0px;
 margin-left:75px;
 font-size:12px;

 }
 input, select{

 }
 #Submit{
background: #15b05e;
    color: #fff;
    padding: 5px 10px;
    cursor: pointer;
    border: 0px;
    border-radius: 5px;
    width: 100px;
    margin-right: 15px;
    margin-top:15px;
 }
 #exten{
background: #42cbf4;
    color: #fff;
    padding: 5px 10px;
    cursor: pointer;
    border: 0px;
    border-radius: 5px;
    width: 100px;
    margin-right: 15px;
    margin-top:15px;
 }
 #logout{
    background: #e25441;
    color: #fff;
    padding: 5px 10px;
    cursor: pointer;
    border: 0px;
    border-radius: 5px;
    width: 100px;
    margin-right: 15px;
    margin-top:15px;
 }
 .containers{
 margin:0 auto;
 width:600px;
 border:1px solid #506ce6;
 padding-bottom:25px;
 }
 .containers h4{
    padding: 10px;
    background: #506ce6;
    color: #fff;
    font-weight: bold;
    font-size: 22px;
    margin:0px;
 }
span {
    width: 125px;
    display: inline-block;
    text-align: left;
}
</style>
<script type="text/javascript">
function loadDoc() {
	var time =  document.getElementById("time").value;
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	     document.getElementById("cost").value = this.responseText;
	    }
	  };
	  xhttp.open("GET", "Feecalc?time="+time, true);
	  xhttp.send();
	}
</script>

<title></title>

</head>
<body>

 
 <br>
  <form id="cardetails" action="SaveDetails" method="POST" role="form" style="display: block;">
<div align="center"  class="containers"> 
    <br> 
  <span>Car Number:</span>
  <input type="text" name="car_number" id="car_number" value="">
  <br><br>
  <span>Parking Area:</span>
  <input type="text" name="parking_area" id="parking_area" value="">
  <br><br>
   <span>Time Limt:</span>
     <input type="text" name="time" id="time" value="" onblur="loadDoc()"> 
 <br><br>

  <span>Cost Estimation:</span>
  <input type="text" id="cost" name="cost" value="" readonly>
 <br>
  <br>
  
 <div id="cost"></div>
  <input type="Submit" value="Submit" id="Submit">
   <!-- <input type="button" value="Logout" id="logout"> -->
 
   <a  id="logout" href="logout">Logout</a>
   <br> <br>
   <p id="extend" onclick="myFunction()">Extend.</p>
   <script>
function myFunction() {
    document.getElementById("extend").innerHTML = "The parking service is limited to 120 minutes. However, you can access extend parking incase of emergency. This service will be available after 90 minutes of parking and only when the parking is occupaid lessthan 70%.";
}
</script>
   </div>
</form> 
   
 
</body>
</html>