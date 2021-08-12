package com.hao.service;

import com.hao.pojo.Message;

public interface MessageService {
    //更新Message信息
    int UpdateMessage(Message message);
    //增加Message信息
    int addMessage(Message message);
}
