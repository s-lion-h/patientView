package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.FinOpbFeedetail;
import com.slionh.patientview.mapper.FinOpbFeedetailMapper;
import com.slionh.patientview.service.FeeDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FeeDetailServiceImpl implements FeeDetailService {
    @Resource
    private FinOpbFeedetailMapper mapper;

    @Override
    public List<FinOpbFeedetail> listLatestFeedetail(String patientId) {
        return mapper.listLatestFeeDetail(patientId);
    }
}
