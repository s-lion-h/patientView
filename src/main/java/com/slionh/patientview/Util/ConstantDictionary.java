package com.slionh.patientview.Util;

import com.slionh.patientview.entity.BdComDictionary;
import com.slionh.patientview.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ConstantDictionary {
    @Autowired
    private DictionaryService dictionaryService;

    public static HashMap dictionary = new HashMap();

    public HashMap getDictionary(String type){
        if (dictionary.containsKey(type)){
            return (HashMap) dictionary.get(type);
        }else{
            HashMap paramMap = new HashMap();
            List<BdComDictionary> list =  dictionaryService.listDictionary(type);

            for(BdComDictionary dic : list){
                paramMap.put(dic.getDictionaryCode(),dic);
            }
            dictionary.put(type,paramMap);
            return paramMap;
        }
    }
}
