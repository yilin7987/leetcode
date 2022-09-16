package com.yilin.leetcode;

import com.yilin.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 第94题 二叉树的中序遍历
 */
public class No_94_二叉树的中序遍历 {
    public static void main(String[] args) {
        //树初始化
        //       ①
        //   ②      ③
        // ④  ⑤
        TreeNode root = new TreeNode(1, new TreeNode
                (2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        List<Integer> integers = inorderTraversal(root);
        System.out.println(integers);
    }

    static List<Integer> integers = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return null;
        inorderTraversal(root.left);
        integers.add(root.val);
        inorderTraversal(root.right);
        return integers;
    }
}
