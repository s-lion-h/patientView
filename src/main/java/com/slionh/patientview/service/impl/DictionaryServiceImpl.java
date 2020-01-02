package com.slionh.patientview.service.impl;

import com.slionh.patientview.entity.BdComDictionary;
import com.slionh.patientview.entity.BdComDictionaryExample;
import com.slionh.patientview.mapper.BdComDictionaryMapper;
import com.slionh.patientview.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Resource
    private BdComDictionaryMapper mapper;

    @Override
    public List<BdComDictionary> listDictionary(String type) {
        BdComDictionaryExample example=new BdComDictionaryExample();
        example.createCriteria().andDictionaryTypeEqualTo(type);
        return mapper.selectByExample(example);
    }
}
