package com.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @Author zzh
 * @Date 2023/12/22 15:45
 * @ClassName Results
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Results {
    private int countNum;
    private ArrayList<Eqexpert> arr;

    @Override
    public String toString() {
        return "{" +
                "\"countNum\":" + countNum +
                ",\"arr\":" + arr +
                '}';
    }
}
