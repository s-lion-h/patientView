package com.slionh.patientview.service;

import com.slionh.patientview.entity.CrmCoupon;

public interface CouponService {
    CrmCoupon getCouponByPatientId(String patientId);
}
