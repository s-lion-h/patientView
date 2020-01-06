package com.slionh.patientview.controller;

import com.slionh.patientview.Util.ConstantDictionary;
import com.slionh.patientview.Util.PatientUtil;
import com.slionh.patientview.entity.BdComEmployee;
import com.slionh.patientview.entity.BdCrmPatient;
import com.slionh.patientview.entity.ComPatientinfo;
import com.slionh.patientview.entity.CrmCoupon;
import com.slionh.patientview.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private ComPatientinfoService comPatientinfoService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CouponService couponService;
    @Autowired
    private ConstantDictionary dictionary;
    @Autowired
    private PatientLabelService patientLabelService;
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PackageService packageService;
    @Autowired
    private RegisterService registerService;
    @Autowired
    private RevisitService revisitService;
    @Autowired
    private FeeDetailService feeDetailService;

    int count=0;

    @RequestMapping("/")
    public ModelAndView toDemo(ModelAndView modelAndView,String patientId){
        System.out.println(count+"index");
        count++;

        modelAndView.setViewName("demo");
        if (patientId==null||patientId.equals(""))
            patientId = "1000059574";

        ComPatientinfo comPatientinfo = comPatientinfoService.getComPatientinfoByPatientId(patientId);
        BdCrmPatient bdCrmPatient = patientService.getPatientByPaitentId(patientId);
        BdComEmployee employee = employeeService.getEmployeeById(bdCrmPatient.getClientmanager());
        CrmCoupon coupon = couponService.getCouponByPatientId(patientId);

        modelAndView.addObject("CRM_PATIENTLEVEL", dictionary.getDictionary("CRM_PATIENTLEVEL"));
        modelAndView.addObject("visitTypeMap", dictionary.getDictionary("VISITTYPE"));
        modelAndView.addObject("visitDeptMap", dictionary.getDictionary("CRM_GHCPRIV"));
        modelAndView.addObject("patientInfo",bdCrmPatient);
        modelAndView.addObject("hisPatientInfo",comPatientinfo);
        modelAndView.addObject("clientManager", employee==null?new BdComEmployee():employee);
        modelAndView.addObject("coupon", coupon);
        modelAndView.addObject("year", PatientUtil.getYearByBirthday(comPatientinfo.getBirthday()));
        modelAndView.addObject("patientlabel", patientLabelService.mapStringPatientLabel(patientId));
        modelAndView.addObject("latestAppointment", appointmentService.getLatestAppointmentByPatientId(patientId));
        modelAndView.addObject("packageList", packageService.listPackageByPatientId(patientId));
        modelAndView.addObject("registerList", registerService.listPackageByPatientId(patientId));
        modelAndView.addObject("revisitList", revisitService.listLatestRevisit(patientId));
        modelAndView.addObject("feeDetailList", feeDetailService.listLatestFeedetail(patientId));
        modelAndView.addObject("arriveDates", registerService.listAllToHospitalDateByPatientId(patientId));

        return  modelAndView;
    }

    @RequestMapping("/demo")
    public ModelAndView toIndex(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        modelAndView.addObject("msg","message");
        return  modelAndView;
    }


    @RequestMapping("oracledemo")
    @ResponseBody
    public BdCrmPatient oracledemo(){
        return patientService.getPatientByPaitentId("1000059574");
    }
}
