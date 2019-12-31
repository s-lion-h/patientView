package com.slionh.patientview.service;

import com.slionh.patientview.entity.ComPatientinfo;

public interface ComPatientinfoService {
    ComPatientinfo getComPatientinfoByCardNo(String card_no,String hospitalId);
    ComPatientinfo getComPatientinfoByPatientId(String patientId);
}
