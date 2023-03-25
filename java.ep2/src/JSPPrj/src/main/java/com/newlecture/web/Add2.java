package com.newlecture.web;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/add2")
public class Add2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		String[] num_ = request.getParameterValues("num");
		
		int value = 0, result = 0;
		
		if(num_ != null && !num_.equals("")) {
			for(int i = 0; i< num_.length; i++) {
				int sum = Integer.parseInt(num_[i]);
				result += sum;
			}
		}
		
		response.getWriter().println("result = " + result);
		
	}
}
