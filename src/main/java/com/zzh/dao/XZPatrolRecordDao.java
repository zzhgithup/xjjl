package com.zzh.dao;

import com.zzh.pojo.XZPatrolRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/19 16:03
 * @InterfaceName XZPatrolRecordDao
 * @Description 获取数据库数据接口
 */
@Repository
@Mapper
public interface XZPatrolRecordDao {
    /*
     * @Author zzh
     * @Date 2023/12/19 16:10
     * @param :
     * @return ArrayList<XZPatrolRecord>
     * @description 获取行值所有巡视记录
     */
    ArrayList<XZPatrolRecord> getPatrolRecordInfos();

    /*
     * @Author zzh
     * @Date 2023/12/20 11:27
     * @param xsjltime:巡视时间
     * @param xsjlpost:岗位
     * @param xsjlclass:班次
     * @param xsjlname:姓名
     * @return void
     * @description 新增巡视记录
     */
    int addpatrolrecord(@Param("xsjltime") String xsjltime,@Param("xsjlpost")  String xsjlpost,@Param("xsjlclass")  String xsjlclass,@Param("xsjlname")  String xsjlname);

    /*
     * @Author zzh
     * @Date 2023/12/20 11:49
     * @param date:需要删除记录的时间组
     * @return int
     * @description 删除巡视记录
     */
    int delpatrolrecord(@Param("date") ArrayList date);

    /*
     * @Author zzh
     * @Date 2023/12/20 15:31
     * @param zting:站厅
     * @param ztai:站台
     * @param crk:出入口
     * @param sbqf:设备区（房）
     * @param kfsb:客服设备
     * @param date:时间
     * @return int
     * @description 确定巡视记录
     */
    int updpatrolrecord(@Param("zting") int zting,@Param("ztai")  int ztai,@Param("crk")  int crk,@Param("sbqf")  int sbqf,@Param("kfsb")  int kfsb,@Param("date")  String date);

    /*
     * @Author zzh
     * @Date 2023/12/20 15:42
     * @param remark:备注
     * @return int
     * @description 添加修改备注
     */
    int updpatrolrecordremark(@Param("remark") String remark,@Param("date") String date);

    /*
     * @Author zzh
     * @Date 2023/12/20 15:49
     * @param date:时间
     * @return String
     * @description 查询备注
     */
    String getInfoByDate(String date);

    /*
     * @Author zzh
     * @Date 2023/12/22 10:08
     * @param banci:班次
     * @param username:姓名
     * @param starttime:开始时间
     * @param endtime:结束时间
     * @return ArrayList<XZPatrolRecord>
     * @description 根据条件查询
     */
    ArrayList<XZPatrolRecord> getxzxsjlbycond(@Param("banci") String banci,@Param("username") String username,@Param("starttime") String starttime,@Param("endtime") String endtime);
}
