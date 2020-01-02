package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.BdComEmployee;
import com.slionh.patientview.mapper.BdComEmployeeMapper;
import com.slionh.patientview.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private BdComEmployeeMapper mapper;

    @Override
    public BdComEmployee getEmployeeById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
