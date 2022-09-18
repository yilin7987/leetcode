package com.yilin.leetcode;

import java.util.*;

public class No_448_找到所有数组中消失的数字 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(list);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        /*思路：1~n个数字对应0~（n-1）的下标，
         把出现过的数字的下标特殊化（比如下标本来的数字取负），
         之后再遍历一次没有特殊化的就是没有出现过的
         */
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] > 0) {
                //取负
                nums[Math.abs(num) - 1] = -nums[Math.abs(num) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            //不是负的就是没有出现过的
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
        /*
        List<Integer> list=new ArrayList<>();
        for (int i=0; i<nums.length; i++){
           list.add(i+1);
        }
        for (int i=0; i<nums.length; i++){
            list.remove((Integer)nums[i]);
        }
        return list;
         */
    }
}
