package chapter15;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet(urlPatterns = { "/chapter15/employee-servlet" })
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			EmployeeDAO dao = new EmployeeDAO();///データベースからDAOくらすのインスタンスを作る//
			List<Employee> list = dao.findAll();///社員全体の情報を受け取る///
			request.setAttribute("employees", list);///上のリストをemployeesという名前で入れる//
			request.getRequestDispatcher("employeelist.jsp").forward(request, response);//employeelist.jspに渡して//
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
///1,ブラウザでアクセスされる
///2,サーバーがURLを受け取って EmployeeServlet クラスの doGet() メソッドを呼ぶ
///3,doGet() の中で、社員の情報を取ってくるために EmployeeDAO クラスの findAll() メソッドを呼び出す
///4,findAll() はデータベースから社員の全レコードを取ってきて、List<Employee>（社員の情報がたくさん入ったリスト）を返す
///5,そのリストを request.setAttribute("employees", list); で「employees」という名前を付けてリクエストにセットする
///6,次に request.getRequestDispatcher("employeelist.jsp").forward(request, response); で、「employeelist.jsp」に処理を渡す
///→ JSPが「employees」という名前でセットされたリストを受け取って、画面（HTML）を作る