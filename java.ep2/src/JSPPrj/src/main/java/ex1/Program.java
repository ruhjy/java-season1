package ex1;

import java.sql.*;

import static repository.ConnectionConst.*;

public class Program {

	public static void main(String[] args) throws Exception {

//		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "select * from SYS.NOTICE";

		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con = DriverManager.getConnection(URL, USERID, PWD);
		Connection con = DriverManager.getConnection(URL, USERID, PWD);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

//		if (rs.next()) {
//			String title = rs.getString("TITLE");
//			System.out.println(title);
//		}

		while (rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getNString("TITLE");
			String writerId = rs.getNString("WRITER_ID");
			Date regDate = rs.getDate("REGDATE");
			String content = rs.getString("CONTENT");
			int hit = rs.getInt("HIT");

			System.out.printf(" id :%d, title:%s, writerId:%s, regdate:%s, content:%s, hit%d%n", id, title, writerId,
					regDate, content, hit);
		}

		close(con, stmt, rs);

	}

	private static void close(Connection con, Statement stmt, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
