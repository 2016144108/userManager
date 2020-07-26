package com.example.back.mapper;

import com.example.back.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    public ArrayList<User> selectAllUser();

    @Select("select * from user where id=#{id}")
    public User selectTheUser(int id);

    @Insert("insert into user (name,phone,email,education,school,job,intro) values (#{name},#{phone},#{email},#{education},#{school},#{job},#{intro} ")
    public void insertUser(User user);

    @Delete("delete from user where id=#{id}")
    public void deleteUser(int id);

    @Update("update user set name=#{name},phone=#{phone},email=#{email},education=#{education},school=#{school},job=#{job},intro=#{intro} where id=#{id} ")
    public void updateUser(User user);
}
