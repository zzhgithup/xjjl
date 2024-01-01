package com.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zzh
 * @Date 2023/12/19 15:32
 * @ClassName XZEquipInspection
 * @Description 行值重要设备检查记录对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class XZEquipInspection {
    private int t_id;
    private String t_xjtime;
    private String t_post;
    private String t_classes;
    private String t_username;
    private int t_integrated_monitoring;
    private int t_ibp;
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
                ",\"t_integrated_monitoring\":" + t_integrated_monitoring +
                ",\"t_ibp\":" + t_ibp +
                ",\"t_remarks\":\"" + t_remarks + '"' +
                ",\"t_operate\":" + t_operate +
                '}';
    }
}
