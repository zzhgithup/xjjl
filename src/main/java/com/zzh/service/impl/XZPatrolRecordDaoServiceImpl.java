package com.zzh.service.impl;

import com.zzh.dao.XZPatrolRecordDao;
import com.zzh.pojo.XZPatrolRecord;
import com.zzh.service.XZPatrolRecordDaoService;
import com.zzh.utils.XZUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/19 16:14
 * @ClassName XZPatrolRecordDaoServiceImpl
 * @Description TODO
 */
@Service
public class XZPatrolRecordDaoServiceImpl implements XZPatrolRecordDaoService {
    @Autowired
    XZPatrolRecordDao xzPatrolRecordDao;
    @Autowired
    XZUtils xzUtils;

    Logger logger= LoggerFactory.getLogger(getClass());
    @Override
    public String getPatrolRecordInfos() {
        logger.info("开始请求数据库");
        ArrayList<XZPatrolRecord> patrolRecordInfos = xzPatrolRecordDao.getPatrolRecordInfos();
        logger.info("请求数据库成功："+patrolRecordInfos);
        logger.info("获取所有巡视记录成功...");
        return patrolRecordInfos.toString();
    }

    @Override
    public String addpatrolrecord(String xsjltime, String xsjlpost, String xsjlclass, String xsjlname) {
        logger.info("开始数据库新增数据操作，参数：巡检时间："+xsjltime+",岗位："+xsjlpost+",班次："+xsjlclass+",姓名："+xsjlname);
        String s = xzUtils.setTimeFomate(xsjltime);
        int addpatrolrecord = xzPatrolRecordDao.addpatrolrecord(xsjltime, xsjlpost, xsjlclass, xsjlname);
        logger.info("数据库新增数据成功，记录数："+addpatrolrecord);
        return "success";
    }

    @Override
    public String delpatrolrecord(String date) {
        logger.info("开始请求删除数据库数据,data="+date);
        ArrayList list = xzUtils.stringToArrayList(date);
        int delpatrolrecord=xzPatrolRecordDao.delpatrolrecord(list);
        logger.info("请求删除数据库数据成功，记录数："+delpatrolrecord);
        return "success";
    }

    @Override
    public String updpatrolrecord(int zting, int ztai, int crk, int sbqf, int kfsb, String date) {
        logger.info("开始执行修改数据库操作,参数：站厅："+zting+",站台："+ztai+",出入口："+crk+",设备区(房)："+sbqf+",客服设备："+kfsb+",时间："+date);
        int updpatrolrecord=xzPatrolRecordDao.updpatrolrecord(zting,ztai,crk,sbqf,kfsb,date);
        logger.info("修改数据库操作成功，记录数："+updpatrolrecord);
        return "success";
    }

    @Override
    public String updpatrolrecordremark(String remark,String date) {
        logger.info("开始执行修改数据库操作,参数：备注："+remark+",时间："+date);
        int updpatrolrecord=xzPatrolRecordDao.updpatrolrecordremark(remark,date);
        logger.info("修改数据库操作成功，记录数："+updpatrolrecord);
        return "success";
    }

    @Override
    public String getInfoByDate(String date) {
        logger.info("开始查询数据库备注信息，data="+date);
        String remark=xzPatrolRecordDao.getInfoByDate(date);
        logger.info("查询数据库备注信息成功，返回结果："+remark);

        return remark;
    }

    @Override
    public String getxzxsjlbycond(String banci, String username, String starttime, String endtime) {
        logger.info("开始根据条件查询数据库，班次："+banci+",姓名："+username+",开始时间："+starttime+",结束时间："+endtime);
        if (banci.equals("null")){
            banci="";
        }
        if (username.equals("null")){
            username="";
        }
        logger.info("转换后数据为，班次："+banci+",姓名："+username+",开始时间："+starttime+",结束时间："+endtime);
        ArrayList<XZPatrolRecord> patrolRecordInfos = xzPatrolRecordDao.getxzxsjlbycond(banci,username,starttime,endtime);
        logger.info("根据条件查询数据库成功：返回结果："+patrolRecordInfos);
        return patrolRecordInfos.toString();
    }
}
