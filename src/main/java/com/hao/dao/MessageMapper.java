package com.hao.dao;

import com.hao.pojo.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {
    //更新Message信息
    int UpdateMessage(Message message);
    //增加Message信息
    int addMessage(Message message);
}
