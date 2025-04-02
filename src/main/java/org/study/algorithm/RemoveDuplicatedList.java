package org.study.algorithm;

public class RemoveDuplicatedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode root = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return root;
    }
}
