package com.zzh.service.impl;

import com.zzh.dao.ZZPatrolRecordDao;
import com.zzh.pojo.ZZPatrolRecord;
import com.zzh.service.ZZPatrolRecordDaoService;
import com.zzh.utils.XZUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/21 10:01
 * @ClassName ZZPatrolRecordDaoServiceImpl
 * @Description TODO
 */
@Service
public class ZZPatrolRecordDaoServiceImpl implements ZZPatrolRecordDaoService {
    @Autowired
    ZZPatrolRecordDao zzPatrolRecordDao;
    @Autowired
    XZUtils xzUtils;

    Logger logger= LoggerFactory.getLogger(getClass());
    @Override
    public String getPatrolRecordInfos() {
        logger.info("开始请求数据库");
        ArrayList<ZZPatrolRecord> arrs = zzPatrolRecordDao.getPatrolRecordInfos();
        logger.info("请求数据库成功："+arrs);
        logger.info("获取所有巡视记录成功...");
        return arrs.toString();
    }

    @Override
    public String addpatrolrecord(String xsjltime, String xsjlpost, String xsjlclass, String xsjlname) {
        logger.info("开始数据库新增数据操作，参数：巡检时间："+xsjltime+",岗位："+xsjlpost+",班次："+xsjlclass+",姓名："+xsjlname);
        String s = xzUtils.setTimeFomate(xsjltime);
        int addpatrolrecord = zzPatrolRecordDao.addpatrolrecord(xsjltime, xsjlpost, xsjlclass, xsjlname);
        logger.info("数据库新增数据成功，记录数："+addpatrolrecord);
        return "success";
    }

    @Override
    public String delpatrolrecord(String date) {
        logger.info("开始请求删除数据库数据,data="+date);
        ArrayList list = xzUtils.stringToArrayList(date);
        int delpatrolrecord=zzPatrolRecordDao.delpatrolrecord(list);
        logger.info("请求删除数据库数据成功，记录数："+delpatrolrecord);
        return "success";
    }

    @Override
    public String updpatrolrecord(int glyf, int sbqtd, int wb, int crk, int dxss, int zzsb, int dft, int ztm, int afc, int ckxw, String gwjl, String date) {
        logger.info("开始执行修改数据库操作,参数：管理用房："+glyf+",设备区通道："+sbqtd+",围蔽："+wb+",出入口："+crk+",导向设施："+dxss+",自助设备："+zzsb+",电扶梯："+dft+",站台门："+ztm+",AFC设备："+afc+",乘客行为："+ckxw+",岗位纪律："+gwjl+",时间："+date);
        int updpatrolrecord=zzPatrolRecordDao.updpatrolrecord(glyf,sbqtd,wb,crk,dxss,zzsb,dft,ztm,afc,ckxw,gwjl,date);
        logger.info("修改数据库操作成功，记录数："+updpatrolrecord);
        return "success";
    }

    @Override
    public String getzzxsjlbycond(String banci, String name, String starttime, String endtime) {
        logger.info("开始根据条件查询数据库，班次："+banci+",姓名："+name+",开始时间："+starttime+",结束时间："+endtime);
        if (banci.equals("null")){
            banci="";
        }
        if (name.equals("null")){
            name="";
        }
        logger.info("转换后数据为，班次："+banci+",姓名："+name+",开始时间："+starttime+",结束时间："+endtime);
        ArrayList<ZZPatrolRecord> arrs = zzPatrolRecordDao.getzzxsjlbycond(banci,name,starttime,endtime);
        logger.info("根据条件查询数据库成功：返回结果："+arrs);
        return arrs.toString();
    }

}
