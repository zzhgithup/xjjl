package com.zzh.service.impl;

import com.zzh.dao.XZEquipInspectionDao;
import com.zzh.pojo.XZEquipInspection;
import com.zzh.service.XZEquipInspectionService;
import com.zzh.utils.XZUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/21 9:53
 * @ClassName XZEquipInspectionServiceImpl
 * @Description TODO
 */
@Service
public class XZEquipInspectionServiceImpl implements XZEquipInspectionService {
    @Autowired
    XZEquipInspectionDao xzEquipInspectionDao;
    @Autowired
    XZUtils xzUtils;

    Logger logger= LoggerFactory.getLogger(getClass());
    @Override
    public String getequipinspections() {
        logger.info("开始请求数据库");
        ArrayList<XZEquipInspection> arrs=xzEquipInspectionDao.getequipinspections();
        logger.info("请求数据库成功："+arrs);
        return arrs.toString();
    }

    @Override
    public String delequipinspection(String date) {
        logger.info("开始请求删除数据库数据,data="+date);
        ArrayList arrayList = xzUtils.stringToArrayList(date);
        int result=xzEquipInspectionDao.delequipinspection(arrayList);
        logger.info("请求删除数据库数据成功，记录数："+result);
        return "success";
    }

    @Override
    public String addequipinspection(String sbjctime, String sbjcpost, String sbjcclass, String sbjcname) {
        logger.info("开始数据库新增数据操作，参数：巡检时间："+sbjctime+",岗位："+sbjcpost+",班次："+sbjcclass+",姓名："+sbjcname);
        String s = xzUtils.setTimeFomate(sbjctime);
        int result=xzEquipInspectionDao.addequipinspection(s,sbjcpost,sbjcclass,sbjcname);
        logger.info("数据库新增数据成功，记录数："+result);
        return "success";
    }

    @Override
    public String updequipinspection(int zhjk, int ibp, String date) {
        logger.info("开始执行修改数据库操作,参数：综合监控："+zhjk+",IBP盘："+ibp+",时间："+date);
        int result=xzEquipInspectionDao.updequipinspection(zhjk,ibp,date);
        logger.info("修改数据库操作成功，记录数："+result);
        return "success";
    }

    @Override
    public String updequipinspectionremark(String remark, String date) {
        logger.info("开始执行修改数据库操作,参数：备注："+remark+",时间："+date);
        int result=xzEquipInspectionDao.updequipinspectionremark(remark,date);
        logger.info("修改数据库操作成功，记录数："+result);
        return "success";
    }

    @Override
    public String getsbjcInfoByDate(String date) {
        logger.info("开始查询数据库备注信息，data="+date);
        String result=xzEquipInspectionDao.getsbjcInfoByDate(date);
        logger.info("查询数据库备注信息成功，返回结果："+result);
        return result;
    }

    @Override
    public String getxzsbjcbycond(String banci, String name, String starttime, String endtime) {
        logger.info("开始根据条件查询数据库，班次："+banci+",姓名："+name+",开始时间："+starttime+",结束时间："+endtime);
        if (banci.equals("null")){
            banci="";
        }
        if (name.equals("null")){
            name="";
        }
        logger.info("转换后数据为，班次："+banci+",姓名："+name+",开始时间："+starttime+",结束时间："+endtime);
        ArrayList<XZEquipInspection> arrs=xzEquipInspectionDao.getxzsbjcbycond(banci,name,starttime,endtime);
        logger.info("根据条件查询数据库成功：返回结果："+arrs);
        return arrs.toString();
    }


}
