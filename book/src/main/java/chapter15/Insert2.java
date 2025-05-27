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
 * Servlet implementation class Insert2
 */
@WebServlet(urlPatterns={"/chapter15/insert2"})
public class Insert2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			String name=request.getParameter("username");
			int price=Integer.parseInt(request.getParameter("price"));
			
			Product p=new Product();
			p.setName(name);
			p.setPrice(price);
			
			ProductDAO dao = new ProductDAO();
			dao.insert(p);
			
			List<Product> List = dao.search("");
			for (Product q : List) {
				out.println(q.getId());
				out.println(":");
				out.println(q.getId());
				out.println(":");
				out.println(q.getPrice());
				out.println("<br>");
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
			
			
		}
	}

