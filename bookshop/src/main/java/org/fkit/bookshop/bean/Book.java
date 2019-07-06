package org.fkit.bookshop.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// 用于标记持久化类,Spring Boot项目加载后会自动根据持久化类建表
@Table(name="book")
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 使用@Id指定主键. 
	 * 使用代码@GeneratedValue(strategy=GenerationType.AUTO)指定主键的生成策略,mysql默认的是自增长。
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;// 主键.

	private String bookname;// 书名

	private float price;// 单价

	private int quantity; // 数量

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
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
}
