package com.slionh.patientview.service;

import com.slionh.patientview.entity.BdComDictionary;

import java.util.List;

public interface DictionaryService {
    List<BdComDictionary> listDictionary(String type);
}
