package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Users;

@Mapper
public interface UserMapper {

	/** ユーザー一覧取得 */
	@Select("SELECT user_id AS userId,first_name AS firstName,first_name_kana AS firstNameKana,last_name AS lastName,last_name_kana AS lastNameKana,character_type AS characterType,character_type_meta AS characterTypeMeta,created_at AS createdAt,updated_at AS updatedAt FROM users")
	public List<Users> userLists();

	/** ユーザー登録 */
	@Insert("insert into users(user_id,first_name,first_name_kana,last_name,last_name_kana,character_type,character_type_meta,craeted_at)values(#{userId},#{firstName},#{firstNameKana},#{lastName},#{lastNameKana},#{characterType},#{characterTypeMeta},#{craetedAt})")
	public int insertUser(Users user);

}
