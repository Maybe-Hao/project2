package com.hao.dao;

import com.hao.pojo.Message;
import com.hao.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageMapper {
    //更新Message信息
    int UpdateMessage(Message message);
    //增加Message信息
    int addMessage(Message message);
    //查询所有的信息
    List<Message> queryAllMessage();
    //查询指定信息
    Message queryMessageByAct(@Param("account") String account);
}
