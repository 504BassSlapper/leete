package org.example;

public class AddTwoNumbers {
    public ListNode addTwoLists(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode initialNode = new ListNode(0);
        ListNode result = initialNode;
        while (l1 != null || l2 != null || carry == 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;

            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode current = new ListNode(sum % 10);
            result.next = current;
        }
        return result.next;
    }


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

}
