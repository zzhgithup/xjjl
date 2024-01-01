package com.zzh.service;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/19 16:14
 * @InterfaceName XZPatrolRecordDaoService
 * @Description TODO
 */
public interface XZPatrolRecordDaoService {
    String getPatrolRecordInfos();

    String addpatrolrecord(String xsjltime, String xsjlpost, String xsjlclass, String xsjlname);

    String delpatrolrecord(String date);

    String updpatrolrecord(int zting, int ztai, int crk, int sbqf, int kfsb, String date);

    String updpatrolrecordremark(String remark,String date);

    String getInfoByDate(String date);

    String getxzxsjlbycond(String banci, String username, String starttime, String endtime);
}
