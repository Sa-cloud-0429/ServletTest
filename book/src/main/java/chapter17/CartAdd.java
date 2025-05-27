package chapter17;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import bean.Product;
import tool.Page;

/**
 * Servlet implementation class CartAdd
 */
@WebServlet(urlPatterns = { "/chapter17/cart-add" })
public class CartAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		String name=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		
		HttpSession session=request.getSession();
		
		List<Product> cart=(List<Product>)session.getAttribute("cart");
		if(cart==null) {
			cart=new ArrayList<Product>();
		}
		
		Product p=new Product();
		p.setName(name);
		p.setPrice(price);
		cart.add(p);
		
		session.setAttribute("cart", cart);
		
		out.println("カートに追加しました");
		Page.footer(out);
		
		
				
				
				
				
	}
}
