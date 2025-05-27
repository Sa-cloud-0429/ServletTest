package chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Practice02
 */
@WebServlet(urlPatterns={"/chapter6/practice02"})
public class Practice02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practice02() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html; charset=UTF-8");
	
	PrintWriter out=response.getWriter();
	
	request.setCharacterEncoding("UTF-8");
	String[]menus=request.getParameterValues("menu");
	
	Page.header(out);
	if(menus== null) {
		out.println("<p>サイドメニューなしでご提供します。</p>");
	}else {
		out.println("<p>以下のサイドメニューを追加しました。</p>");
		for(String item : menus) {
			out.println("・"+item+"<br>");
		}
		List<String>menuList =Arrays.asList(menus);
		if (menuList.contains("サラダ")&& menuList.contains("スープ")) {
			out.println("<p>サラダ＆スープセット割引が適用されました,</p>");
		}
		
		
	}
		
	}

}
