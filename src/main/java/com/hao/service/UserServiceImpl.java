package com.hao.service;

import com.hao.dao.UserMapper;
import com.hao.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int addUser(Users users) {
        return userMapper.addUser(users);
    }

    public int updateUser(Users users) {
        return userMapper.updateUser(users);
    }

    public Users queryUserByAct(String account) {
        return userMapper.queryUserByAct(account);
    }

    public List<Users> queryAllUser() {
        return userMapper.queryAllUser();
    }

    public List<Users> queryAllTrueUser() {
        return userMapper.queryAllTrueUser();
    }

    public List<Users> queryAllFalseUser() {
        return userMapper.queryAllFalseUser();
    }

    public int addUser_User(Users users) {
        return userMapper.addUser_User(users);
    }

    public int addUser_Cmp(Users users) {
        return userMapper.addUser_Cmp(users);
    }

    public int updateStatus(String account, int status) {
        return userMapper.updateStatus(account,status);
    }


}
