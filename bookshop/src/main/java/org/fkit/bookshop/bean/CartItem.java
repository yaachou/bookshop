package org.fkit.bookshop.bean;

public class CartItem {
	private int bookId;
	private String bookname;	
	private float price;
	private int quantity;
	
	private String desc;

	public CartItem(int id, String name, float price, int quantity) {
		this.bookId = id;
		this.bookname = name;
		this.price = price;
		this.quantity = quantity;		
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getId() {
		return bookId;
	}

	public void setId(int id) {
		this.bookId = id;
	}

	public String getName() {
		return bookname;
	}

	public void setName(String name) {
		this.bookname = name;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSum() {
		return this.quantity * this.price;
	}
}
