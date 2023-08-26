package com.example.demo.model;

import java.util.Date;

import lombok.Data;

@Data
public class Users {

	private int userId;
	private String firstName;
	private String firstNameKana;
	private String lastName;
	private String lastNameKana;
	private String characterType;
	private String characterTypeMeta;
	private Date createdAt;
	private Date updatedAt;

}
