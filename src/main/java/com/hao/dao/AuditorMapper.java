package com.hao.dao;

import com.hao.pojo.Auditor;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditorMapper {
    //插入信息
    int addAuditor(Auditor auditor);
}
