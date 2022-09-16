package com.yilin.leetcode;

import com.yilin.utils.ListNode;

import java.util.ArrayList;
import java.util.List;


/**
 * 第206题 反转链表
 */
public class No_206_反转链表 {
    public static void main(String[] args) {
        //链表定义
        //①->②->③->④  -->   ④->③->②->①
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        //ListNode head = null;
        head = reverseList(head);
        //打印链表
        printListNode(head);
    }

    //用来收集最后一个之前的结点
    static List<ListNode> listNodes = new ArrayList<>();
    //记录最后一个结点（及反转后的第一个结点）
    static ListNode temp = null;

    public static ListNode reverseList(ListNode head) {
        //为空，退出
        if (head == null) return null;
        //没有到最后一个，加入列表，继续递归
        if (head.next != null) {
            listNodes.add(head);
            reverseList(head.next);
        }
        //只有最后一个能执行这步，因为后面temp不为空，temp记录反转后的第一个（及开始时的最后一个）
        if (temp == null) {
            temp = head;
        }
        if (listNodes.size() != 0) {
            //反转
            head.next = listNodes.get(listNodes.size() - 1);
            listNodes.remove(listNodes.size() - 1);
        } else {
            //开始时的第一个（及反转后的最后一个），不需要有下一个
            head.next = null;
        }
        return temp;
    }

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
