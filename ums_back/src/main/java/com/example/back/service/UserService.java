package com.example.back.service;

import com.example.back.mapper.UserMapper;
import com.example.back.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service("userService")
public class UserService {
    @Resource(name="userMapper")
    UserMapper userMapper;
    public UserMapper getUserMapper() {
        return userMapper;
    }
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public ArrayList<User> selectAllUser(){
        return userMapper.selectAllUser();
    }

    public User selectTheUser(int id){
        return userMapper.selectTheUser(id);
    }

     public void insertUser(User user){
         userMapper.insertUser(user);
     }

    public void deleteUser(int id){
        userMapper.deleteUser(id);
    }

   public void updateUser(User user){
        userMapper.updateUser(user);
   }
}
