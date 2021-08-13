package com.hao.dao;

import com.hao.pojo.Message;
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
}
