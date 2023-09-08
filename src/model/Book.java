package model;

public class Book {
	private String id;
	private String name;
	private float price;
	private int yearPublish;
	
	public Book() {
		super();
	}
	
	public Book(String id, String name, float price, int yearPublish) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.yearPublish = yearPublish;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", yearPublish=" + yearPublish + "]";
	}
	
}
