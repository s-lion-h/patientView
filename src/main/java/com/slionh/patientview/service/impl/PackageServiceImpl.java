package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.ExpPackage;
import com.slionh.patientview.mapper.ExpPackageMapper;
import com.slionh.patientview.service.PackageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {
    @Resource
    private ExpPackageMapper expPackageMapper;


    @Override
    public List<ExpPackage> listPackageByPatientId(String patientId) {
        return expPackageMapper.selectFatherPackage(patientId);
    }
}
