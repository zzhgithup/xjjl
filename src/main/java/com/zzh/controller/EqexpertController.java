package com.zzh.controller;

import com.zzh.pojo.Eqexpert;
import com.zzh.pojo.Results;
import com.zzh.service.impl.EqexpertServiceImpl;
import org.apache.ibatis.jdbc.Null;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;



/**
 * @Author zzh
 * @Date 2023/12/22 14:25
 * @ClassName EqexpertController
 * @Description 设备监察数据展示
 */
@RestController
@CrossOrigin
public class EqexpertController {
    public int countNum=0;
    @Autowired
    EqexpertServiceImpl eqexpertService;
    @Autowired
    Results results;

    Logger logger= LoggerFactory.getLogger(getClass());

    @GetMapping("contrast/{num}")
    public String contrast(@PathVariable("num") int num){
        if(num==0){
            logger.info("初始化页面数据");
            getAlmByTwo("null","null");
            logger.info("初始化页面数据成功...");
            return results.toString();
        } else if(num==countNum){
            return num+"";
        }else {
            logger.info("新增查询条件，从新刷新页面");
            return results.toString();
        }
    }

    @GetMapping("getinfos")
    public void getAlmByTwo(@RequestParam("leve") String leve, @RequestParam("system") String system){
        countNum++;
        results.setCountNum(countNum);
        logger.info("设置统计数成功："+countNum);
        ArrayList<Eqexpert> result=eqexpertService.getAlmByTwo(leve,system);
        logger.info("获取信息成功："+result);
        results.setArr(result);
    }

}
