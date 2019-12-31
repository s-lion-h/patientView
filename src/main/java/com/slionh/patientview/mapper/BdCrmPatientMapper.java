package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.BdCrmPatient;
import com.slionh.patientview.entity.BdCrmPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdCrmPatientMapper {
    int countByExample(BdCrmPatientExample example);

    int deleteByExample(BdCrmPatientExample example);

    int deleteByPrimaryKey(String patientid);

    int insert(BdCrmPatient record);

    int insertSelective(BdCrmPatient record);

    List<BdCrmPatient> selectByExample(BdCrmPatientExample example);

    BdCrmPatient selectByPrimaryKey(String patientid);

    int updateByExampleSelective(@Param("record") BdCrmPatient record, @Param("example") BdCrmPatientExample example);

    int updateByExample(@Param("record") BdCrmPatient record, @Param("example") BdCrmPatientExample example);

    int updateByPrimaryKeySelective(BdCrmPatient record);

    int updateByPrimaryKey(BdCrmPatient record);
}