package com.zzh.service.impl;

import com.zzh.dao.ZZOtherEventsDao;
import com.zzh.pojo.OtherEvents;
import com.zzh.service.ZZOtherEventsService;
import com.zzh.utils.XZUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/21 10:00
 * @ClassName ZZOtherEventsServiceImpl
 * @Description TODO
 */
@Service
public class ZZOtherEventsServiceImpl implements ZZOtherEventsService {
    @Autowired
    ZZOtherEventsDao zzOtherEventsDao;

    Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    XZUtils xzUtils;
    @Override
    public String getotherevents() {
        logger.info("开始请求数据库");
        ArrayList<OtherEvents> getotherevents = zzOtherEventsDao.getotherevents();
        logger.info("请求数据库成功："+getotherevents);
        return getotherevents.toString();
    }

    @Override
    public String addotherevent(String qtsjtime, String qtsjpost, String qtsjclass, String qtsjname) {
        logger.info("开始数据库新增数据操作，参数：巡检时间："+qtsjtime+",岗位："+qtsjpost+",班次："+qtsjclass+",姓名："+qtsjname);
        String time = xzUtils.setTimeFomate(qtsjtime);
        int result=zzOtherEventsDao.addotherevent(time,qtsjpost,qtsjclass,qtsjname);
        logger.info("数据库新增数据成功，记录数："+result);
        return "success";
    }

    @Override
    public String delotherevent(String date) {
        logger.info("开始请求删除数据库数据,data="+date);
        ArrayList arrs=xzUtils.stringToArrayList(date);
        int result=zzOtherEventsDao.delotherevent(arrs);
        logger.info("请求删除数据库数据成功，记录数："+result);
        return "success";
    }

    @Override
    public String updothereventsjms(String sjms, String date) {
        logger.info("开始修改数据库事件描述字段");
        int result=zzOtherEventsDao.updothereventsjms(sjms,date);
        logger.info("修改数据库事件描述字段成功，记录数："+result);
        return "success";
    }

    @Override
    public String updothereventsxjbh(String sxjbh, String date) {
        logger.info("开始修改数据库摄像头编号字段");
        int result=zzOtherEventsDao.updothereventsxjbh(sxjbh,date);
        logger.info("修改数据库摄像头编号字段成功，记录数："+result);
        return "success";
    }

    @Override
    public String getqtsjInfoByDate(String date) {
        logger.info("开始根据时间查询数据库单条详细信息");
        OtherEvents otherEvent=zzOtherEventsDao.getqtsjInfoByDate(date);
        logger.info("根据时间查询数据库单条详细信息成功，返回结果："+otherEvent);
        return otherEvent.toString();
    }

    @Override
    public String updqtsj(String date) {
        logger.info("开始修改数据库操作字段");
        int result=zzOtherEventsDao.updqtsj(date);
        logger.info("修改数据库操作字段成功，记录数："+result);
        return "success";
    }

    @Override
    public String getzzqtsjbycond(String banci, String name, String starttime, String endtime) {
        logger.info("开始根据条件查询数据库，班次："+banci+",姓名："+name+",开始时间："+starttime+",结束时间："+endtime);
        if (banci.equals("null")){
            banci="";
        }
        if (name.equals("null")){
            name="";
        }
        logger.info("转换后数据为，班次："+banci+",姓名："+name+",开始时间："+starttime+",结束时间："+endtime);
        ArrayList<OtherEvents> getotherevents = zzOtherEventsDao.getzzqtsjbycond(banci,name,starttime,endtime);
        logger.info("根据条件查询数据库成功：返回结果："+getotherevents);
        return getotherevents.toString();
    }
}
