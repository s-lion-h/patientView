package com.slionh.patientview.service;

import com.slionh.patientview.entity.FinOprRegister;

import java.util.List;

public interface RegisterService {
    List<FinOprRegister> listPackageByPatientId(String patientId);
    List<FinOprRegister> listAllRegisterByPatientId(String patientId);
    List<String> listAllToHospitalDateByPatientId(String patientId);

}
