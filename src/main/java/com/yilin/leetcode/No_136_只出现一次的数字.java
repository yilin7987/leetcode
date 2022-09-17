package com.yilin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No_136_只出现一次的数字 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1};
        int number = singleNumber(nums);
        System.out.println(number);
    }

    public static int singleNumber(int[] nums) {

        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;

        /*
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
            //遍历  count为1就是目标（个数为1）
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        //没有个数为1的
        return -1;
         */


        /* 丑陋！！！！！！
        for (int i = 0; i < nums.length; i++){
            for(int j=0;j<nums.length;j++){
                if (i==j){
                    if (j==nums.length-1){
                        return nums[j];
                    }
                    continue;
                }
                if (nums[j]==nums[i]){
                    break;
                }
                if (j==nums.length-1){
                    return nums[i];
                }
            }
        }
        return 0;
        */
    }
}
