<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	    <%
	    /* int x,y;
	   x= Integer.parseInt(request.getParameter("t1"));
	    y=Integer.parseInt(request.getParameter("t2"));
	    out.print(x+y); */
	    String first=request.getParameter("t1");
	    String second=request.getParameter("t2");
	    String calculator=request.getParameter("calculator");
	          
	    int x=Integer.parseInt(first);
	    int y=Integer.parseInt(second);
	    int result=0;
	    if(calculator.equals("+")){
	    	result=x+y;
	    }
	    else if(calculator.equals("-")){
	    	result=x-y;
	    	
	    }
	    else if(calculator.equals("*")){
	    	result=x*y;
	    	
	    }
	    else if(calculator.equals("/")){
	    	result=x/y;
	    	
	    }
	    out.print("this is result"+result);
	    %>

</body>
</html>