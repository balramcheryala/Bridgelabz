<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ipl Home</title>
<style>

button{
border:1px solid #004D36; -webkit-border-radius: 50px; -moz-border-radius: 50px;border-radius: 50px;font-size:12px;font-family:arial, helvetica, sans-serif; padding: 10px 10px 10px 10px; text-decoration:none; display:inline-block;text-shadow: -1px -1px 0 rgba(0,0,0,0.3);font-weight:bold; color: #FFFFFF;
 background-color: #A90329; background-image: -webkit-gradient(linear, left top, left bottom, from(#A90329), to(#6D0019));
 background-image: -webkit-linear-gradient(top, #A90329, #6D0019);
 background-image: -moz-linear-gradient(top, #A90329, #6D0019);
 background-image: -ms-linear-gradient(top, #A90329, #6D0019);
 background-image: -o-linear-gradient(top, #A90329, #6D0019);
 background-image: linear-gradient(to bottom, #A90329, #6D0019);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#A90329, endColorstr=#6D0019);
}

button{
 border:1px solid #004D36;
 background-color: #77021d; background-image: -webkit-gradient(linear, left top, left bottom, from(#77021d), to(#3a000d));
 background-image: -webkit-linear-gradient(top, #77021d, #3a000d);
 background-image: -moz-linear-gradient(top, #77021d, #3a000d);
 background-image: -ms-linear-gradient(top, #77021d, #3a000d);
 background-image: -o-linear-gradient(top, #77021d, #3a000d);
 background-image: linear-gradient(to bottom, #77021d, #3a000d);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#77021d, endColorstr=#3a000d);
}
/* body {
    background-image: url("http://brightcove.vo.llnwd.net/e1/pd/3588749423001/3588749423001_4917877859001_winning.jpg?pubId=3588749423001");
} */
<!-- 	
table {
  font-family: 'Arial';
  margin: 10px auto;
  border-collapse: collapse;
  border: 3px solid #eee;
  border-bottom: 5px solid #4CAF50;
  box-shadow: 0px 0px 20px rgba(0,0,0,0.10),
     0px 10px 20px rgba(0,0,0,0.05),
     0px 20px 20px rgba(0,0,0,0.05),
     0px 30px 20px rgba(0,0,0,0.05);
  tr {
     &:hover {
      background: #f4f4f4;
      
      td {
        color: #555;
      }
    }
  }
  th, td {
    color: #999;
    border: 1px solid #eee;
    padding: 20px 50px;
    border-collapse: collapse;
  }
  th {
    background: #00cccc;
    color: #fff;
    text-transform: uppercase;
    font-size: 12px;
    &.last {
      border-right: none;
    }
  }
} -->
</style>
</head>
<center>

		<h1 style="color:green;"><I><strong>Welcome To IPL Home Page</strong></I></h1>
		<br>
	</center>
	<table border="1" align="center" width="75%">
	<tr>
		<th colspan="4"><h3><I><strong><b>IPL 2016 Teams</b></strong></I></h3></th>
	</tr>
	<tr>
		<td><h5 style="color:#900C3F;"><I><strong>DELHI DAREDEVILS</strong></I></h5></td>
		<td>
			<form action="ddteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		
		
		<td>
			<form action="ddplayerview">
				<button type="submit" class="View Player Info">Player Information</button>
			</form>
		</td>
	<td>
			<form action="ddteamview">
		
			<img src="http://mcl-2020.com/wp-content/uploads/2016/04/delhi-daredevils-ipl-2016-team-dd-ipl-9-squad-players-logo.jpg" alt="" style="width:150px; height:auto;">
			</form>
		</td>
	</tr>
	
	<tr>
		<td><h5><I><strong>GUJARATH LIONSM</strong></I></h5></td>
		<td>
			<form action="glteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		<td>
			<form action="glplayerview">
				<button type="submit" class="View Player Info">Player Information</button>
			</form>
		</td>
<td>
			<form action="ddteamview">
			<img src="http://www.offerwale.com/wp-content/uploads/2016/05/gujrat.png" alt="" style="width:100px; height:auto;">
			</form>
		</td>
	</tr>
	
	<tr>
<td><h5 style="color:#900C3F;"><I><strong>KING XI PANJAB</strong></I></h5></td>
		<td>
			<form action="kpteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		<td>
			<form action="kpplayerview">
				<button type="submit" class="View Player Info">Player Inforamtion</button>
			</form>
		</td>
<td>
			<form action="ddteamview">
			<img src="http://dnewscafe.com/wp-content/uploads/2015/10/king-11.jpg" alt="" style="width:100px; height:auto;">
			</form>
		</td>
	</tr>
	
	<tr>
		<td><h5><I><strong>KOLKATA KNIGHT RIDERS</strong></I></h5></td>
		<td>
			<form action="kkrteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		<td>
			<form action="kkrplayerview">
				<button type="submit" class="View Player Info">Player Inforamtion</button>
			</form>
		</td>
<td>
			<form action="ddteamview">
			<img src="http://cricket99.com/wp-content/uploads/2016/04/kolkata-knight-riders-team.png" alt="" style="width:100px; height:auto;">
			</form>
		</td>
	</tr>
	
	<tr>
<td><h5 style="color:#900C3F;"><I><strong>MUMBAI INDIANS</strong></I></h5></td>
		<td>
			<form action="mumbaiteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		<td>
			<form action="mumbaiplayerview">
				<button type="submit" class="View Player Info">Player Information</button>
			</form>
		</td>
<td>
			<form action="ddteamview">
			<img src="https://lh5.googleusercontent.com/-t8cQmhgdLP0/AAAAAAAAAAI/AAAAAAAAAGc/jNtkAQvgWP8/photo.jpg" alt="" style="width:100px; height:auto;">
			</form>
		</td>
	</tr>
	
	<tr>
		<td><h5><I><strong>RISING PUNE SUPER GIANTS</strong></I></h5></td>
		<td>
			<form action="puneteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		<td>
			<form action="puneplayerview">
				<button type="submit" class="View Player Info">Player Inforamtion</button>
			</form>
		</td>
	<td>
			<form action="ddteamview">
			<img src="http://www.cricwindow.com/images/ipl/rps_logo1.jpg" alt="" style="width:100px; height:auto;">
			</form> 
		</td>
	</tr>
	<tr>
<td><h5 style="color:#900C3F;"><I><strong>ROYAL CHALANGERS BANGLORE </strong></I></h5></td>
		<td>
			<form action="rcbteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		<td>
			<form action="rcbplayerview">
				<button type="submit" class="View Player Info">Player Inforamtion</button>
			</form>
		</td>
			<td>
			<form action="ddteamview">
			<img src="http://images.iimg.in/c/54a454186fb172b0bd7ce089-4-200-200-0/google/royal-challengers-bangalore-team-players-logo.jpg" alt="" style="width:100px; height:auto;">
			</form>
		</td>
	</tr>
	
	<tr>
		<td><h5><I><strong>SUNRISERS HYDERABAD </strong></I></h5></td>
		<td>
			<form action="sunriseteamview">
				<button type="submit" class="View  Team Info">Team Information</button>
			</form>
		</td>
		<td>
			<form action="sunriseplayerview">
				<button type="submit" class="View Player Info">Player Inforamtion</button>
			</form>
		</td>
	<td>
			<form action="ddteamview">
			<img src="http://in.bmscdn.com/webin/ipl-2016/srh/srh-og.jpg" alt="" style="width:100px; height:auto;">
			</form>
		</td> 
	</tr>
	
	</table>
</body>
</html>
