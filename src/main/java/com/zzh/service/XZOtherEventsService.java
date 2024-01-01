package com.zzh.service;

/**
 * @Author zzh
 * @Date 2023/12/21 9:56
 * @InterfaceName XZOtherEventsService
 * @Description TODO
 */
public interface XZOtherEventsService {
    String getotherevents();

    String addotherevent(String qtsjtime, String qtsjpost, String qtsjclass, String qtsjname);

    String delotherevent(String date);

    String updothereventsjms(String sjms, String date);

    String updothereventsxjbh(String sxjbh, String date);

    String getqtsjInfoByDate(String date);

    String updqtsj(String date);

    String getxzqtsjbycond(String banci, String name, String starttime, String endtime);
}
