<%@page import="ca.sheridancollege.Beans.*"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type = "text/css">
body{
background-image:url(question.jpg);
background-size: cover;
}

h1{
	font-size:70px;
	color:pink;
	font-weight: bolder;
}

h2{
	color:pink;
	font-weight: bolder;
	
}

form{
	font-size:40px;
	color:pink;
}

input[type="radio"]{
	width:30px;
	height:30px;
}

input[type="submit"]{
	font-size:50px;
	background-color:slategrey;
	color:white;
}

	</style>
	
</head>
<body>
     <% Question Q = (Question)session.getAttribute("question"); %>
     <%-- <% session.setAttribute("Answer", Q); %> --%>
     
	<h2>Category : <%= Q.getCategory() %></h2>
	<h2>Worth : <%= Q.getValue() %></h2>
        
       
	<h1><%= Q.getQuestion() %></h1><br>
	
	<form action="answer" align="center">
		<input type="radio" name="ans" value="<%= Q.getAnswer1() %>"/> A) <%= Q.getAnswer1() %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		<input type="radio" name="ans" value="<%= Q.getAnswer2() %>"/> B) <%= Q.getAnswer2() %>
		<br><br><br>
		
		<input type="radio" name="ans" value=" <%= Q.getAnswer3() %>"/> C) <%= Q.getAnswer3() %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		<input type="radio" name="ans" value="<%= Q.getAnswer4() %>"/> D) <%= Q.getAnswer4() %>
		
	<br> <br><br><br>
	<input type="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit" value="Skip"/>
	</form>

</body>
</html>
