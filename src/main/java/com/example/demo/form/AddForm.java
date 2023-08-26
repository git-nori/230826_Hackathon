package com.example.demo.form;

import java.security.Timestamp;

import lombok.Data;

@Data
public class AddForm {
	
	private int userId;
	private String firstName;
	private String firstNameKana;
	private String lastName;
	private String lastNameKana;
	private String characterType;
	private String characterTypeMeta;
	private Timestamp craetedAt;

}
