package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.FinOpbFeedetail;
import com.slionh.patientview.entity.FinOpbFeedetailExample;
import com.slionh.patientview.entity.FinOpbFeedetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinOpbFeedetailMapper {
    int countByExample(FinOpbFeedetailExample example);

    int deleteByExample(FinOpbFeedetailExample example);

    int deleteByPrimaryKey(FinOpbFeedetailKey key);

    int insert(FinOpbFeedetail record);

    int insertSelective(FinOpbFeedetail record);

    List<FinOpbFeedetail> selectByExample(FinOpbFeedetailExample example);

    List<FinOpbFeedetail> listLatestFeeDetail(String patientId);

    FinOpbFeedetail selectByPrimaryKey(FinOpbFeedetailKey key);

    int updateByExampleSelective(@Param("record") FinOpbFeedetail record, @Param("example") FinOpbFeedetailExample example);

    int updateByExample(@Param("record") FinOpbFeedetail record, @Param("example") FinOpbFeedetailExample example);

    int updateByPrimaryKeySelective(FinOpbFeedetail record);

    int updateByPrimaryKey(FinOpbFeedetail record);
}