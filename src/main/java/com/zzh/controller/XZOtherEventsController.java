package com.zzh.controller;

import com.zzh.service.impl.XZOtherEventsServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @Author zzh
 * @Date 2023/12/21 9:54
 * @ClassName XZOtherEvents
 * @Description TODO
 */
@RestController
@CrossOrigin
@RequestMapping("/xz")
public class XZOtherEventsController {
    @Autowired
    XZOtherEventsServiceImpl xzOtherEventsService;
    Logger logger= LoggerFactory.getLogger(getClass());
    @GetMapping("/getotherevents")
    public String getotherevents(){
        logger.info("请求获取所有其他事件记录");
        String result=xzOtherEventsService.getotherevents();
        logger.info("获取所有其他事件记录查询成功...");
        return result;
    }

    @PostMapping("/addotherevent/{qtsjtime}/{qtsjpost}/{qtsjclass}/{qtsjname}")
    public String addotherevent(@PathVariable("qtsjtime") String qtsjtime,@PathVariable("qtsjpost") String qtsjpost,@PathVariable("qtsjclass") String qtsjclass,@PathVariable("qtsjname") String qtsjname){
        logger.info("请求新增其他事件记录");
        System.out.println(qtsjtime+":"+qtsjpost+":"+qtsjclass+":"+qtsjname);
        String addpatrolrecord = xzOtherEventsService.addotherevent(qtsjtime, qtsjpost, qtsjclass, qtsjname);
        logger.info("新增其他事件记录成功...");
        return addpatrolrecord;
    }

    @GetMapping("/delotherevent/{date}")
    public String delotherevent(@PathVariable("date") String date){
        logger.info("请求根据时间删除其他事件记录");
        String result=xzOtherEventsService.delotherevent(date);
        logger.info("删除其他事件记录成功...");
        return result;
    }


    @PostMapping("updothereventsjms/{sjms}/{date}")
    public String updothereventsjms(@PathVariable("sjms") String sjms,@PathVariable("date") String date){
        logger.info("请求修改事件描述");
        String result=xzOtherEventsService.updothereventsjms(sjms,date);
        logger.info("修改事件描述成功...");
        return result;
    }
    @PostMapping("updothereventsxjbh/{sxjbh}/{date}")
    public String updothereventsxjbh(@PathVariable("sxjbh") String sxjbh,@PathVariable("date") String date){
        logger.info("请求修改摄像头编号");
        String result=xzOtherEventsService.updothereventsxjbh(sxjbh,date);
        logger.info("修改摄像头编号成功...");
        return result;
    }

    @GetMapping("getqtsjInfoByDate/{date}")
    public String getqtsjInfoByDate(@PathVariable("date") String date){
        logger.info("根据时间请求单条详细信息");
        String result=xzOtherEventsService.getqtsjInfoByDate(date);
        logger.info("请求单条详细信息成功...");
        return result;
    }

    @GetMapping("updqtsj/{date}")
    public String updqtsj(@PathVariable("date") String date){
        logger.info("请求确认执行状态");
        String result=xzOtherEventsService.updqtsj(date);
        logger.info("确认执行状态成功");
        return result;
    }

    @GetMapping("getxzqtsjbycond/{banci}/{username}/{starttime}/{endtime}")
    public String getxzqtsjbycond(@PathVariable("banci") String banci,@PathVariable("username") String username,@PathVariable("starttime") String starttime,@PathVariable("endtime") String endtime){
        logger.info("根据条件查询行值其他事件记录");
        String name = null;
        try {
            name= URLDecoder.decode(username,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String result=xzOtherEventsService.getxzqtsjbycond(banci,name,starttime,endtime);
        logger.info("根据条件查询行值其他事件记录成功");
        return result;
    }
}
