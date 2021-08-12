package com.hao.service;

import com.hao.dao.AuditorMapper;
import com.hao.pojo.Auditor;
import org.springframework.beans.factory.annotation.Autowired;

public class AuditorServiceImpl implements AuditorService{
    @Autowired
    private AuditorMapper auditorMapper;

    public void setAuditorMapper(AuditorMapper auditorMapper) {
        this.auditorMapper = auditorMapper;
    }

    public int addAuditor(Auditor auditor) {
        return auditorMapper.addAuditor(auditor);
    }
}
