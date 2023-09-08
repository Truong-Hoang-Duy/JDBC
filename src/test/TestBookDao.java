package test;

import java.util.ArrayList;

import dao.BookDAO;
import model.Book;

public class TestBookDao {
	public static void main(String[] args) {
		/* 
		 * Test insert
		 * Book book1 = new Book("LTJV", "Lập trình Java", 5000, 2023);
		 * Book book2 = new Book("LTC", "Lập trình C", 10000, 2021);
		 * BookDAO.getInstance().insert(book2); 
		 */
		
		/*
		 * Test update 
		 * Book book2 = new Book("LTC", "Lập trình C", 20000, 2025);
		 * BookDAO.getInstance().update(book2);
		 */
		
		/*
		 * Test delete
		 * Book book2 = new Book("LTC", "Lập trình C", 20000, 2025);
		 * BookDAO.getInstance().delete(book2);
		 */
		
		/*
		 * Test select
		 * ArrayList<Book> arrayList = BookDAO.getInstance().selectAll();
		 * for (Book book : arrayList) {
		 * System.out.println(book.toString());
		 * }
		 */
		
		/*
		 * Test select by id
		 */
		Book find = new Book();
		find.setId("LTC");
		Book book2 = BookDAO.getInstance().selectById(find);
		System.out.println(book2);
	}
}
