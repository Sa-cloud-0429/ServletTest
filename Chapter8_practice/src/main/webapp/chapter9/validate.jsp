<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String username = request.getParameter("username");
  if(username==null || username.trim().isEmpty()){
	  RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
	  rd.forward(request,response);///フォワード///
  }else if("admin".equals(username)){
	  response.sendRedirect("admin.jsp");///リダイレクト////:
	  
  }else{
	  RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
	  rd.forward(request,response);///フォワード///
  }
 

 