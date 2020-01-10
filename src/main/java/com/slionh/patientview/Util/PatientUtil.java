package com.slionh.patientview.Util;


import java.util.Calendar;
import java.util.Date;

public class PatientUtil {
    public static Integer getYearByBirthday(Date date){
        if (date==null){
            return 0;
        }
        Calendar now = Calendar.getInstance();
        Calendar born = Calendar.getInstance();

        now.setTime(new Date());
        born.setTime(date);

        if(born.after(now)){
            throw new IllegalArgumentException("Can't be born in the future");
        }

        int age = now.get(Calendar.YEAR)-born.get(Calendar.YEAR);
        if(now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR)) {
            age -= 1;
        }
        return age;
    }
}
