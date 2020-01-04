package com.aml.loginservice.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import com.aml.loginservice.model.User;

public interface UserRepository extends CassandraRepository<User, Integer>{

	@AllowFiltering
//	@Query("select * from user where userid=?")
	public List<User> findByUserid(int id);
}
