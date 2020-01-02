package com.slionh.patientview.service;

import com.slionh.patientview.entity.CrmAppointment;

import java.util.List;

public interface AppointmentService {
    List<CrmAppointment> listAppointmentByPatientId(String patientId);
    CrmAppointment getLatestAppointmentByPatientId(String patientId);
}
