package com.slionh.patientview.service;

import com.slionh.patientview.entity.BdCrmPatient;

public interface PatientService {
    BdCrmPatient getPatientByPaitentId(String id);
}
