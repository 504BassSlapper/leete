package org.example;

public class AddTwoNumbersRecursive {
    class ListNode {
        int val;
        ListNode next;

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

    int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int val1 = (l1 == null) ? 0 : l1.val;
        int val2 = (l2 == null) ? 0 : l2.val;
        int sum = val2 + val1 + carry;
        carry = sum / 10;
        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;
        return new ListNode(sum % 10, addTwoNumbers(l1, l2));
    }
}
