package com.hao.service;

import com.hao.dao.AuditorMapper;
import com.hao.pojo.Auditor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuditorServiceImpl implements AuditorService{
    @Autowired
    private AuditorMapper auditorMapper;

    public void setAuditorMapper(AuditorMapper auditorMapper) {
        this.auditorMapper = auditorMapper;
    }

    public int addAuditor(Auditor auditor) {
        return auditorMapper.addAuditor(auditor);
    }
    //status为零且auditorAccount为指定账号的所有列表
    public List<Auditor> queryAuditorByAAccount(String auditorAccount) {
        return auditorMapper.queryAuditorByAAccount(auditorAccount);
    }

    public int deleteAuditorByAAccount(String auditorAccount, String userAccount) {
        return auditorMapper.deleteAuditorByAAccount(auditorAccount,userAccount);
    }
}
