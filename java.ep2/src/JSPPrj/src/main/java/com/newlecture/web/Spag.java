package com.newlecture.web;

import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/spag")
public class Spag extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int num = 0;
		String num_ = request.getParameter("num");
		if (num_ != null && !num_.equals("")) {
			num = Integer.parseInt(num_);
		}

		String result = "";

		if (num % 2 != 0) {
			result = "홀수";
		} else {
			result = "짝수";
		}
		
		String[] names = {"newlec", "dragon"};
		
		Map<String, Object> notice = new HashMap<>();
		notice.put("id", 1);
		notice.put("title", "EL은 좋아요.");
		
		request.setAttribute("notice123", notice);
		request.setAttribute("result", result);
		request.setAttribute("names1", names);
		// redirect
		// forword
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag.jsp");
		dispatcher.forward(request, response);
		
	}
}
