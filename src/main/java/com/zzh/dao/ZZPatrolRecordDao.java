package com.zzh.dao;

import com.zzh.pojo.ZZPatrolRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/21 9:59
 * @InterfaceName ZZPatrolRecordDao
 * @Description TODO
 */
@Repository
@Mapper
public interface ZZPatrolRecordDao {
    /*
     * @Author zzh
     * @Date 2023/12/21 14:49
     * @param :
     * @return ArrayList<ZZPatrolRecord>
     * @description 获取所有巡视记录
     */
    ArrayList<ZZPatrolRecord> getPatrolRecordInfos();

    /*
     * @Author zzh
     * @Date 2023/12/21 14:49
     * @param xsjltime:时间
     * @param xsjlpost:岗位
     * @param xsjlclass:班次
     * @param xsjlname:姓名
     * @return int
     * @description 新增巡视记录
     */
    int addpatrolrecord(@Param("xsjltime") String xsjltime,@Param("xsjlpost") String xsjlpost,@Param("xsjlclass") String xsjlclass,@Param("xsjlname") String xsjlname);

    /*
     * @Author zzh
     * @Date 2023/12/21 14:50
     * @param list:时间组
     * @return int
     * @description 删除巡视记录
     */
    int delpatrolrecord(@Param("list") ArrayList list);

    /*
     * @Author zzh
     * @Date 2023/12/21 14:50
     * @param glyf:管理用房
     * @param sbqtd:设备区通道
     * @param wb:围蔽
     * @param crk:出入口
     * @param dxss:照明，导向设施
     * @param zzsb:商业自助设备
     * @param dft:电扶梯
     * @param ztm:站台门
     * @param afc:AFC设备
     * @param ckxw:乘客行为
     * @param gwjl:岗位纪律
     * @param date:时间
     * @return int
     * @description 确认巡视记录
     */
    int updpatrolrecord(@Param("glyf") int glyf,@Param("sbqtd") int sbqtd,@Param("wb") int wb,@Param("crk") int crk,@Param("dxss") int dxss,@Param("zzsb") int zzsb,@Param("dft") int dft,@Param("ztm") int ztm,@Param("afc") int afc,@Param("ckxw") int ckxw,@Param("gwjl") String gwjl,@Param("date") String date);

    /*
     * @Author zzh
     * @Date 2023/12/22 11:18
     * @param banci:
     * @param name:
     * @param starttime:
     * @param endtime:
     * @return ArrayList<ZZPatrolRecord>
     * @description TODO
     */
    ArrayList<ZZPatrolRecord> getzzxsjlbycond(@Param("banci") String banci,@Param("username") String username,@Param("starttime") String starttime,@Param("endtime") String endtime);
}
