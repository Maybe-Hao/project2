package com.hao.service;

import com.hao.dao.MessageMapper;
import com.hao.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageServiceImpl implements MessageService{
    @Autowired
    private MessageMapper messageMapper;

    public void setMessageMapper(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }
    //传入message，通过查找account（主键），来更新日期以及内容
    public int UpdateMessage(Message message) {
        return messageMapper.UpdateMessage(message);
    }
    //添加信息
    public int addMessage(Message message) {
        return messageMapper.addMessage(message);
    }

    public List<Message> queryAllMessage() {
        return messageMapper.queryAllMessage();
    }
}
