package com.zzh.service;

/**
 * @Author zzh
 * @Date 2023/12/21 10:00
 * @InterfaceName ZZOtherEventsService
 * @Description TODO
 */
public interface ZZOtherEventsService {
    String getotherevents();

    String addotherevent(String qtsjtime, String qtsjpost, String qtsjclass, String qtsjname);

    String delotherevent(String date);

    String updothereventsjms(String sjms, String date);

    String updothereventsxjbh(String sxjbh, String date);

    String getqtsjInfoByDate(String date);

    String updqtsj(String date);

    String getzzqtsjbycond(String banci, String name, String starttime, String endtime);
}
