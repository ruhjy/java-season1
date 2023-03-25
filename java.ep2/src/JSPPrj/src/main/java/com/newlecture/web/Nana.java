package com.newlecture.web;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/hi")
public class Nana extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
//		out.println("hello~~@#!@#");
//		for (int i = 0; i < 100; i++) {
//			out.println((i + 1) + ":안녕 Servlet!!<br>");
//		}

		int cnt = Integer.parseInt(request.getParameter("cnt"));
		for (int i = 0; i < cnt; i++) {
			out.println((i + 1) + ": 안녕 Servlet!!<br>");
		}
	}
}
