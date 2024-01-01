package com.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zzh
 * @Date 2023/12/19 15:19
 * @ClassName ZZOtherEvents
 * @Description 行值和值站其他事件记录对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtherEvents {
    private int t_id;
    private String t_qttime;
    private String t_post;
    private String t_classes;
    private String t_username;
    private String t_event_description;
    private String t_camera_number;
    private int t_operate;

    @Override
    public String toString() {
        return "{" +
                "\"t_id\":" + t_id +
                ",\"t_qttime\":\"" + t_qttime + '"' +
                ",\"t_post\":\"" + t_post + '"' +
                ",\"t_classes\":\"" + t_classes + '"' +
                ",\"t_username\":\"" + t_username + '"' +
                ",\"t_event_description\":\"" + t_event_description + '"' +
                ",\"t_camera_number\":\"" + t_camera_number + '"' +
                ",\"t_operate\":" + t_operate +
                '}';
    }
}
