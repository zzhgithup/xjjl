package com.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zzh
 * @Date 2023/12/19 15:26
 * @ClassName XZPatrolRecord
 * @Description 行值巡视记录对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class XZPatrolRecord {
    private int t_id;
    private String t_xjtime;
    private String t_post;
    private String t_classes;
    private String t_username;
    private int t_station_hall;
    private int t_platform;
    private int t_exit;
    private int t_equip_room;
    private int t_customer_equip;
    private String t_remarks;
    private int t_operate;

    @Override
    public String toString() {
        return "{" +
                "\"t_id\":" + t_id +
                ",\"t_xjtime\":\"" + t_xjtime + '"' +
                ",\"t_post\":\"" + t_post + '"' +
                ",\"t_classes\":\"" + t_classes + '"' +
                ",\"t_username\":\"" + t_username + '"' +
                ",\"t_station_hall\":" + t_station_hall +
                ",\"t_platform\":" + t_platform +
                ",\"t_exit\":" + t_exit +
                ",\"t_equip_room\":" + t_equip_room +
                ",\"t_customer_equip\":" + t_customer_equip +
                ",\"t_remarks\":\"" + t_remarks + '"' +
                ",\"t_operate\":" + t_operate +
                '}';
    }
}
