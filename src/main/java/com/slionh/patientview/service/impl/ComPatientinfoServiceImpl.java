package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.ComPatientinfo;
import com.slionh.patientview.entity.ComPatientinfoExample;
import com.slionh.patientview.entity.ComPatientinfoKey;
import com.slionh.patientview.entity.CrmCoupon;
import com.slionh.patientview.mapper.ComPatientinfoMapper;
import com.slionh.patientview.service.ComPatientinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ComPatientinfoServiceImpl implements ComPatientinfoService {
    @Resource
    private ComPatientinfoMapper comPatientinfoMapper;


    @Override
    public ComPatientinfo getComPatientinfoByCardNo(String card_no,String hospitalId) {
        ComPatientinfoKey key=new ComPatientinfoKey(card_no,hospitalId);

        return comPatientinfoMapper.selectByPrimaryKey(key);
    }

    @Override
    public ComPatientinfo getComPatientinfoByPatientId(String patientId) {
        ComPatientinfoExample example = new ComPatientinfoExample();
        example.createCriteria().andCrmidEqualTo(patientId);

        List<ComPatientinfo> list = comPatientinfoMapper.selectByExample(example);

        if (list.size()>0){
            return list.get(0);
        }else{
            return new ComPatientinfo();
        }
    }
}
