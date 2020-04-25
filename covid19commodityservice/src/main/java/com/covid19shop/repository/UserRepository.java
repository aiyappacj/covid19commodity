package com.covid19shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.covid19shop.model.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAndPasswordAndUsertype(String email, String password, String usertype);

}
