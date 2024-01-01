package com.zzh.controller;

import com.zzh.service.impl.XZEquipInspectionServiceImpl;
import com.zzh.utils.XZUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/21 9:51
 * @ClassName XZEquipInspectionController
 * @Description TODO
 */
@RestController
@CrossOrigin
@RequestMapping("/xz")
public class XZEquipInspectionController {
    @Autowired
    XZEquipInspectionServiceImpl xzEquipInspectionService;

    Logger logger= LoggerFactory.getLogger(getClass());
    @GetMapping("/getequipinspections")
    public String getequipinspections(){
        logger.info("请求获取所有设备检查记录");
        String equipinspections=xzEquipInspectionService.getequipinspections();
        logger.info("获取所有设备检查记录查询成功...");
        return equipinspections;
    }



    @GetMapping("/delequipinspection/{date}")
    public String delequipinspection(@PathVariable String date){
        logger.info("请求根据时间删除设备检查记录");
        String equipinspections=xzEquipInspectionService.delequipinspection(date);
        logger.info("删除设备检查记录成功...");
        return equipinspections;
    }
    //    设备检查
    @PostMapping("/addequipinspection/{sbjctime}/{sbjcpost}/{sbjcclass}/{sbjcname}")
    public String addequipinspection(@PathVariable("sbjctime") String sbjctime, @PathVariable("sbjcpost") String sbjcpost, @PathVariable("sbjcclass") String sbjcclass, @PathVariable("sbjcname") String sbjcname){
        logger.info("请求新增设备检查记录");
        String equipinspections=xzEquipInspectionService.addequipinspection(sbjctime,sbjcpost,sbjcclass,sbjcname);
        logger.info("新增设备检查记录成功...");
        return equipinspections;
    }

//    updequipinspection
    @PostMapping("updequipinspection/{zhjk}/{ibp}/{date}")
    public String updequipinspection(@PathVariable("zhjk") int zhjk,@PathVariable("ibp") int ibp,@PathVariable("date") String date){
        logger.info("请求修改设备检查记录确认执行状态");
        String result=xzEquipInspectionService.updequipinspection(zhjk,ibp,date);
        logger.info("设备检查记录确认执行状态修改成功...");
        return result;
    }

    @PostMapping("updequipinspectionremark/{remark}/{date}")
    public String updequipinspectionremark(@PathVariable("remark") String remark,@PathVariable("date") String date){
        logger.info("请求修改设备检查记录备注");
        String result=xzEquipInspectionService.updequipinspectionremark(remark,date);
        logger.info("修改设备检查记录备注成功...");
        return result;
    }

    @GetMapping("getsbjcInfoByDate/{date}")
    public String getsbjcInfoByDate(@PathVariable("date") String date){
        logger.info("获取备注信息");
        String result=xzEquipInspectionService.getsbjcInfoByDate(date);
        logger.info("获取备注信息成功...");
        return result;
    }

    @GetMapping("getxzsbjcbycond/{banci}/{username}/{starttime}/{endtime}")
    public String getxzsbjcbycond(@PathVariable("banci") String banci,@PathVariable("username") String username,@PathVariable("starttime") String starttime,@PathVariable("endtime") String endtime){
        logger.info("根据条件查询行值设备检测记录");
        String name = null;
        try {
            name= URLDecoder.decode(username,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String result=xzEquipInspectionService.getxzsbjcbycond(banci,name,starttime,endtime);
        logger.info("根据条件查询行值设备检测记录成功");
        return result;
    }
}
