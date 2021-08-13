package com.hao.service;

import com.hao.pojo.Message;
import com.hao.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {
    //更新Message信息
    int UpdateMessage(Message message);
    //增加Message信息
    int addMessage(Message message);
    //查询所有的信息
    List<Message> queryAllMessage();
    //查询指定信息
    List<Message> queryMessageByAct(@Param("account") String account);
}
