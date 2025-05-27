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
 * Servlet implementation class Transaction
 */
@WebServlet(urlPatterns={"/chapter14/transaction"})
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
					"java:/comp/env/jdbc/book");
			Connection con=ds.getConnection();
			
			String name=request.getParameter("name");
			int price=Integer.parseInt(request.getParameter("price"));
			
			con.setAutoCommit(false);
			
			PreparedStatement st=con.prepareStatement(
					"insert into product(name,price)values(?,?)");
			st.setString(1, name);
			st.setInt(2, price);
			st.executeUpdate();
			
			st=con.prepareStatement(
					"select * from product where name=?");
			st.setString(1, name);;
			ResultSet rs=st.executeQuery();
			int Line=0;
			while (rs.next()) {
				Line++;
			}
			
			if(Line==1) {
				con.commit();
				out.println("商品を登録しました");
			}else {
				con.rollback();
				out.println("商品は既に登録されています");
			}
			
			con.setAutoCommit(true);
			
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
		}
	}


