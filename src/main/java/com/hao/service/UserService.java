package com.hao.service;

import com.hao.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //创建新用户
    int addUser(Users users);
    //修改用户信息
    int updateUser(Users users);
    //查询所有的用户
    //List<Books> queryAllBook();
    Users queryUserByAct(@Param("account") String account);
    //查询所有注册用户
    List<Users> queryAllUser();
    //查询已通过的用户
    List<Users> queryAllTrueUser();
    //查询未通过的用户（包括未审核）
    List<Users> queryAllFalseUser();
    //插入用户信息第一部分
    int addUser_User(Users users);
    //插入用户信息第二部分
    int addUser_Cmp(Users users);
    //审核通过，让status为1
    int updateStatus(@Param("account") String account,@Param("status")int status);;
}
