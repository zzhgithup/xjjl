package com.zzh.service.impl;

import com.zzh.dao.EqexpertDao;
import com.zzh.pojo.Eqexpert;
import com.zzh.service.EqexpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/22 15:29
 * @ClassName EqexpertServiceImpl
 * @Description TODO
 */
@Service
public class EqexpertServiceImpl implements EqexpertService {
    @Autowired
    EqexpertDao eqexpertDao;
    @Override
    public ArrayList<Eqexpert> getAlmByTwo(String leve, String system) {
        if(leve.equals("null")){
            leve="";
        }
        if(system.equals("null")){
            system="";
        }

        ArrayList<Eqexpert> eqexperts=eqexpertDao.getAlmByTwo(leve,system);
        return eqexperts;
    }
}
