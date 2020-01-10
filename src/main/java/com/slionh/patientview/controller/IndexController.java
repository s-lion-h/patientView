package com.slionh.patientview.controller;

import com.slionh.patientview.Util.ConstantDictionary;
import com.slionh.patientview.Util.PatientUtil;
import com.slionh.patientview.entity.*;
import com.slionh.patientview.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    int count=1;

    @RequestMapping("/")
    public ModelAndView toDemo(ModelAndView modelAndView,String patientId){
        System.out.println(count+"次请求全览图"+sdf.format(new Date()));
        System.out.println("请勿关闭此窗口！！！");
        count++;

        modelAndView.setViewName("demo");
        if (patientId==null||patientId.equals(""))
            patientId = "9999915790";

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

        List<FinOprRegister> allRegister = registerService.listAllRegisterByPatientId(patientId);

        modelAndView.addObject("registerList", registerService.listPackageByPatientId(allRegister));
        modelAndView.addObject("revisitList", revisitService.listLatestRevisit(patientId));
        modelAndView.addObject("feeDetailList", feeDetailService.listLatestFeedetail(patientId));
        modelAndView.addObject("arriveDates", registerService.listAllToHospitalDateByPatientId(allRegister));

        HashMap map =  registerService.listAllDeptCountByPatientId(allRegister);
        modelAndView.addObject("depts", map.get("depts"));
        modelAndView.addObject("counts", map.get("counts"));

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
