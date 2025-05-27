package chapter22;

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
 * Servlet implementation class Attribute2
 */
@WebServlet(urlPatterns = {"/chapter22/jstl"})
public class JSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JSTL() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try {
			ProductDAO dao=new ProductDAO();
			List<Product> List=dao.search("");
			
			request.setAttribute("List", List);
			
			request.getRequestDispatcher("jstl.jsp")
				.forward(request,response);
				
				
		} catch (Exception e) {
			e.printStackTrace(out);
			
		}
	}


}
