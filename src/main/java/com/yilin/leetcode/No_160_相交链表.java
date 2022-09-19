package com.yilin.leetcode;

import com.yilin.utils.ListNode;
import com.yilin.utils.PrintListNode;

public class No_160_相交链表 {
    public static void main(String[] args) {
        //公共部分：⑧->④->⑤
        ListNode pub = new ListNode(8, new ListNode(4, new ListNode(5)));
        //④->①->pub(⑧->④->⑤)
        ListNode headA = new ListNode(4, new ListNode(1, pub));
        //⑤->⑥->①->pub(⑧->④->⑤)
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, pub)));
        ListNode listNode = getIntersectionNode(headA, headB);
        //打印
        PrintListNode.printListNode(listNode);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        //不会组织语言看别人解释：https://leetcode.cn/problems/intersection-of-two-linked-lists/solution/tu-jie-xiang-jiao-lian-biao-by-user7208t/
        while (l1 != null || l2 != null) {
            if (l1 == null) l1 = headB;
            if (l2 == null) l2 = headA;
            if (l1 == l2) {
                return l1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return null;
    }
}
