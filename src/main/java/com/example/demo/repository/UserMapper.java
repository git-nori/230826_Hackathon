package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Users;

@Mapper
public interface UserMapper {

	/** ユーザー一覧取得 */
	@Select("SELECT * FROM users")
	public List<Users> userLists();

}
