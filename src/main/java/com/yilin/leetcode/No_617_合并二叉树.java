package com.yilin.leetcode;

import com.yilin.utils.PrintTree;
import com.yilin.utils.TreeNode;

/**
 * 第617题 合并二叉树
 */
public class No_617_合并二叉树 {
    public static void main(String[] args) {
        //树初始化
        //       ①
        //   ②      ③
        // ④  ⑤
        TreeNode root1 = new TreeNode(1, new TreeNode
                (2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        //    ①
        //       ②
        //          ③
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.right.right = new TreeNode(3);
        //调用方法
        TreeNode treeNode = mergeTrees(root1, root2);
        //打印二叉树
        PrintTree.printTree(treeNode);
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }
}
