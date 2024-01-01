package com.zzh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author zzh
 * @Date 2023/12/21 22:32
 * @ClassName PageController
 * @Description 页面访问接口
 */
@Controller
@CrossOrigin
public class PageController {
    Logger logger=LoggerFactory.getLogger(getClass());
    @GetMapping("xjjlpage")
    public String xjjlPage(){
        logger.info("请求巡检记录页面成功");
        return "xjjl";
    }

    @GetMapping("sbjcpage")
    public ModelAndView sbjcPage(){
        logger.info("请求设备监察页面成功");
        return new ModelAndView("sbjc");
    }
}
