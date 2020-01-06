package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.FinOprRegister;
import com.slionh.patientview.entity.FinOprRegisterExample;
import com.slionh.patientview.entity.FinOprRegisterKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinOprRegisterMapper {
    int countByExample(FinOprRegisterExample example);

    int deleteByExample(FinOprRegisterExample example);

    int deleteByPrimaryKey(FinOprRegisterKey key);

    int insert(FinOprRegister record);

    int insertSelective(FinOprRegister record);

    List<FinOprRegister> selectByExample(FinOprRegisterExample example);

    List<FinOprRegister> selectAllRegister(String patientId);

    FinOprRegister selectByPrimaryKey(FinOprRegisterKey key);

    int updateByExampleSelective(@Param("record") FinOprRegister record, @Param("example") FinOprRegisterExample example);

    int updateByExample(@Param("record") FinOprRegister record, @Param("example") FinOprRegisterExample example);

    int updateByPrimaryKeySelective(FinOprRegister record);

    int updateByPrimaryKey(FinOprRegister record);
}