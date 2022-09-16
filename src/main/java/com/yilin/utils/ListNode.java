package com.yilin.utils;

/**
 * 题目工具
 * 链表结点
 */
//链表结点的定义。Definition for singly-linked list
public class ListNode {
    int val;//值
    ListNode next;//下一个结点

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
