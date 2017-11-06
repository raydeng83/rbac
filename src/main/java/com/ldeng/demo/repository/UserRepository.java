package com.ldeng.demo.repository;

import com.ldeng.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;


@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
