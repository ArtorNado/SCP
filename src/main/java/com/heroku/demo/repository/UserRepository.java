package com.heroku.demo.repository;

import com.heroku.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserLogin(String userLogin);
}
