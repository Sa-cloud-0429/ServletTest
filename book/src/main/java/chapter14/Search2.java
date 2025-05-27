package chapter14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Search2
 */
@WebServlet(urlPatterns = { "/chapter14/search2" })
public class Search2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Search2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Page.header(out);
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(
					"java:/comp/env/jdbc/book");

			Connection con = ds.getConnection();

			int price = Integer.parseInt(
					request.getParameter("price"));

			PreparedStatement st = con.prepareStatement(
					"select * from product where price <=?");
			st.setInt(1, price);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				out.println(rs.getInt("id"));
				out.println(":");
				out.println(rs.getString("name"));
				out.println(":");
				out.println(rs.getInt("price"));
				out.println("<br>");

			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace(out);

		}
		Page.footer(out);

	}
}
