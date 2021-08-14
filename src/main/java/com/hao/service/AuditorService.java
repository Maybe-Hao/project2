package com.hao.service;

import com.hao.pojo.Auditor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuditorService {
    //插入信息
    int addAuditor(Auditor auditor);
    //status为零且auditorAccount为指定账号的所有列表
    List<Auditor> queryAuditorByAAccount(String auditorAccount);
    //删除指定aA和uA的方法
    int deleteAuditorByAAccount(@Param("auditorAccount") String auditorAccount, @Param("userAccount") String userAccount);
}
