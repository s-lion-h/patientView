package com.slionh.patientview.service;

import com.slionh.patientview.entity.CrmPatientlabel;

import java.util.HashMap;
import java.util.List;

public interface PatientLabelService {
    List<CrmPatientlabel> listLabelByPatientId(String patientId);
    HashMap mapListPatientLabel(String patientId);
    HashMap mapStringPatientLabel(String patientId);
}
