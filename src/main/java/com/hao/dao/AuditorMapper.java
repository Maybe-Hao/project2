package com.hao.dao;

import com.hao.pojo.Auditor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditorMapper {
    //插入信息
    int addAuditor(Auditor auditor);
    //status为零且auditorAccount为指定账号的所有列表
    List<Auditor> queryAuditorByAAccount(String auditorAccount);
}
