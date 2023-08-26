package com.example.demo.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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

	/** ユーザー登録 */
	@Override
	public void insertUser(Users user) {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedTimestamp = sdf.format(timestamp);
		user.setCraetedAt(formattedTimestamp);

		userMapper.insertUser(user);
	}

}
