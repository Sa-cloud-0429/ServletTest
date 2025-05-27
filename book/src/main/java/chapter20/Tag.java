package chapter20;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.Product;

/**
 * Servlet implementation class Attribute
 */
@WebServlet(urlPatterns = {"/chapter20/tag"})
public class Tag extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			Product p=new Product();
			p.setId(1);
			p.setName("まぐろ");
			p.setPrice(100);
			
			request.setAttribute("product", p);
			
			request.getRequestDispatcher("tag.jsp")
				.forward(request,response);


		}
}
