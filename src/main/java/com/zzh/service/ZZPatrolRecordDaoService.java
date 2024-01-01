package com.zzh.service;

/**
 * @Author zzh
 * @Date 2023/12/21 10:00
 * @InterfaceName ZZPatrolRecordDaoService
 * @Description TODO
 */
public interface ZZPatrolRecordDaoService {
    String getPatrolRecordInfos();

    String addpatrolrecord(String xsjltime, String xsjlpost, String xsjlclass, String xsjlname);

    String delpatrolrecord(String date);

    String updpatrolrecord(int glyf, int sbqtd, int wb, int crk, int dxss, int zzsb, int dft, int ztm, int afc, int ckxw, String gwjl, String date);

    String getzzxsjlbycond(String banci, String name, String starttime, String endtime);
}
