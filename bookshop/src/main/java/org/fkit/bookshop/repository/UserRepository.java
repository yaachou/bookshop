package org.fkit.bookshop.repository;

import org.fkit.bookshop.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{

}
