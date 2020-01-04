package com.aml.loginservice.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@PrimaryKey
	private int userid;
	private String username;
	private String password;
	private String email;
	private String phone;
}
