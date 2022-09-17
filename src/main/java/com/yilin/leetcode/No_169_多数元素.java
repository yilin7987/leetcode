package com.yilin.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No_169_多数元素 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4};
        int maxNum = majorityElement(nums);
        System.out.println(maxNum);
    }

    public static int majorityElement(int[] nums) {
        /* 摩尔投票法思路
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
        */

        //因为数字的数量大于n/2，使用排序后的中间一定是
        Arrays.sort(nums);
        return nums[nums.length / 2];

        /*
        int maxNum=0;
        int maxCount=0;
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
            //遍历  取最大count
            Integer count = map.get(i);
            if (count >=maxCount) {
                maxCount=count;
                maxNum=i;
            }
        }
        return maxNum;
        */
    }
}
