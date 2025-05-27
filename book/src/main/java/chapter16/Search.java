package chapter16;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;

/**
 * Servlet implementation class Search
 */
@WebServlet(urlPatterns = { "/chapter16/search4" })
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try {
			String keyword=request.getParameter("keyword");
			
			ProductDAO dao=new ProductDAO();
			List<Product> List = dao.search(keyword);
			
			request.setAttribute("List", List);
			
			request.getRequestDispatcher("attribute2.jsp")
				.forward(request,response);
		} catch (Exception e) {
			e.printStackTrace(out);
			
			
			
			
		}
	}

}
