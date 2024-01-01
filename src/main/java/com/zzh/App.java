package com.zzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zzh
 * @Date 2023/12/19 15:10
 * @ClassName App
 * @Description 启动类
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    static {
        System.setProperty("druid.mysql.usePingMethod", "false");
    }
}