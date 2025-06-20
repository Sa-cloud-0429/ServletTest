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
 * Servlet implementation class Attribute5
 */
@WebServlet(urlPatterns={"/chapter19/attribute5"})
public class Attribute5 extends HttpServlet {
	
	public void init()throws ServletException{
		try {
			ServletContext context=getServletContext();
			String path=context.getRealPath("WEB-INF/setting.txt");
			FileInputStream in=new FileInputStream(path);
			Properties p=new Properties();
			p.load(in);
			in.close();
			for (String name:p.stringPropertyNames()) {
				context.setAttribute(name, p.getProperty(name));
			}
		
	}catch(IOException e) {
		throw new ServletException(
				"ファイルの読み込みに失敗しました");
	}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		out.println("アプリケーション属性に設定しました");
		Page.footer(out);
	}

	
}
