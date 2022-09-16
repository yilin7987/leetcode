package com.yilin.utils;

/**
 * 题目工具
 * 树结点
 */
//二叉树节点的定义。（Definition for a binary tree node）.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
