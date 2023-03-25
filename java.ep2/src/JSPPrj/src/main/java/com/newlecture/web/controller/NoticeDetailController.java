package com.newlecture.web.controller;

import java.io.*;
import java.sql.*;
import java.util.Date;

import com.newlecture.web.entity.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/notice/detail")
public class NoticeDetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "SELECT * FROM NEWLEC.NOTICE WHERE ID=?";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "NEWLEC", "1234");
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			rs.next();

			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			Date regdate = rs.getDate("REGDATE");
			String hit = rs.getString("HIT");
			String files = rs.getString("FILES");
			String content = rs.getString("CONTENT");

			Notice notice = new Notice(id, title, writerId, regdate, hit, files, content);

			request.setAttribute("notice", notice);
			//	request.setAttribute("title", title);
			//	request.setAttribute("writerId", writerId);
			//	request.setAttribute("regdate", regdate);
			//	request.setAttribute("hit", hit);
			//	request.setAttribute("files", files);
			//	request.setAttribute("content", content);

			rs.close();
			pstmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// redirect

		// forward
		request.getRequestDispatcher("/WEB-INF/views/notice/detail.jsp")
				.forward(request, response);

	}
}
