<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<%
		out.println("<table border=\"1\">");
		out.println("<tr>");
		for(int n=1;n<=3;n++){
			out.println("<th>表头"+n+"</th>");
		}
		out.println("</tr>");
		for(int n=1;n<=2;n++){
			out.println("<tr>");
			for(int m=1;m<=3;m++){
			out.println("<td>&nbsp;</td>");
		}
		out.println("</tr>");
		}
	 %>
  </body>
</html>
