package org.fkit.bookshop.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// 用于标记持久化类,Spring Boot项目加载后会自动根据持久化类建表
@Table(name="reader")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	/* 使用@Id指定主键. 
	 * 使用代码@GeneratedValue(strategy=GenerationType.AUTO)指定主键的生成策略,mysql默认的是自增长。 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;// 主键.

	private String username;// 姓名
	
	private String password;// 密码

	private float money; // 余额
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}
}
