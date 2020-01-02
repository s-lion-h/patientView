package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.CrmAppointment;
import com.slionh.patientview.entity.CrmAppointmentExample;
import com.slionh.patientview.mapper.CrmAppointmentMapper;
import com.slionh.patientview.service.AppointmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Resource
    private CrmAppointmentMapper crmAppointmentMapper;

    @Override
    public List<CrmAppointment> listAppointmentByPatientId(String patientId) {
        CrmAppointmentExample example=new CrmAppointmentExample();
        example.createCriteria().andPatientidEqualTo(patientId);
        example.setOrderByClause("appointdate desc");
        return crmAppointmentMapper.selectByExample(example);
    }

    @Override
    public CrmAppointment getLatestAppointmentByPatientId(String patientId) {

        List<CrmAppointment> list = listAppointmentByPatientId(patientId);

        if (list.size()>0){
            return list.get(0);
        }else{
            return new CrmAppointment();
        }
    }
}
