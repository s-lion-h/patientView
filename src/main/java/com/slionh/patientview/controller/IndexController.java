package com.slionh.patientview.controller;

import com.slionh.patientview.entity.BdCrmPatient;
import com.slionh.patientview.service.PatientService;
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

    @RequestMapping("hello")
    @ResponseBody
    public String demo(){
        return "Hello World";
    }

    @RequestMapping("/")
    public ModelAndView toDemo(ModelAndView modelAndView){
        modelAndView.setViewName("demo");

        modelAndView.addObject("msg","message");
        modelAndView.addObject("patientInfo",patientService.getPatientByPaitentId("1000059574"));
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
//        1000059574
        return patientService.getPatientByPaitentId("1000059574");
    }
}
