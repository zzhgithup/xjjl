package com.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zzh
 * @Date 2023/12/22 14:19
 * @ClassName Eqexpert
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eqexpert {
    private int fd_state;
    private String fd_time;
    private String fd_desc;
    private int fd_leve;
    private int fd_value;
    private String fd_location;
    private int fd_id;
    private String fd_system;
    private String fd_device;

    @Override
    public String toString() {
        return "{" +
                "\"fd_state\":" + fd_state +
                ",\"fd_time\":\"" + fd_time + '"' +
                ",\"fd_desc\":\"" + fd_desc + '"' +
                ",\"fd_leve\":" + fd_leve +
                ",\"fd_value\":" + fd_value +
                ",\"fd_location\":\"" + fd_location + '"' +
                ",\"fd_id\":" + fd_id +
                ",\"fd_system\":\"" + fd_system + '"' +
                ",\"fd_device\":\"" + fd_device + '"' +
                '}';
    }
}
