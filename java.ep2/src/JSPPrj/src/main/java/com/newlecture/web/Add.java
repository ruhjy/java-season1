package com.newlecture.web;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/add")
public class Add extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");

		int x = 0;
		int y = 0;

		if (!x_.equals(""))
			x = Integer.parseInt(x_);
		if (!y_.equals(""))
			y = Integer.parseInt(y_);

		response.getWriter().printf("결과 : %d%n", sum(x, y));

	}

	static int sum(int x, int y) {
		return x + y;
	}
}
