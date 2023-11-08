package com.main.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.main.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User getByEmail(String email);

	User getByEmailAndPassword(String email, String password);

//	public List<User> findByNameAndPassword(String name, String password);

}
