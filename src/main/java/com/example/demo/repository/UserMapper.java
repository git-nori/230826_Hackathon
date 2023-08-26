package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Users;

@Mapper
public class UserMapper {

	/** ユーザー一覧取得 */
	public List<Users> userLists();

}
