package com.slionh.patientview.service.impl;

import com.slionh.patientview.Util.ConstantDictionary;
import com.slionh.patientview.entity.FinOprRegister;
import com.slionh.patientview.entity.FinOprRegisterExample;
import com.slionh.patientview.mapper.FinOprRegisterMapper;
import com.slionh.patientview.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private FinOprRegisterMapper mapper;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    int i=1;

    @Override
    public List<FinOprRegister> listPackageByPatientId(String patientId) {
        int ROWCOUNT=7;
        List<FinOprRegister> list = listAllRegisterByPatientId(patientId);
        if (list.size()>0){
            return list.subList(0,list.size()<ROWCOUNT?list.size():ROWCOUNT-1);
        }
        return list;
    }

    @Override
    public List<FinOprRegister> listAllRegisterByPatientId(String patientId) {
        System.out.println(i+"次访问register");
        i++;
        return mapper.selectAllRegister(patientId);
    }

    @Override
    public List<String> listAllToHospitalDateByPatientId(String patientId) {
        List<String> dates = new ArrayList<String>();
        for (FinOprRegister register:listAllRegisterByPatientId(patientId)){
            dates.add(sdf.format(register.getRegDate()));
        }
        return dates;
    }
}
