package com.hao.dao;

import com.hao.pojo.Books;
import com.hao.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //创建新用户
    int addUser(Users users);
    //修改用户信息
    int updateUser(Users users);
    //通过账号查询用户
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
    int updateStatus(@Param("account") String account,@Param("status")String status);
    //用户注册公司信息后，将信息注入管理员的数据库，通知管理员
}
