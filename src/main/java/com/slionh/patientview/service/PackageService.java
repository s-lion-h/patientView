package com.slionh.patientview.service;

import com.slionh.patientview.entity.ExpPackage;

import java.util.List;

public interface PackageService {
    List<ExpPackage> listPackageByPatientId(String patientId);
}
