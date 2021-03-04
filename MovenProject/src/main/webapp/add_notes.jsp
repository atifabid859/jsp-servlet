<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@ include file="all_js_css.jsp"%>
</head>
<body>
<div class="container">
		<%@ include file="mavbar.jsp"%>
		<h1>please fill your notes details</h1>
		
		<!--this is add form  -->
		
		<form action="SaveNoteServlet" method="post">
  <div class="form-group">
    <label for="title">Note title</label>
    <input type="text" name="title" class="form-control" id="title" aria-describedby="emailHelp" 
    placeholder="Enter here"  required="required">
    
  </div>
  <div class="form-group">
    <label for="content">Note Content</label>
    <textarea required="required" name="content" id="content" placeholder="Enter your content here"class="form-control"style="height: 300px"></textarea>
  </div>
  <div class="container text-center">
    <button type="submit" class="btn btn-primary">add</button>
  </div>
  
</form>
		
	</div>
</body>
</html>