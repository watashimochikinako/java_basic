package java_basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseRequestServlet1 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.setAttribute("bookTitle", "JSP/サーブレットの本");
	req.getRequestDispatcher("/view/ch11/useRequest.jsp").forward(req, resp);
}
}
