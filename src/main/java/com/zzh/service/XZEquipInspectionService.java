package com.zzh.service;

/**
 * @Author zzh
 * @Date 2023/12/21 9:53
 * @InterfaceName XZEquipInspectionService
 * @Description TODO
 */
public interface XZEquipInspectionService {
    String getequipinspections();

    String delequipinspection(String date);

    String addequipinspection(String sbjctime, String sbjcpost, String sbjcclass, String sbjcname);

    String updequipinspection(int zhjk, int ibp, String date);

    String updequipinspectionremark(String remark, String date);

    String getsbjcInfoByDate(String date);

    String getxzsbjcbycond(String banci, String name, String starttime, String endtime);
}
