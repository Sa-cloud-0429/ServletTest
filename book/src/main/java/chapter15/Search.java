package chapter15;

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
import tool.Page;

/**
 * Servlet implementation class Search
 */
@WebServlet(urlPatterns = { "/chapter15/search" })
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response); // GETでもPOSTと同じ処理をするように
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Page.header(out);

		try {
			String keyword = request.getParameter("keyword");

			ProductDAO dao = new ProductDAO();
			List<Product> List = dao.search(keyword);

			for (Product p : List) {
				out.println(p.getId());
				out.println(":");
				out.println(p.getName());
				out.println(":");
				out.println(p.getPrice());
				out.println("<br>");
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);

	}

}
