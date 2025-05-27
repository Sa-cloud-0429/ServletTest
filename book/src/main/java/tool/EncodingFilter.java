package tool;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EncodingFilter
 */
@WebFilter(urlPatterns = { "/*" })
public class EncodingFilter implements Filter {
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EncodingFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain
			) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("フィルタの前処理");
		chain.doFilter(request,response);
		
		System.out.println("フィルタの後処理");
	}

	public void init(FilterConfig filterConfig) {
	}

	public void destory() {
	}
}

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
