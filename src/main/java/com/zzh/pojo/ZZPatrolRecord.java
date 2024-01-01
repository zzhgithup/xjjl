package com.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zzh
 * @Date 2023/12/19 15\":11
 * @ClassName ZZPatrolRecord
 * @Description 值站巡视记录对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZZPatrolRecord {
    private int t_id;
    private String t_xstime;
    private String t_post;
    private String t_classes;
    private String t_username;
    private int t_manage_room;
    private int t_equipment_channel;
    private int t_enclosure;
    private int t_exit;
    private int t_guiding_facilities;
    private int t_selfservice_equip;
    private int t_escalator;
    private int t_platform_door;
    private int t_turnstile;
    private int t_passenger_behavior;
    private int t_post_discipline;
    private int t_operate;

    @Override
    public String toString() {
        return "{" +
                "\"t_id\":" + t_id +
                ",\"t_xstime\":\"" + t_xstime + '"' +
                ",\"t_post\":\"" + t_post + '"' +
                ",\"t_classes\":\"" + t_classes + '"' +
                ",\"t_username\":\"" + t_username + '"' +
                ",\"t_manage_room\":" + t_manage_room +
                ",\"t_equipment_channel\":" + t_equipment_channel +
                ",\"t_enclosure\":" + t_enclosure +
                ",\"t_exit\":" + t_exit +
                ",\"t_guiding_facilities\":" + t_guiding_facilities +
                ",\"t_selfservice_equip\":" + t_selfservice_equip +
                ",\"t_escalator\":" + t_escalator +
                ",\"t_platform_door\":" + t_platform_door +
                ",\"t_turnstile\":" + t_turnstile +
                ",\"t_passenger_behavior\":" + t_passenger_behavior +
                ",\"t_post_discipline\":" + t_post_discipline +
                ",\"t_operate\":" + t_operate +
                '}';
    }
}
