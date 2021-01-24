<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Donors</title>


<style>
#findAll{

font-size: large;
color: crimson;

    }
#findById{

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
	  $('#findAll').click(function() {
           var donorTable="<table id=\"donor\" style=\"font-size: large;width: 840px; margin-left: 115px;\"><tr>"+
            "<th>Id</th>"+
            "<th>Name</th>"+
            "<th>PhoneNumber</th>"+
            "<th>DateOfBirth</th>"+
            "<th>address</th>"+
           "<th>city</th>"+
           "<th>mailId</th>"+
           "<th>BloodGroup</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donors/";
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
					$('#showDonors').html(donorTable);
				}
			});
        });
        $('#findById').click(function() {
           var donorTable="<table id=\"donor\" style=\"font-size: large;width: 840px; margin-left: 115px;\"><tr>"
            "<th>Id</th>"+
            "<th>Name</th>"+
            "<th>PhoneNumber</th>"+
            "<th>DateOfBirth</th>"+
            "<th>address</th>"+
           "<th>city</th>"+
           "<th>mailId</th>"+
           "<th>BloodGroup</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donors/find/"+$("#donorId").val();
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(findResult) {
				
                    donorTable+="<tr><td>"+findResult.id+"</td>"+
                        "<td>"+findResult.name+"</td>"+
                        "<td>"+findResult.phoneNum+"</td>"+
                        "<td>"+findResult.dob+"</td>"+
                        "<td>"+findResult.address+"</td>"+
                        "<td>"+findResult.city+"</td>"+
                        "<td>"+findResult.email+"</td>"+
                        "<td>"+findResult.bloodGroup+"</td>"+
                        "</tr>";
					
					
					donorTable+="</table><br>"
					$('#showDonorsId').html(donorTable);
				}
			});
		});
	
	   
	  
   });
   </script>
</head>
<body>

<br>
<div >
   
<form name="" method="post">
    <input type="button" value="Get All the donors" id="findAll">
</form>
<br>
<div id="showDonors" style="text-align: center;"></div>
</div>
<div >
<form name="" method="post">
  <p style="font-size:large;">Enter the Id of the donor</p>
    <input type="text" name="donorId" id="donorId" value="">
    <input type="button" value="Search" id="findById">
</form>
<div id="showDonorsId" style="text-align: center;"></div>
</div>


</body>
</html>