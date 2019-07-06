package org.fkit.bookshop.service;

import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.fkit.bookshop.bean.Book;
import org.fkit.bookshop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	// 注入UserRepository
	@Autowired 
	private BookRepository bookRepository;

	/**
	 * save,update ,delete 方法需要绑定事务. 使用@Transactional进行事务的绑定.
	 * 
	 * 保存对象
	 * @param Book
	 * @return 包含自动生成的id的User对象        
	 */
	@Transactional
	public Book save(Book Book) {
		return bookRepository.save(Book);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	@Transactional
	public void delete(int id) {
		bookRepository.deleteById(id);
		
	}

	/**
	 * 查询所有数据
	 * 
	 * @return 返回所有User对象
	 */
	public Iterable<Book> getAll() {
		return bookRepository.findAll();
	}
	
	/**
	 * 根据id查询数据
	 * 
	 * @return  返回id对应的User对象
	 */
	public Book getById(Integer id) {
		// 根据id查询出对应的持久化对象
		Optional<Book> op = bookRepository.findById(id);
		return op.get();
	}
	/**
	 * 修改用户对象数据，持久化对象修改会自动更新到数据库
	 * 
	 * @param user
	 */


}
