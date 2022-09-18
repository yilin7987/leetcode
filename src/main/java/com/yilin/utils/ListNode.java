package com.yilin.utils;

/**
 * 题目工具
 * 链表结点
 */
//链表结点的定义。Definition for singly-linked list
public class ListNode {
    public int val;//值
    public ListNode next;//下一个结点

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
