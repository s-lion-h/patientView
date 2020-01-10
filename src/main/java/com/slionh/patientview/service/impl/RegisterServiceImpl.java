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
import java.util.HashMap;
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
    public List<FinOprRegister> listPackageByPatientId(List<FinOprRegister> list) {
        int ROWCOUNT=7;

        if (list.size()>0){
            return list.subList(0,list.size()<ROWCOUNT?list.size():ROWCOUNT-1);
        }
        return list;
    }

    @Override
    public List<FinOprRegister> listAllRegisterByPatientId(String patientId) {
//        System.out.println(i+"次访问register");
//        i++;
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

    @Override
    public List<String> listAllToHospitalDateByPatientId(List<FinOprRegister> list) {
        List<String> dates = new ArrayList<String>();

        for (FinOprRegister register:list){
            dates.add(sdf.format(register.getRegDate()));
        }
        return dates;
    }

    @Override
    public HashMap listAllDeptCountByPatientId(String patientId) {
//        List<HashMap> list = new ArrayList<HashMap>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (FinOprRegister register:listAllRegisterByPatientId(patientId)){
            if (map.containsKey(register.getDeptName())){
                map.put(register.getDeptName(),Integer.parseInt(map.get(register.getDeptName()).toString())+1);
            }else{
                map.put(register.getDeptName(),1);
            }
        }

        List<String> depts = new ArrayList<String>();
        List<Integer> counts = new ArrayList<Integer>();

        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {

            depts.add(entry.getKey());
            counts.add(entry.getValue());
        }

        HashMap hashMap = new HashMap();
        hashMap.put("depts",depts);
        hashMap.put("counts",counts);

        return hashMap;
    }

    @Override
    public HashMap listAllDeptCountByPatientId(List<FinOprRegister> list) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (FinOprRegister register:list){
            if (map.containsKey(register.getDeptName())){
                map.put(register.getDeptName(),Integer.parseInt(map.get(register.getDeptName()).toString())+1);
            }else{
                map.put(register.getDeptName(),1);
            }
        }

        List<String> depts = new ArrayList<String>();
        List<Integer> counts = new ArrayList<Integer>();

        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {

            depts.add(entry.getKey());
            counts.add(entry.getValue());
        }

        HashMap hashMap = new HashMap();
        hashMap.put("depts",depts);
        hashMap.put("counts",counts);

        return hashMap;
    }
}
