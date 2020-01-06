package com.slionh.patientview.service;

import com.slionh.patientview.entity.FinOpbFeedetail;

import java.util.List;

public interface FeeDetailService {
    List<FinOpbFeedetail> listLatestFeedetail(String patientId);
}
