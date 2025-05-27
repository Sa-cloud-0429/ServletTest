package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PracticeA01
 */
@WebServlet(urlPatterns = { "/chapter5/practicea01" })
public class PracticeA01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PracticeA01() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		String color = request.getParameter("color");
		String message = "";

		if (color == null || color.isEmpty()) {
			color = "white";
			message = "色が選択されていません";
		} else {
			switch (color) {
			case "red":
				message = "赤は情熱の色です";
				break;
			case "blue":
				message = "青は冷静さを信頼を表します";
				break;
			case "yellow":
				message = "黄色は元気と希望の色です";
				break;
			case "green":
				message = "緑は自然や安心感を連想させます";
				break;
			default:
				message = "選択された色は未対応です。";
				color = "white";
			}

			out.println("<!DOCTYPE html>");
			out.println("<html><head><meta charset='UTF-8'><title>背景色を変えるフォーム</title></head>");
			out.println("<body style='background-color:" + color + ";'>");
			out.println("<h1>色が選択されました</h1>");
			out.println("<p>" + message + "</p>");
			out.println("</body></html>");

		}

	}

}
