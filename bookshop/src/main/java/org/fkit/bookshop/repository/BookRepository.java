package org.fkit.bookshop.repository;

import org.fkit.bookshop.bean.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
