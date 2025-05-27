package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Total2
 */
@WebServlet(urlPatterns = { "/chapter5/total2" })
public class Total2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Total2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		try {
			int price=Integer.parseInt(request.getParameter("price"));
			int count=Integer.parseInt(request.getParameter("count"));
			int delivery=Integer.parseInt(
						request.getParameter("delivery"));
			
			Page.header(out);
			out.println(price+"円×");
			out.println(count+"個＋");
			out.println("送料"+delivery+"円=");
			out.println((price*count+delivery)+"円");
			Page.footer(out);
		} catch (NumberFormatException e) {
			out.println("数値を入力してください");
		
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
