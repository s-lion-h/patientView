package com.slionh.patientview.service;

import com.slionh.patientview.entity.FinOprRegister;

import java.util.HashMap;
import java.util.List;

public interface RegisterService {
    List<FinOprRegister> listPackageByPatientId(String patientId);
    List<FinOprRegister> listPackageByPatientId(List<FinOprRegister> list);
    List<FinOprRegister> listAllRegisterByPatientId(String patientId);
    List<String> listAllToHospitalDateByPatientId(String patientId);
    List<String> listAllToHospitalDateByPatientId(List<FinOprRegister> list);
    HashMap listAllDeptCountByPatientId(String patientId);
    HashMap listAllDeptCountByPatientId(List<FinOprRegister> list);

}
