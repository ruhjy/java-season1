package com.newlecture.web;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/hi1")
public class Nana1 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		String cnt_ = request.getParameter("cnt");
		int cnt = 20;
		if (cnt_ != null && !cnt_.equals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		for (int i = 0; i < cnt; i++) {
			out.println((i + 1) + ": 안녕 Servlet!!<br>");
		}
	}
}
