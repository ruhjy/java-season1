package com.newlecture.web;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		String value_ = request.getParameter("value");
		String op = request.getParameter("operator");

		int value = 0, result = 0;

		if (value_ != null && !value_.equals("")) {
			value = Integer.parseInt(value_);
		}

		if (op.equals("=")) {
			int x = 0;
			for (Cookie c : cookies) {
				if (c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}
			
			int y = value;
			
			String operator = "";
			for (Cookie c : cookies) {
				if (c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}
			
			if (operator.equals("+")) {
				result = x + y;
			} else if (operator.equals("-")) {
				result = x - y;
			} else if (operator.equals("*")) {
				result = x * y;
			} else {
				result = x / y;
			}
			
			response.getWriter().println("결과 : " + result);

		} else {
			Cookie valueCookie = new Cookie("value", String.valueOf(value));
			Cookie opCookie = new Cookie("operator", op);
		}
	}
}
//@WebServlet("/calc2")
//public class Calc2 extends HttpServlet {
//
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		ServletContext application = request.getServletContext();
//		HttpSession session = request.getSession();
//		Cookie[] cookies = request.getCookies();
//
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//
//		String value_ = request.getParameter("value");
//		String op = request.getParameter("operator");
//
//		int value = 0, result = 0;
//
//		if (value_ != null && !value_.equals("")) {
//			value = Integer.parseInt(value_);
//		}
//
//		if (op.equals("=")) {
////			int x = (Integer) application.getAttribute("value");
////			int x = (Integer) session.getAttribute("value");
//			int x = 0;
//			for (Cookie c : cookies) {
//				if (c.getName().equals("value")) {
//					x = Integer.parseInt(c.getValue());
//					break;
//				}
//			}
//			int y = value;
////			String operator = (String) application.getAttribute("operator");
////			String operator = (String) session.getAttribute("operator");
//			String operator = "";
//			for (Cookie c : cookies) {
//				if (c.getName().equals("op")) {
//					operator = c.getValue();
//					break;
//				}
//			}
//			if (operator.equals("+")) {
//				result = x + y;
//			} else if (operator.equals("-")) {
//				result = x - y;
//			} else if (operator.equals("*")) {
//				result = x * y;
//			} else {
//				result = x / y;
//			}
//			response.getWriter().println("결과 : " + result);
//
//		} else {
////			application.setAttribute("value", value);
////			application.setAttribute("operator", op);
////			session.setAttribute("value", value);
////			session.setAttribute("operator", op);
//			Cookie valueCookie = new Cookie("value", String.valueOf(value));
//			Cookie opCookie = new Cookie("operator", op);
//
//		}
//	}
//}
