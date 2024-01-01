package com.zzh.controller;

import com.zzh.service.impl.XZPatrolRecordDaoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLDecoder;
import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/19 15:54
 * @ClassName XZPatrolRecordController
 * @Description 行值操作控制类
 */
@RestController
@CrossOrigin
@RequestMapping("/xz")
public class XZPatrolRecordController {
    @Autowired
    XZPatrolRecordDaoServiceImpl xzPatrolRecordDaoService;

    Logger logger= LoggerFactory.getLogger(getClass());

//    巡视记录
    @GetMapping("/getpatrolrecordinfos")
    public String getPatrolRecordInfos(){
        logger.info("请求获取所有巡视记录");
        return xzPatrolRecordDaoService.getPatrolRecordInfos();
    }

    @PostMapping("/addpatrolrecord/{xsjltime}/{xsjlpost}/{xsjlclass}/{xsjlname}")
    public String addpatrolrecord(@PathVariable("xsjltime") String xsjltime,@PathVariable("xsjlpost") String xsjlpost,@PathVariable("xsjlclass") String xsjlclass,@PathVariable("xsjlname") String xsjlname){
        logger.info("请求新增巡视记录");
        String addpatrolrecord = xzPatrolRecordDaoService.addpatrolrecord(xsjltime, xsjlpost, xsjlclass, xsjlname);
        logger.info("新增巡视记录成功...");
        return addpatrolrecord;
    }

    @GetMapping("/delpatrolrecord/{date}")
    public String delpatrolrecord(@PathVariable("date") String date){
        logger.info("请求根据时间删除巡视记录");
        String result=xzPatrolRecordDaoService.delpatrolrecord(date);
        logger.info("删除巡视记录成功...");
        return result;
    }

    @PostMapping("updpatrolrecord/{zting}/{ztai}/{crk}/{sbqf}/{kfsb}/{date}")
    public String updpatrolrecord(@PathVariable("zting") int zting,@PathVariable("ztai") int ztai,@PathVariable("crk") int crk,@PathVariable("sbqf") int sbqf,@PathVariable("kfsb") int kfsb,@PathVariable("date") String date){
        logger.info("请求修改巡视记录确认执行状态");
        String result=xzPatrolRecordDaoService.updpatrolrecord(zting,ztai,crk,sbqf,kfsb,date);
        logger.info("巡视记录确认执行状态修改成功...");
        return result;
    }

    @PostMapping("updpatrolrecordremark/{remark}/{date}")
    public String updpatrolrecordremark(@PathVariable("remark") String remark,@PathVariable("date") String date){
        logger.info("请求修改巡视记录备注");
        String result=xzPatrolRecordDaoService.updpatrolrecordremark(remark,date);
        logger.info("修改巡视记录备注成功...");
        return result;
    }

    @GetMapping("getInfoByDate/{date}")
    public String getInfoByDate(@PathVariable("date") String date){
        logger.info("获取备注信息");
        String result=xzPatrolRecordDaoService.getInfoByDate(date);
        logger.info("获取备注信息成功...");
        return result;
    }


    @GetMapping("getxzxsjlbycond/{banci}/{username}/{starttime}/{endtime}")
    public String getxzxsjlbycond(@PathVariable("banci") String banci,@PathVariable("username") String username,@PathVariable("starttime") String starttime,@PathVariable("endtime") String endtime){
        logger.info("根据条件查询行值巡视记录");
        String name = null;
        try {
            name=URLDecoder.decode(username,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String result=xzPatrolRecordDaoService.getxzxsjlbycond(banci,name,starttime,endtime);
        logger.info("根据条件查询行值巡视记录成功");
        return result;
    }
//    巡视记录

}
