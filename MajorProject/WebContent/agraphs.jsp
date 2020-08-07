<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.dao.Dao"%>
<%@page import="java.util.List"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Didact+Gothic"
	rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="main.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />



</head>
<body>
	<div   style="padding-top: 10px; padding-left: 0px;">
		<div id="header" class="container">
			<div id="logo" style="width: 700px; height: 100%; top: 0em;">
				<h1>
					<a href="#" style="font-size: 30px;">A Network Coding and DES
						Based Dynamic Encryption Scheme for Moving Target Defense</a>
				</h1>
			</div>
			<div id="menu">
				<ul>
					<li><a href="ahome.jsp" accesskey="1" title="">Home</a></li>
					<li><a href="aowner.jsp" accesskey="2" title="">Owner</a></li>
					<li><a href="auser.jsp" accesskey="3" title="">User</a></li>
					<li><a href="afiles.jsp" accesskey="4" title="">Files</a></li>
					<li><a href="akey.jsp" accesskey="4" title="">Keys</a></li>
					<li class="active"><a href="attack.jsp" accesskey="4" title="">Attack</a></li>
					<li><a href="index.html" accesskey="5" title="">Logout</a></li>
				</ul>
			</div>
		</div>
		<div id="banner" class="container" style="padding-top: 100px;">
			<div class="title">
		<div id="chartContainer" style="height: 370px;" class="tbox2 boxC"></div>
		<div id="chartContainer1" style="height: 370px;" class="tbox1 boxA"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>		
 
<%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
String sql = "select fid from data1";
List<String> lt = Dao.getFid(sql);
Iterator<String> itr = lt.iterator();
while(itr.hasNext()){
	String fid = itr.next();
	sql = "select count(*) from attack where fid='"+fid+"'";
	int count = Dao.getCount(sql);
map = new HashMap<Object,Object>(); map.put("label", fid); map.put("y", count); list.add(map);
}
String dataPoints = gsonObj.toJson(list);
List<Map<Object,Object>> list1 = new ArrayList<Map<Object,Object>>();
sql = "select fid from data1";
List<String> lt1 = Dao.getFid(sql);
Iterator<String> itr1 = lt1.iterator();
while(itr1.hasNext()){
	String fid = itr1.next();
	sql = "select count(*) from keyrequest where fid='"+fid+"'";
	int count = Dao.getCount(sql);
map = new HashMap<Object,Object>(); map.put("label", fid); map.put("y", count); list1.add(map);
}
String dataPoints1 = gsonObj.toJson(list1);
%>
<script type="text/javascript">
window.onload = function() { 
 
var chart = new CanvasJS.Chart("chartContainer", {
	theme: "light2",
	animationEnabled: true,
	exportFileName: "New Year Resolutions",
	exportEnabled: true,
	title:{
		text: "Attacked Files"
	},
	data: [{
		type: "pie",
		showInLegend: true,
		legendText: "{label}",
		toolTipContent: "{label}: <strong>{y}%</strong>",
		indexLabel: "{label} {y}",
		dataPoints : <%out.print(dataPoints);%>
	}]
});

var chart1 = new CanvasJS.Chart("chartContainer1", {
	theme: "light2",
	animationEnabled: true,
	exportFileName: "New Year Resolutions",
	exportEnabled: true,
	title:{
		text: "Request Files"
	},
	data: [{
		type: "pie",
		showInLegend: true,
		legendText: "{label}",
		toolTipContent: "{label}: <strong>{y}%</strong>",
		indexLabel: "{label} {y}",
		dataPoints : <%out.print(dataPoints1);%>
	}]
});
chart.render();
chart1.render();
}
</script>
			</div>
		</div>
	</div>
	<div id="wrapper">
	<div id="three-column" class="container" style="text-align:justify;text-align-last: center;">
		<div class="title">
			<h2><b>DESIGN OF THE DYNAMIC ENCRYPTION SCHEME </b></h2>
			<span class="byline" style="font-weight:bold">The basic procedures of the proposed encryption scheme</span>
		</div>
		
		<div class="boxA">
			<p> In this step, the plain-text is converted to a 
binary intermediate sequence z1 based on a high-dimensional binary invertible matrix generated by the concept of NC. The main purpose of this step is to extend the key space of the algorithm, so as to resist the exhaustive attack.  </p>
			<a href="#" class="button button-alt" style=" width:350px;margin-top:33px; padding-left:8px;"> Inner-Layer Encryption Embedding NC</a>
		</div>
		<div class="boxB">
			<p> The middle layer encryption step adopts DES to encode intermediate sequence z1, and get another intermediate sequence z2. The main purpose of this step to bring non-linearity into the encryption scheme, and hence to effectively defense the analysis attack. </p>
			<a href="#" class="button button-alt" style="margin-left:25px;" >Middle-Layer DES Encryption</a>
		</div>
		<div class="boxC"  >
			<p> In this, NC is adopted again to generate a low-dimensional binary invertible matrix  to encode intermediate sequence z2, and the cipher-text is subsequently obtained. The purpose is to construct the triple encryption model to resist the man-in-the-middle attack. </p>
			<a href="#" class="button button-alt" style = "margin-top:4px" >Outer-Layer Encryption Embedding NC</a>
		</div>
		<div class="boxD" style="padding-left:400px; padding-top:270px; width:400px">
			<p>The dynamic update procedure to the ciphertext can be regarded as a rerun of step (c) based on a new binary encoding matrix. It is particularly designed to realize dynamic security protection. The flexibility to choose the new binary encoding matrix endows a tradeoff between efficiency and security, which enhances the adaptability to different application scenarios. </p>
			<a href="#" class="button button-alt">Dynamic Update of the Ciphertext</a>
		</div>
		
	</div>
</div>
<div id="welcome">
	<div class="container">
		<div class="title">
			<h2>GENERAL DESCRIPTION</h2>
			<p style=" font-size:18px;"> <strong>Index Terms:</strong> Moving target defense, dynamic defense theory, cyber security, linear network coding, DES.</p>
 

		</div>
	<p style="text-align:justify;text-align-last: center; font-weight:;"> <strong> Abstract:</strong> Unlike prior efforts in cybersecurity research, a dynamic defense theory, called moving target defense (MTD), increases the complexity and costs for attacks by effectively restricting the vulnerability exposure and the attack opportunities through various continually-changing evaluation, development mechanisms and strategy. Data Encryption Standard (DES) was the classical scheme of the traditional symmetric-key encryption schemes. In this paper, we propose a dynamic 3-layer encryption scheme based on DES and network coding, with a low-complexity partial key update mechanism. Based on the theoretical analysis, the new scheme is shown to have the benefit to achieve a dynamic transition between efficiency and security, which increases its adaptability to various cyber conditions. The simulation results also show that the running ratio of the new scheme is relatively lower than or comparable to the triple DES.
	</p>
		<ul class="actions">
			<li><a href="#" class="button">MORE..</a></li>
		</ul>
	</div>
</div>
<div id="copyright" class="container">
	<p> &copy; All rights reserved | Designed by DCET 2020.</p>
</div>
</body>
</html>