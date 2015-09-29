package br.unibh.pessoas.persistencia;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class JDBCUtil {
	private static Connection con;

	public static Connection getConnection() throws Exception {
		if (con == null || con.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:20501/unibh", "unibh", "1234");
		}
		return con;
	}

	public static void closeConnection() {

		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
