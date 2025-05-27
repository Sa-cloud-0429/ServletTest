package chapter19;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    private String message;
    
    public void init() throws ServletException{
    	ServletConfig config=getServletConfig();
    	message=config.getInitParameter("message");
    }
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println(message);
	}

}
