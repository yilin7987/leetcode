package com.yilin.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_229_多数元素II {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        List<Integer> list = majorityElement(nums);
        System.out.println(list);
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        //  数字     数字的个数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            //根据数字，返回数字的个数
            Integer count = map.get(num);
            //个数为空，及map现在没有该数字count设为1，否则count加1
            count = count == null ? 1 : ++count;
            //（1）添加数字，count为1  （2）或者更新count（count+1）
            map.put(num, count);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) > nums.length / 3) {
                list.add(i);
            }
        }
        return list;
    }

}
