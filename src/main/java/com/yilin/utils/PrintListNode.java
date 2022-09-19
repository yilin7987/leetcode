package com.yilin.utils;

public class PrintListNode {
    //打印链表
    public static void printListNode(ListNode head) {
        if (head == null) return;
        if (head.next == null) {
            System.out.print(head.val);
        } else {
            System.out.print(head.val + "->");
            printListNode(head.next);
        }
    }
}
