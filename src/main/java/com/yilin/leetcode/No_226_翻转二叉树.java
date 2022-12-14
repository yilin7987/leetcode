package com.yilin.leetcode;

import com.yilin.utils.TreeNode;

/**
 * 第226题翻转二叉树
 */
public class No_226_翻转二叉树 {
    public static void main(String[] args) {
        //树初始化
        //       ①
        //   ②      ③
        // ④  ⑤
        TreeNode root = new TreeNode(1, new TreeNode
                (2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        invertTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if (root == null) return null;
        TreeNode temp = new TreeNode();
        //翻转
        temp = root.right;
        root.right = root.left;
        root.left = temp;
        //递归
        invertTree(root.left);
        invertTree(root.right);
        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }
}
