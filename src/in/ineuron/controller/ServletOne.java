package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in servlet 1");
		PrintWriter out = response.getWriter();

		out.println("<h1>Heyy Sagar Welcome to Servlet One..</h1>");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/test2");

		requestDispatcher.forward(request, response);
		System.out.println("Control in servlet 1");

	}

}
