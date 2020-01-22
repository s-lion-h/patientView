package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.BdCrmMsgtemplate;
import com.slionh.patientview.entity.BdCrmMsgtemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdCrmMsgtemplateMapper {
    int countByExample(BdCrmMsgtemplateExample example);

    int deleteByExample(BdCrmMsgtemplateExample example);

    int deleteByPrimaryKey(String msgtemplateId);

    int insert(BdCrmMsgtemplate record);

    int insertSelective(BdCrmMsgtemplate record);

    List<BdCrmMsgtemplate> selectByExample(BdCrmMsgtemplateExample example);

    BdCrmMsgtemplate selectByPrimaryKey(String msgtemplateId);

    int updateByExampleSelective(@Param("record") BdCrmMsgtemplate record, @Param("example") BdCrmMsgtemplateExample example);

    int updateByExample(@Param("record") BdCrmMsgtemplate record, @Param("example") BdCrmMsgtemplateExample example);

    int updateByPrimaryKeySelective(BdCrmMsgtemplate record);

    int updateByPrimaryKey(BdCrmMsgtemplate record);
}