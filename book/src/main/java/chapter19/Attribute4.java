package chapter19;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Attribute4
 */
@WebServlet(urlPatterns={"/chapter19/attribute4"})
public class Attribute4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		ServletContext context=getServletContext();
		
		String debug=(String)context.getAttribute("debug");
		if(debug.equals("yes")) {
			out.println("<p>デバックモードで実行します。</p>");
		}
		
		int memory=Integer.parseInt(
				(String)context.getAttribute("memory"));
		if(memory<1000000) {
			out.println("<p>省メモリモードで実行します。</p>");
		}
		
		Page.footer(out);
	}

}