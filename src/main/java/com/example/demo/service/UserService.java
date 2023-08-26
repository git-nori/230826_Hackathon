package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.model.Users;

public interface UserService {

	
	/**
	 * ユーザー一覧取得 
	 * @return
	 */
	public Map<String, List<Users>> getUerLists();

	/** ユーザー登録 */
	public void insertUser(Users user);
}
