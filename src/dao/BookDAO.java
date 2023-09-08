package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Book;

public class BookDAO implements DAOInterface<Book>{
	public static BookDAO getInstance() {
		return new BookDAO();
	}

	@Override
	public int insert(Book t) {
		int ketQua = 0;
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection connection = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statement
			Statement statement = connection.createStatement();
			
			//Bước 3: Thực thi câu lệnh SQL
			String sql = "INSERT INTO Book(id, name, price, yearPublish) VALUES ('"+t.getId()+"', '"+t.getName()+"', "+t.getPrice()+", "+t.getYearPublish()+")";
			System.out.println("Bạn đã thực thi " + sql);
			ketQua = statement.executeUpdate(sql);
			
			//Bước 4: Xử lí kết quả
			System.out.println("Có " + ketQua + " dòng thay đổi");
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(Book t) {
		int ketQua = 0;
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection connection = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statement
			Statement statement = connection.createStatement();
			
			//Bước 3: Thực thi câu lệnh SQL
			String sql = "UPDATE Book SET name='"+t.getName()+"', price="+t.getPrice()+", yearPublish="+t.getYearPublish()+" WHERE id = '"+t.getId()+"'";
			System.out.println("Bạn đã thực thi " + sql);
			ketQua = statement.executeUpdate(sql);
			
			//Bước 4: Xử lí kết quả
			System.out.println("Có " + ketQua + " dòng thay đổi");
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(Book t) {
		int ketQua = 0;
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection connection = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statement
			Statement statement = connection.createStatement();
			
			//Bước 3: Thực thi câu lệnh SQL
			String sql = "DELETE FROM Book WHERE id = '"+t.getId()+"'";
			System.out.println("Bạn đã thực thi " + sql);
			ketQua = statement.executeUpdate(sql);
			
			//Bước 4: Xử lí kết quả
			System.out.println("Có " + ketQua + " dòng thay đổi");
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<Book> selectAll() {
		ArrayList<Book> ketQua = new ArrayList<Book>();
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection connection = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statement
			Statement statement = connection.createStatement();
			
			//Bước 3: Thực thi câu lệnh SQL
			String sql = "SELECT * FROM BOOK";
			System.out.println("Bạn đã thực thi " + sql);
			
			ResultSet rs = statement.executeQuery(sql);
			
			//Bước 4: Xử lí kết quả
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				int yearPublish = rs.getInt("yearPublish");
				
				Book book = new Book(id, name, price, yearPublish);
				ketQua.add(book);
			}
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public Book selectById(Book t) {
		Book ketQua = null;
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection connection = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statement
			Statement statement = connection.createStatement();
			
			//Bước 3: Thực thi câu lệnh SQL
			String sql = "SELECT * FROM Book WHERE id='"+t.getId()+"'";
			System.out.println("Bạn đã thực thi " + sql);
			
			ResultSet rs = statement.executeQuery(sql);
			
			//Bước 4: Xử lí kết quả
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				int yearPublish = rs.getInt("yearPublish");
				
				ketQua = new Book(id, name, price, yearPublish);
			}
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<Book> selectByCondition(String condition) {
		ArrayList<Book> ketQua = new ArrayList<Book>();
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection connection = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statement
			Statement statement = connection.createStatement();
			
			//Bước 3: Thực thi câu lệnh SQL
			String sql = "SELECT * FROM BOOK WHERE "+condition;
			System.out.println("Bạn đã thực thi " + sql);
			
			ResultSet rs = statement.executeQuery(sql);
			
			//Bước 4: Xử lí kết quả
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				int yearPublish = rs.getInt("yearPublish");
				
				Book book = new Book(id, name, price, yearPublish);
				ketQua.add(book);
			}
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

}
