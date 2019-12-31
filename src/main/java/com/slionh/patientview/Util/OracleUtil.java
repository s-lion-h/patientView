package com.slionh.patientview.Util;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

@Service
public class OracleUtil {
    private static String user="crm";
    private static String password="crm";
    private static String url="jdbc:oracle:thin:@192.168.34.10:1521:orcl";
    private static String driverName="oracle.jdbc.driver.OracleDriver";
    private static String key="d5d7781b0799369378ab10bf8fc76555";
    private static String addressUrl="https://restapi.amap.com/v3/geocode/geo?";

    public static Connection getConnnection(){
        Connection conn=null;
        try {
            Class.forName(driverName);
            conn= DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    public ResultSet getResultSet(String sql){
        Connection conn=OracleUtil.getConnnection();
        PreparedStatement psta=null;
        ResultSet rs=null;

        try {
//            psta=conn.prepareStatement("select * from crm_question_answer");
//            psta=conn.prepareStatement("select * from com_patientinfo where home is not null and rownum <"+row);
            psta = conn.prepareStatement(sql);
            rs = psta.executeQuery();

            conn.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }


}
