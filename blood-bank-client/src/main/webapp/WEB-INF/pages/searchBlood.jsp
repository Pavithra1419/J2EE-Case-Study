<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Donors</title>

<style>
#findGroup{

font-size: large;
color: crimson;
}
#findLoc{
font-size: large;
color: crimson;
}
#findEligible{
font-size: large;
color: crimson;
}
#donor {
 

  width: 100%;
}
#donor td, #donor th {
  border: 1px solid blue;
  padding: 8px;
}

#donor th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: blue;
  color: white;
}
</style>

<script
  src="https://code.jquery.com/jquery-1.12.4.min.js"
  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  crossorigin="anonymous"></script>
  
<script type="text/javascript">
  $(document).ready(function(){
     $('#findGroup').click(function() {
           var donorTable="<table id=\"donor\" style=\"font-size: large;width: 840px; margin-left: 115px;\"><tr>"+
            "<th>Id</th>"+
            "<th>Name</th>"+
            "<th>PhoneNumber</th>"+
            "<th>DateOfBirth</th>"+
            "<th>address</th>"+
           "<th>city</th>"+
           "<th>mailId</th>"+
           "<th>BloodGroup</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donors/findGroup/"+$("#bloodGroup").val();
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(donors) {
					
					$.each(donors, function(key,value) {
                    donorTable+="<tr><td>"+value.id+"</td>"+
                        "<td>"+value.name+"</td>"+
                        "<td>"+value.phoneNum+"</td>"+
                        "<td>"+value.dob+"</td>"+
                        "<td>"+value.address+"</td>"+
                        "<td>"+value.city+"</td>"+
                        "<td>"+value.email+"</td>"+
                        "<td>"+value.bloodGroup+"</td>"+
                        "</tr>";
					
					});
					donorTable+="</table><br>";
					$('#showGroup').html(donorTable);
				}
			});
        });
        $('#findByLoc').click(function() {
           var donorTable="<table id=\"donor\" style=\"font-size: large;width: 840px; margin-left: 115px;\"><tr>"
            "<th>Id</th>"+
            "<th>Name</th>"+
            "<th>PhoneNumber</th>"+
            "<th>DateOfBirth</th>"+
            "<th>address</th>"+
           "<th>city</th>"+
           "<th>mailId</th>"+
           "<th>BloodGroup</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donors/findLoc/"+$("#donorLoc").val();
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(findResult) {
					$.each(findResult, function(key,value) {
                    donorTable+="<tr><td>"+value.id+"</td>"+
                        "<td>"+value.name+"</td>"+
                        "<td>"+value.phoneNum+"</td>"+
                        "<td>"+value.dob+"</td>"+
                        "<td>"+value.address+"</td>"+
                        "<td>"+value.city+"</td>"+
                        "<td>"+value.email+"</td>"+
                        "<td>"+value.bloodGroup+"</td>"+
                        "</tr>";
					});
					
					donorTable+="</table><br>"
					$('#showLoc').html(donorTable);
				}
			});
		});

			  $('#findEligible').click(function() {
		           var donorTable="<table id=\"donor\" style=\"font-size: large;width: 840px; margin-left: 115px;\"><tr>"
		            "<th>Id</th>"+
		            "<th>Name</th>"+
		            "<th>PhoneNumber</th>"+
		            "<th>DateOfBirth</th>"+
		            "<th>address</th>"+
		           "<th>city</th>"+
		           "<th>mailId</th>"+
		           "<th>BloodGroup</th></tr>";
				   var urlval="http://localhost:2020/donor-service/donors/eligible;
					$.ajax({
						type : 'GET',
						url :urlval,
						dataType : 'json',
						contentType : 'application/json',
						success : function(findResult) {
							$.each(findResult, function(key,value) {
		                    donorTable+="<tr><td>"+value.id+"</td>"+
		                        "<td>"+value.name+"</td>"+
		                        "<td>"+value.phoneNum+"</td>"+
		                        "<td>"+value.dob+"</td>"+
		                        "<td>"+value.address+"</td>"+
		                        "<td>"+value.city+"</td>"+
		                        "<td>"+value.email+"</td>"+
		                        "<td>"+value.bloodGroup+"</td>"+
		                        "</tr>";
							
							});
							donorTable+="</table><br>"
							$('#showEligible').html(donorTable);
						}
					});
				});
	
	   
	  
   });
   </script>
</head>
<body>


<div >
   
<form name="" method="post">
   
     <label for="bloodgroup">Select blood group</label>
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
    <input type="button" value="Search" id="findGroup">
</form>
<br>
<div id="showGroup" style="text-align: center;"></div>
</div>
<div >
<form name="" method="post">
  <p style="font-size:large;">Enter the location</p>
    <input type="text" name="donorLoc" id="donorLoc" value="">
    <input type="button" value="Search" id="findLoc">
</form><br>
<div id="showLoc" style="text-align: center;"></div>
</div>
<br>
<br>
<div>
<form name="" method="post">
  
  <input type="button" value="Find all the eligible donors" id="findEligible">
</form>
<div id="showEligible" style="text-align: center;"></div>

</div>

</body>
</html>