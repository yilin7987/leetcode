package com.yilin.leetcode;

import com.yilin.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class No_101_对称二叉树 {
    public static void main(String[] args) {
        //           ①
        //     ②    |   ②
        //  ③   ④  | ④   ③
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4)));         //,new TreeNode(3)));
        boolean b = isSymmetric(root);
        System.out.println(b);
    }

    public static boolean isSymmetric(TreeNode root) {
        //为空直接返回
        if (root == null) {
            return true;
        }
        //两个子树分别遍历
        return compare(root.left, root.right);
    }

    public static boolean compare(TreeNode root1, TreeNode root2) {
        //两棵子树为空true
        if (root1 == root2) {
            return true;
        }
        //一棵子树为空，另外的子树不为空，或者值不相等，返回false
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        //递归，继续验证
        return compare(root1.left, root2.right) && compare(root1.right, root2.left);
    }


    //迭代
    /*
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode u, TreeNode v) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }
    */
}
