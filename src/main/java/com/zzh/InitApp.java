package com.zzh;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author zzh
 * @Date 2023/12/22 11:42
 * @ClassName InitApp
 * @Description 打包初始化启动类
 */
public class InitApp extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
}