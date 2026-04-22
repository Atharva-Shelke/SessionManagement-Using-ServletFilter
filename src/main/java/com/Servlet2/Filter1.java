package com.Servlet2;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(servletNames = { "Servlet2" })
public class Filter1 extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter: Intercepting request...");

		String ageStr = request.getParameter("age");

		if (!ageStr.isEmpty() && ageStr != null) {
			int age = Integer.parseInt(ageStr);
			if (0 < age & age <= 18) {
				chain.doFilter(request, response);
				return;
			} else if (age > 18) {
				response.getWriter().println("<h1>You are too old to be allowed!!</h1>");
			} else {
				response.getWriter().println("<h1>Invalid age!!</h1>");
			}
		} else {
			response.getWriter().println("<h1>Invalid age!!</h1>");
		}
		response.getWriter().println("<br><a href='Session.jsp'>Go Back</a>");

		System.out.println("__________\nAgain In Filter");

	}

}
