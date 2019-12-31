package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.BdCrmPatient;
import com.slionh.patientview.mapper.BdCrmPatientMapper;
import com.slionh.patientview.service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientServiceImpl implements PatientService {
    @Resource
    private BdCrmPatientMapper patientMapper;

    @Override
    public BdCrmPatient getPatientByPaitentId(String id) {
        return patientMapper.selectByPrimaryKey(id);
    }
}
