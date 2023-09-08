package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection connection = null;
	
		try {
			//Đăng ký với MySQL Driver với DriverManager
			DriverManager.registerDriver(new Driver());
			
			//Các thông số của mySQL
			String url = "jdbc:mySQL://localhost:3306/bookstore";
			String username = "root";
			String password = "";
			
			//Tạo kết nối
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			if (connection!=null) {
				connection.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection connection) {
		if (connection!=null) {
			try {
				System.out.println(connection.getMetaData().toString());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
