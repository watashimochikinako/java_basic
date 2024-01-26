package java_basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForm extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String strNum1 =	req.getParameter("number1");
		String strNum2 =	req.getParameter("number2");
		
		PrintWriter out = resp.getWriter();
        out.println(strNum1 + strNum2);
		//JSPに渡す情報をキーと値で設定
//		req.setAttribute("answer", String.valueOf(answer));
		req.getRequestDispatcher("/view/UseForm.jsp").forward(req, resp);
	}
}
