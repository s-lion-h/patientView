package com.slionh.patientview.service.impl;

import com.slionh.patientview.Util.ConstantDictionary;
import com.slionh.patientview.entity.CrmRevisit;
import com.slionh.patientview.mapper.CrmRevisitMapper;
import com.slionh.patientview.service.RevisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class RevisitServiceImpl implements RevisitService {
    @Resource
    private CrmRevisitMapper crmRevisitMapper;
//    @Autowired
//    private ConstantDictionary dictionary;

    @Override
    public List<CrmRevisit> listLatestRevisit(String patientId) {
//        HashMap visitTypeMap = dictionary.getDictionary("VISITTYPE");

        return crmRevisitMapper.selectLatestRevisit(patientId);
    }
}
