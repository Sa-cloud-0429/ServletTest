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
 * Servlet implementation class Practicea01
 */
@WebServlet(urlPatterns = { "/chapter6/practicea01" })
public class Practicea01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Practicea01() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String[] comments = request.getParameterValues("comment");

		Page.header(out);
		
		if (comments != null && comments.length > 0 && !comments[0].isEmpty()) {
			out.println("<h3>あなたのコメント一覧</h3>");
			out.println("<ul>");
			for (String comment : comments) {
				if (!comment.trim().isEmpty()) {
					out.println("<li>" + comment + "<li>");

				}
			}
			out.println("</ul>");
		} else {
			out.println("<p>コメントが入力されませんでした</p>");
		}
		
		Page.footer(out);

	}

}
