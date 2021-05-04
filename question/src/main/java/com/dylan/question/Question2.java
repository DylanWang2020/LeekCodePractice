package com.dylan.question;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ListNode result = addTwoNumbers(new ListNode(2), new ListNode(3));
        System.out.println("" + result.val);
    }

    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = null, temp = null;
        int value1, value2, sum, value, after = 0;
        while (l1 != null || l2 != null) {
            value1 = 0;
            if (l1 != null) {
                value1 = l1.val;
                l1 = l1.next;
            }
            value2 = 0;
            if (l2 != null) {
                value2 = l2.val;
                l2 = l2.next;
            }
            sum = value1 + value2 + after;
            value = sum % 10;
            after = sum / 10;
            if (list == null) {
                list = new ListNode(value);
                temp = list;
            } else {
                temp.next = new ListNode(value);
                temp = temp.next;
            }
        }
        if (after > 0) {
            temp.next = new ListNode(after);
        }
        return list;
    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}