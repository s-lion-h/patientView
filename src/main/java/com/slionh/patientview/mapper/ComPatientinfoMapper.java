package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.ComPatientinfo;
import com.slionh.patientview.entity.ComPatientinfoExample;
import com.slionh.patientview.entity.ComPatientinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComPatientinfoMapper {
    int countByExample(ComPatientinfoExample example);

    int deleteByExample(ComPatientinfoExample example);

    int deleteByPrimaryKey(ComPatientinfoKey key);

    int insert(ComPatientinfo record);

    int insertSelective(ComPatientinfo record);

    List<ComPatientinfo> selectByExample(ComPatientinfoExample example);

    ComPatientinfo selectByPrimaryKey(ComPatientinfoKey key);

    int updateByExampleSelective(@Param("record") ComPatientinfo record, @Param("example") ComPatientinfoExample example);

    int updateByExample(@Param("record") ComPatientinfo record, @Param("example") ComPatientinfoExample example);

    int updateByPrimaryKeySelective(ComPatientinfo record);

    int updateByPrimaryKey(ComPatientinfo record);
}