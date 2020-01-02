package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.CrmCoupon;
import com.slionh.patientview.entity.CrmCouponExample;
import com.slionh.patientview.mapper.CrmCouponMapper;
import com.slionh.patientview.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {
    @Resource
    private CrmCouponMapper mapper;

    @Override
    public CrmCoupon getCouponByPatientId(String patientId) {
        CrmCouponExample example = new CrmCouponExample();
        example.createCriteria().andPatientidEqualTo(patientId);
        List<CrmCoupon> list = mapper.selectByExample(example);

        if (list.size()>0){
            return list.get(0);
        }else{
            return new CrmCoupon();
        }
    }
}
