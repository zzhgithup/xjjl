package com.zzh.service;

import com.zzh.pojo.Eqexpert;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/22 15:28
 * @InterfaceName EqexpertService
 * @Description TODO
 */
public interface EqexpertService {
    ArrayList<Eqexpert> getAlmByTwo(String leve, String system);
}
