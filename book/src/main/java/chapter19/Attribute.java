package chapter19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Attribute
 */
@WebServlet(urlPatterns = {"/chapter19/attribute1"})
public class Attribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		ServletContext context = getServletContext();

		
		String path=context.getRealPath("WEB-INF/setting.txt");
		FileInputStream in=new FileInputStream(path);
		Properties p=new Properties();
		p.load(in);
		in.close();
		
		for(String name : p.stringPropertyNames()) {
			context.setAttribute(name,p.getProperty(name));
		}
		
		out.println("アプリケーション属性を設定しました");
		
		Page.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
