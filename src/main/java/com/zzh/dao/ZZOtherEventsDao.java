package com.zzh.dao;

import com.zzh.pojo.OtherEvents;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/21 9:59
 * @InterfaceName ZZOtherEventsDao
 * @Description TODO
 */
@Repository
@Mapper
public interface ZZOtherEventsDao {
    /*
     * @Author zzh
     * @Date 2023/12/21 13:25
     * @param :
     * @return String
     * @description 获取所有记录
     */
    ArrayList<OtherEvents> getotherevents();

    /*
     * @Author zzh
     * @Date 2023/12/21 13:26
     * @param time:时间
     * @param qtsjpost:岗位
     * @param qtsjclass:班次
     * @param qtsjname:姓名
     * @return int
     * @description 新增其他事件记录
     */
    int addotherevent(@Param("time") String time, @Param("qtsjpost") String qtsjpost, @Param("qtsjclass") String qtsjclass, @Param("qtsjname") String qtsjname);

    /*
     * @Author zzh
     * @Date 2023/12/21 13:26
     * @param arrs:时间组
     * @return int
     * @description 删除记录
     */
    int delotherevent(@Param("arrs") ArrayList arrs);

    /*
     * @Author zzh
     * @Date 2023/12/21 13:27
     * @param sjms:事件描述
     * @param date:日期
     * @return int
     * @description 编辑事件描述
     */
    int updothereventsjms(@Param("sjms") String sjms,@Param("date") String date);

    /*
     * @Author zzh
     * @Date 2023/12/21 13:28
     * @param sxjbh:摄像机编号
     * @param date:时间
     * @return int
     * @description 编辑摄像机编号
     */
    int updothereventsxjbh(@Param("sxjbh") String sxjbh,@Param("date") String date);

    /*
     * @Author zzh
     * @Date 2023/12/21 13:29
     * @param date:时间
     * @return OtherEvents
     * @description 获取事件信息
     */
    OtherEvents getqtsjInfoByDate(String date);

    /*
     * @Author zzh
     * @Date 2023/12/21 16:57
     * @param date:时间
     * @return int
     * @description 确认事件
     */
    int updqtsj(String date);

    /*
     * @Author zzh
     * @Date 2023/12/22 11:18
     * @param banci:
     * @param name:
     * @param starttime:
     * @param endtime:
     * @return ArrayList<OtherEvents>
     * @description TODO
     */
    ArrayList<OtherEvents> getzzqtsjbycond(@Param("banci") String banci,@Param("username") String username,@Param("starttime") String starttime,@Param("endtime") String endtime);
}
