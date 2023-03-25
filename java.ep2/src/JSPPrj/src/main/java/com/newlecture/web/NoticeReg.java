package com.newlecture.web;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		//request.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		out.print(title);
		out.print(content);
		
		
	}
}
