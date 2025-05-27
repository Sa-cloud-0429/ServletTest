package chapter5;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice02
 */
@WebServlet(urlPatterns={"/chapter5/Practice02"})
public class Practice02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practice02() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet
	(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		LocalDateTime now =LocalDateTime.now();
		int hour = now.getHour();
		
		String greeting;
		if (hour >=5 && hour< 12 ) {
			greeting = "おはようご ざいます";
		}else if(hour>= 12 && hour<18) {
			greeting="こんにちは";
		}else {
			greeting="こんばんは";
		}
		
		int year=now.getYear();
		int month=now.getMonthValue();
		int day=now.getDayOfMonth();
		int minute=now.getMinute();
		
		Page.header(out);
		out.printf("<p>%d年%d月%d日 %d時%d分 %s</p>%n", year, month, day, hour, minute, greeting);
		Page.footer(out);
		
		
		
		
		
		
	}

}
