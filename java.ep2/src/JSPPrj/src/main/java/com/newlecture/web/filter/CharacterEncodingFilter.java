package com.newlecture.web.filter;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}

}
