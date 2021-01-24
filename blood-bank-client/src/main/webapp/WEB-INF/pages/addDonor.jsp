<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#rigister{
  margin-left: 100px;
  width:400px;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
input[type=text], select {
   width: 40%;
   border: 3px solid #cca;
   padding: 15px 20px;
 }
input[type=button] {
  width: 40%;
  height: 30px;
  background-color: blue;
  color: white;
   border-radius: 4px;
}

label{
  font-size:large;
  font-weight:bold;
}

</style>
<script
  src="https://code.jquery.com/jquery-1.12.4.min.js"
  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  crossorigin="anonymous"></script>
<script type="text/javascript">
   $(document).ready(function(){
	 
		  $('#submit').click(function(e){
			  var donorDetails={};
			  donorDetails.name=$("#name").val();
			  donorDetails.phoneNum=$("#phoneNum").val();
			  donorDetails.dob=$("#dob").val();
			  donorDetails.bloodGroup=$("#bloodGroup").val();
			  donorDetails.address=$("#address").val();
			  donorDetails.city=$("#city").val();
			  donorDetails.email=$("#mailid").val();
			   $.ajax({
					type : 'POST',
					url : "http://localhost:2020/donor-service/donors/add",
					dataType : 'json',
					data : JSON.stringify(donorDetails),
					contentType : 'application/json',
			        success : function(result){
			        	$('#success').text("Registration successful!");
			        	
				        }
			  });
		  });
   });
   </script>
</head>





<body>
<br>
<h3 style="text-align:center;">Donor Registration</h3>

<div id="register">
    <form name="" method="post">
    <label for="name">Name</label>
    <input type="text" id="name" name="name"><br>
    
    <label for="phoneNum">Phone Number</label>
    <input type="text" id="phoneNum" name="phoneNum"><br>
    
    <label for="dob">DateOfBirth</label>
    <input type="text" id="dob" name="dob" placeholder="(yyyy-mm-dd)"><br>
    
    <label for="address">Address</label>
    <input type="text" id="address" name="address"><br>
    
    <label for="city">City</label>
    <input type="text" id="city" name="city"><br>
    
     <label for="mail">Mail Id</label>
    <input type="text" id="mailid" name="mailid"><br>
    
    <label for="bloodgroup">Blood Group</label>
    <select id="bloodGroup" name="bloodGroup">
      <option value="apos">A+</option>
      <option value="aneg">A-</option>
      <option value="bpos">B+</option>
      <option value="bneg">B-</option>
      <option value="opos">O+</option>
      <option value="oneg">O-</option>
      <option value="abpos">AB+</option>
      <option value="abneg">AB-</option>
    </select><br><br>

     <input type="button" value="Submit" id="submit">
  </form>
</div>
<div id="success" style="text-align: center; background-color: green; width:500px"></div>
</body>
</html>