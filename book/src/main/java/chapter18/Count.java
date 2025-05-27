package chapter18;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Count
 */
@WebServlet(urlPatterns = {"/chapter18.Count"})
public class Count extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Count() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Page.header(out);

		Cookie[] cookies = request.getCookies();

		Integer count = null;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("count")) {
					count = Integer.valueOf(cookie.getValue());
					break;
				}
			}
		}
		

			if (count == null)
				count = 0;
			if (count == null)
				count = 0;
			
			count++;

			Cookie cookie = new Cookie("count", count.toString());
			cookie.setMaxAge(60 * 60 * 24);
			response.addCookie(cookie);

			out.println(count);
			Page.footer(out);
		}
	}

