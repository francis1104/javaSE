package com.itheima.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeUtil {
    private AgeUtil() {
    }

    public static String getAge(String birthday){

        long year;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(birthday);

            year = (new Date().getTime() - date.getTime()) / 1000 / 60 / 60 / 24 / 365;
        } catch (ParseException e) {
            return "18";
        }

        return year+"";

    }
}
