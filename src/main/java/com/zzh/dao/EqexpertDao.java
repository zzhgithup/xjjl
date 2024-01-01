package com.zzh.dao;

import com.zzh.pojo.Eqexpert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/22 14:51
 * @InterfaceName EqexpertDao
 * @Description TODO
 */
@Repository
@Mapper
public interface EqexpertDao {

    ArrayList<Eqexpert> getAlmByTwo(@Param("leve") String leve,@Param("system") String system);
}
