package chapter6;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Practice01
 */
@WebServlet(urlPatterns={"/chapter6/practice01"})
public class Practice01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practice01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		
		String destination = request.getParameter("destination");
		String days = request.getParameter("days");
		String transport = request.getParameter("transport");
		String campaign = request.getParameter("campaign");
		
		Page.header(out);
		
		out.println("「"+ destination +"」への旅行を"+ days +"日間、交通手段は「"+transport+"」で予約しました。<br>");
		
		if("spring2025".equals(campaign)) {
			out.println("春のキャンペーンを適用しました");
		}else {
			out.println("キャンペーンは適用されていません");
		}
		
		
		Page.footer(out);
	
	}

}
