package com.zzh.controller;

import com.zzh.service.impl.ZZPatrolRecordDaoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @Author zzh
 * @Date 2023/12/21 9:58
 * @ClassName ZZPatrolRecordController
 * @Description TODO
 */
@RestController
@CrossOrigin
@RequestMapping("/zz")
public class ZZPatrolRecordController {
    @Autowired
    ZZPatrolRecordDaoServiceImpl zzPatrolRecordDaoService;

    Logger logger= LoggerFactory.getLogger(getClass());
    @GetMapping("/getpatrolrecordinfos")
    public String getPatrolRecordInfos(){
        logger.info("请求获取所有巡视记录");
        return zzPatrolRecordDaoService.getPatrolRecordInfos();
    }

    @PostMapping("/addpatrolrecord/{xsjltime}/{xsjlpost}/{xsjlclass}/{xsjlname}")
    public String addpatrolrecord(@PathVariable("xsjltime") String xsjltime,@PathVariable("xsjlpost") String xsjlpost,@PathVariable("xsjlclass") String xsjlclass,@PathVariable("xsjlname") String xsjlname){
        logger.info("请求新增巡视记录");
        String addpatrolrecord = zzPatrolRecordDaoService.addpatrolrecord(xsjltime, xsjlpost, xsjlclass, xsjlname);
        logger.info("新增巡视记录成功...");
        return addpatrolrecord;
    }

    @GetMapping("/delpatrolrecord/{date}")
    public String delpatrolrecord(@PathVariable("date") String date){
        logger.info("请求根据时间删除巡视记录");
        String result=zzPatrolRecordDaoService.delpatrolrecord(date);
        logger.info("删除巡视记录成功...");
        return result;
    }

    @PostMapping("updpatrolrecord/{glyf}/{sbqtd}/{wb}/{crk}/{dxss}/{zzsb}/{dft}/{ztm}/{afc}/{ckxw}/{gwjl}/{date}")
    public String updpatrolrecord(@PathVariable("glyf") int glyf,@PathVariable("sbqtd") int sbqtd,@PathVariable("wb") int wb,@PathVariable("crk") int crk,@PathVariable("dxss") int dxss,@PathVariable("zzsb") int zzsb,@PathVariable("dft") int dft,@PathVariable("ztm") int ztm,@PathVariable("afc") int afc,@PathVariable("ckxw") int ckxw,@PathVariable("gwjl") String gwjl,@PathVariable("date") String date){
        logger.info("请求修改巡视记录确认执行状态");
        String result=zzPatrolRecordDaoService.updpatrolrecord(glyf,sbqtd,wb,crk,dxss,zzsb,dft,ztm,afc,ckxw,gwjl,date);
        logger.info("巡视记录确认执行状态修改成功...");
        return result;
    }

    @GetMapping("getzzxsjlbycond/{banci}/{username}/{starttime}/{endtime}")
    public String getzzxsjlbycond(@PathVariable("banci") String banci,@PathVariable("username") String username,@PathVariable("starttime") String starttime,@PathVariable("endtime") String endtime){
        logger.info("根据条件查询值站巡视记录");
        String name = null;
        try {
            name= URLDecoder.decode(username,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String result=zzPatrolRecordDaoService.getzzxsjlbycond(banci,name,starttime,endtime);
        logger.info("根据条件查询值站巡视记录成功");
        return result;
    }

}
