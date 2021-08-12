package com.hao.service;

import com.hao.pojo.Auditor;

import java.util.List;

public interface AuditorService {
    //插入信息
    int addAuditor(Auditor auditor);
    //status为零且auditorAccount为指定账号的所有列表
    List<Auditor> queryAuditorByAAccount(String auditorAccount);
}
