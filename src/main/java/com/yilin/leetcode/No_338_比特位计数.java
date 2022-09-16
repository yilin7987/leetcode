package com.yilin.leetcode;

import java.util.Arrays;

public class No_338_比特位计数 {
    public static void main(String[] args) {
        int[] ints = countBits(5);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] countBits(int n) {
        int[] ints = new int[n + 1];
        ints[0] = 0;
        for (int i = 1; i <= n; i++) {
            //Integer.bitCount(n):n的二进制中1的个数
            ints[i] = Integer.bitCount(i);
        }
        return ints;
    }
}
