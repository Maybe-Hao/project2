package com.hao.service;

import com.hao.pojo.Message;

import java.util.List;

public interface MessageService {
    //更新Message信息
    int UpdateMessage(Message message);
    //增加Message信息
    int addMessage(Message message);
    //查询所有的信息
    List<Message> queryAllMessage();
}
