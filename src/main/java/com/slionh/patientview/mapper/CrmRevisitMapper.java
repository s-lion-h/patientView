package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.CrmRevisit;
import com.slionh.patientview.entity.CrmRevisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmRevisitMapper {
    int countByExample(CrmRevisitExample example);

    int deleteByExample(CrmRevisitExample example);

    int deleteByPrimaryKey(String visitId);

    int insert(CrmRevisit record);

    int insertSelective(CrmRevisit record);

    List<CrmRevisit> selectByExample(CrmRevisitExample example);

    List<CrmRevisit> selectLatestRevisit(String patientId);

    CrmRevisit selectByPrimaryKey(String visitId);

    int updateByExampleSelective(@Param("record") CrmRevisit record, @Param("example") CrmRevisitExample example);

    int updateByExample(@Param("record") CrmRevisit record, @Param("example") CrmRevisitExample example);

    int updateByPrimaryKeySelective(CrmRevisit record);

    int updateByPrimaryKey(CrmRevisit record);
}