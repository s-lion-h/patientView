package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.BdComEmployee;
import com.slionh.patientview.entity.BdComEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdComEmployeeMapper {
    int countByExample(BdComEmployeeExample example);

    int deleteByExample(BdComEmployeeExample example);

    int deleteByPrimaryKey(String employeeId);

    int insert(BdComEmployee record);

    int insertSelective(BdComEmployee record);

    List<BdComEmployee> selectByExample(BdComEmployeeExample example);

    BdComEmployee selectByPrimaryKey(String employeeId);

    int updateByExampleSelective(@Param("record") BdComEmployee record, @Param("example") BdComEmployeeExample example);

    int updateByExample(@Param("record") BdComEmployee record, @Param("example") BdComEmployeeExample example);

    int updateByPrimaryKeySelective(BdComEmployee record);

    int updateByPrimaryKey(BdComEmployee record);
}