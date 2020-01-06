package com.slionh.patientview.service;

import com.slionh.patientview.entity.CrmRevisit;

import java.util.List;

public interface RevisitService {
    List<CrmRevisit> listLatestRevisit(String patientId);
}
