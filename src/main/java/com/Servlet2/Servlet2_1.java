package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Servlet2_1", urlPatterns = { "/Servlet2_1" })
public class Servlet2_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet2_1: Retrieving Session");
		response.setContentType("text/html");

		HttpSession session = request.getSession(false);
		PrintWriter pw = response.getWriter();

		if (session != null && session.getAttribute("nm") != null) {
			String name = (String) session.getAttribute("nm");

			pw.println("<h2>Session Managed!</h2>");
			pw.println("<h3>Hello " + name + ", this is the second servlet.</h3>");
			pw.println("<br><a href='LogoutServlet'>Click here to Logout</a>");
		} else {
			pw.println("<h2>Wait a minute! WHO ARE YOU?</h2>");
			pw.println("<a href='Session.jsp'>Home</a>");
		}

	}

}
