package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserMapper;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	/** ユーザー一覧取得 */
	@Override
	public Map<String, List<Users>> getUerLists() {

		List<Users> userList = userMapper.userLists();

		Map<String, List<Users>> userListMap = userList.stream()
				.collect(Collectors.groupingBy(i -> i.getCharacterType()));

		return userListMap;
	}

}
