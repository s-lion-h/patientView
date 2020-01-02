package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.CrmPatientlabel;
import com.slionh.patientview.entity.CrmPatientlabelExample;
import com.slionh.patientview.mapper.CrmPatientlabelMapper;
import com.slionh.patientview.service.PatientLabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PatientLabelServiceImpl implements PatientLabelService {
    @Resource
    private CrmPatientlabelMapper crmPatientlabelMapper;

    @Override
    public List<CrmPatientlabel> listLabelByPatientId(String patientId) {
        CrmPatientlabelExample example=new CrmPatientlabelExample();
        example.createCriteria().andPatientIdEqualTo(patientId);
        return crmPatientlabelMapper.selectByExample(example);
    }

    @Override
    public HashMap mapListPatientLabel(String patientId) {
        List<CrmPatientlabel> list = listLabelByPatientId(patientId);
        HashMap map = new HashMap();
        List<CrmPatientlabel> body = new ArrayList<CrmPatientlabel>();
        List<CrmPatientlabel> background = new ArrayList<CrmPatientlabel>();
        List<CrmPatientlabel> character  = new ArrayList<CrmPatientlabel>();
        List<CrmPatientlabel> interest = new ArrayList<CrmPatientlabel>();

        for(CrmPatientlabel label : list){
            if (label.getLabelType()==null||label.getLabelType().equals("")||label.getLabelType()=="LABELTYPE1"){
                body.add(label);
            }
            if (label.getLabelType()=="LABELTYPE2"){
                background.add(label);
            }
            if (label.getLabelType()=="LABELTYPE3"){
                character.add(label);
            }
            if (label.getLabelType()=="LABELTYPE4"){
                interest.add(label);
            }
        }

        map.put("LABELTYPE1",body);
        map.put("LABELTYPE2",background);
        map.put("LABELTYPE3",character);
        map.put("LABELTYPE4",interest);

        return map;
    }

    @Override
    public HashMap mapStringPatientLabel(String patientId) {
        List<CrmPatientlabel> list = listLabelByPatientId(patientId);
        HashMap map = new HashMap();

        String body = "";
        String background = "";
        String character  = "";
        String interest = "";

        for(CrmPatientlabel label : list){
            if (label.getLabelType()==null||label.getLabelType().equals("")||label.getLabelType()=="LABELTYPE1"){
                body+=" |"+label.getLabelContent();
            }
            if (label.getLabelType()=="LABELTYPE2"){
                background+=" |"+label.getLabelContent();
            }
            if (label.getLabelType()=="LABELTYPE3"){
                character+=" |"+label.getLabelContent();
            }
            if (label.getLabelType()=="LABELTYPE4"){
                interest+=" |"+label.getLabelContent();
            }
        }

        map.put("LABELTYPE1",body);
        map.put("LABELTYPE2",background);
        map.put("LABELTYPE3",character);
        map.put("LABELTYPE4",interest);

        return map;
    }
}
