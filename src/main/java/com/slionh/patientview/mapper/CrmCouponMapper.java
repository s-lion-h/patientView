package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.CrmCoupon;
import com.slionh.patientview.entity.CrmCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmCouponMapper {
    int countByExample(CrmCouponExample example);

    int deleteByExample(CrmCouponExample example);

    int deleteByPrimaryKey(String accountno);

    int insert(CrmCoupon record);

    int insertSelective(CrmCoupon record);

    List<CrmCoupon> selectByExample(CrmCouponExample example);

    CrmCoupon selectByPrimaryKey(String accountno);

    int updateByExampleSelective(@Param("record") CrmCoupon record, @Param("example") CrmCouponExample example);

    int updateByExample(@Param("record") CrmCoupon record, @Param("example") CrmCouponExample example);

    int updateByPrimaryKeySelective(CrmCoupon record);

    int updateByPrimaryKey(CrmCoupon record);
}