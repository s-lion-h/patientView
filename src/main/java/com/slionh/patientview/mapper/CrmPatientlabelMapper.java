package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.CrmPatientlabel;
import com.slionh.patientview.entity.CrmPatientlabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmPatientlabelMapper {
    int countByExample(CrmPatientlabelExample example);

    int deleteByExample(CrmPatientlabelExample example);

    int deleteByPrimaryKey(String patientlabelId);

    int insert(CrmPatientlabel record);

    int insertSelective(CrmPatientlabel record);

    List<CrmPatientlabel> selectByExample(CrmPatientlabelExample example);

    CrmPatientlabel selectByPrimaryKey(String patientlabelId);

    int updateByExampleSelective(@Param("record") CrmPatientlabel record, @Param("example") CrmPatientlabelExample example);

    int updateByExample(@Param("record") CrmPatientlabel record, @Param("example") CrmPatientlabelExample example);

    int updateByPrimaryKeySelective(CrmPatientlabel record);

    int updateByPrimaryKey(CrmPatientlabel record);
}