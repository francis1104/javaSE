package com.itheima.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeUtil {
    private AgeUtil() {
    }

    public static String getAge(String birthday){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(birthday);

            long year = (new Date().getTime() - date.getTime())/1000/60/60/24/365;
            return year+"";

        }catch (Exception e){
            return "18";
        }
    }
}
