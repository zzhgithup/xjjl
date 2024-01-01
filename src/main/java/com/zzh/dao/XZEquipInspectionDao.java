package com.zzh.dao;

import com.zzh.pojo.XZEquipInspection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/21 9:53
 * @InterfaceName XZEquipInspectionDao
 * @Description TODO
 */
@Repository
@Mapper
public interface XZEquipInspectionDao {
    /*
     * @Author zzh
     * @Date 2023/12/21 10:10
     * @param :
     * @return ArrayList<XZEquipInspection>
     * @description 获取所有设备检查记录
     */
    ArrayList<XZEquipInspection> getequipinspections();

    /*
     * @Author zzh
     * @Date 2023/12/21 10:55
     * @param arrayList:时间集合
     * @return int
     * @description 删除设备检查记录
     */
    int delequipinspection(@Param("arrayList") ArrayList arrayList);

    /*
     * @Author zzh
     * @Date 2023/12/21 11:08
     * @param s:时间
     * @param sbjcpost:岗位
     * @param sbjcclass:班次
     * @param sbjcname:姓名
     * @return int
     * @description  新增设备检查记录
     */
    int addequipinspection(@Param("s") String s,@Param("sbjcpost") String sbjcpost,@Param("sbjcclass") String sbjcclass,@Param("sbjcname") String sbjcname);

    /*
     * @Author zzh
     * @Date 2023/12/21 11:25
     * @param zhjk:综合监控
     * @param ibp:ibp
     * @param date:时间
     * @return int
     * @description 确认设备检查记录
     */
    int updequipinspection(@Param("zhjk") int zhjk,@Param("ibp") int ibp,@Param("date") String date);

    /*
     * @Author zzh
     * @Date 2023/12/21 11:40
     * @param remark:备注
     * @param date:时间
     * @return int
     * @description 修改备注
     */
    int updequipinspectionremark(@Param("remark") String remark,@Param("date") String date);

    /*
     * @Author zzh
     * @Date 2023/12/21 11:41
     * @param date:时间
     * @return String
     * @description 获取备注
     */
    String getsbjcInfoByDate(String date);

    /*
     * @Author zzh
     * @Date 2023/12/22 11:18
     * @param banci:
     * @param name:
     * @param starttime:
     * @param endtime:
     * @return ArrayList<XZEquipInspection>
     * @description TODO
     */
    ArrayList<XZEquipInspection> getxzsbjcbycond(@Param("banci") String banci,@Param("username") String username,@Param("starttime") String starttime,@Param("endtime") String endtime);
}
