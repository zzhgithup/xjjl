package com.zzh.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author zzh
 * @Date 2023/12/20 10:40
 * @ClassName XZUtils
 * @Description TODO
 */
@Component
public class XZUtils {
    Logger logger= LoggerFactory.getLogger(getClass());
    public String setTimeFomate(String dateTime){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        if(dateTime.isEmpty()){
            Date date = new Date();
            String format = simpleDateFormat.format(date);
            return format;
        }else {
            dateTime=dateTime.replace("T"," ");
            return dateTime;
        }
    }

    public ArrayList stringToArrayList(String str){
        logger.info("开始分割字符串："+str);
        ArrayList arrs=new ArrayList();
        String[] strs=str.split(",");
        for(String st:strs){
            arrs.add(st);
        }
        logger.info("分割字符串成功："+arrs);
        return arrs;
    }
}
