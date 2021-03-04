<!DOCTYPE html>  
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.BeanClass"%>
<%@page import="com.serviceimlement.ServiceImplement"%>
<%@page import="com.serviceinterface.ServiceInterface"%>
<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>Insert title here</title>  
</head>  
<body>  
  
<h1>Add New Employee</h1>  
<form action="SaveServlet" method="post">  
<table>  
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>  
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>  
<tr><td>Email:</td><td><input type="email" name="email"/></td></tr>  
<tr><td>Country:</td><td>  
<select name="country" style="width:150px">  
<option>India</option>  
<option>USA</option>  
<option>UK</option>  
<option>Other</option>  
</select>  
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Save Employee"/></td></tr>  
</table> 
<table align="left" border="5" cellpadding="7" >
<h1>Student List</h1>
<tr>
<th>Id</th>
<th>Name</th>
<th>Password</th>
<th>Email</th>
<th>Country</th>
</tr>
<tr>
<% 
ServiceInterface sr=new ServiceImplement();

List<BeanClass> list=sr.getDispaly();
Iterator<BeanClass> itr=list.iterator();
while(itr.hasNext()){
	BeanClass b=itr.next();
%>
</tr>
<tr>
<td><%=b.getId() %></td>
<td><%=b.getName() %></td>
<td><%=b.getPassword() %></td>
<td><%=b.getEmail() %></td>
<td><%=b.getCountry() %></td>

</tr>
<%
}
%>
</table> 
</form>  
  

  
</body>  
</html>  
