//package com.company.linkedList;
//
//import java.util.List;
//
////206. Reverse Linked List
////https://leetcode.com/problems/reverse-linked-list/
//public class ReverseLinkedList {
//
//    public static void main(String[] args) {
//
//    }
//
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null)
//            return head;
//
//        ListNode p = reverseList(head.next);
//
//        head.next.next = head;
//        head.next = null;
//        return p;
//    }
//
//}
