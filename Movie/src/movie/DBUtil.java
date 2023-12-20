package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	static String url = "jdbc:mysql://localhost:3306";
	static	String user = "root";
	static	String pass = "1234";

	public DBUtil() { 
		conn = getConnection();
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			System.out.println("DB작업중 문제 발생: " + e.getMessage());
		}
		return conn;
		//yyy
	}
}
