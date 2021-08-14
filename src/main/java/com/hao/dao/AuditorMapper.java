package com.hao.dao;

import com.hao.pojo.Auditor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditorMapper {
    //插入信息
    int addAuditor(Auditor auditor);
    //status为零且auditorAccount为指定账号的所有列表
    List<Auditor> queryAuditorByAAccount(String auditorAccount);
    //删除指定aA和uA的方法
    int deleteAuditorByAAccount(@Param("auditorAccount") String auditorAccount,@Param("userAccount") String userAccount);
}
