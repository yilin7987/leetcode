package com.yilin.utils;

import lombok.Data;

/**
 * 题目工具
 * 树结点
 */
//二叉树节点的定义。（Definition for a binary tree node）.
@Data
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
