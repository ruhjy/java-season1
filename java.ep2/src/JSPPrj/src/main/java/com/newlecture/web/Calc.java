package com.newlecture.web;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/calc")
public class Calc extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
		String op = request.getParameter("operator");

		int x = 0;
		int y = 0;

		if (!x_.equals(""))
			x = Integer.parseInt(x_);
		if (!y_.equals(""))
			y = Integer.parseInt(y_);

		int result = 0;

		if (op.equals("덧셈"))
			response.getWriter().printf("result is %d%n", (x + y));
		if (op.equals("뺄셈"))
			response.getWriter().printf("result is %d%n", (x - y));

	}

}
