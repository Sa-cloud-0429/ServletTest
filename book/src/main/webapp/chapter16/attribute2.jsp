<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../header.html" %>
    <%@ page import="bean.Product, java.util.List" %>
    <% List<Product> List=(List<Product>)request.getAttribute("List"); %>
    
    <% for(Product p : List){ %>
    	<%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>
    	<%} %>
    
<%@ include file="../footer.html" %>>