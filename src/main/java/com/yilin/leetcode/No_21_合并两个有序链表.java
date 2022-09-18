package com.yilin.leetcode;

import com.yilin.utils.ListNode;

public class No_21_合并两个有序链表 {
    public static void main(String[] args) {
        //①->②->④
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        //①->③->④
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode listNode = mergeTwoLists(list1, list2);
        //打印链表
        No_206_反转链表.printListNode(listNode);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //开始结点
        ListNode result = new ListNode();
        //移动结点
        ListNode cur = result;
        //有空退出循环
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                //移动指针
                cur = cur.next;
                list1 = list1.next;
            } else {
                cur.next = list2;
                //移动指针
                cur = cur.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        return result.next;
    }
}
