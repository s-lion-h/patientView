package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.CrmAppointment;
import com.slionh.patientview.entity.CrmAppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmAppointmentMapper {
    int countByExample(CrmAppointmentExample example);

    int deleteByExample(CrmAppointmentExample example);

    int deleteByPrimaryKey(String appointid);

    int insert(CrmAppointment record);

    int insertSelective(CrmAppointment record);

    List<CrmAppointment> selectByExample(CrmAppointmentExample example);

    CrmAppointment selectByPrimaryKey(String appointid);

    int updateByExampleSelective(@Param("record") CrmAppointment record, @Param("example") CrmAppointmentExample example);

    int updateByExample(@Param("record") CrmAppointment record, @Param("example") CrmAppointmentExample example);

    int updateByPrimaryKeySelective(CrmAppointment record);

    int updateByPrimaryKey(CrmAppointment record);
}