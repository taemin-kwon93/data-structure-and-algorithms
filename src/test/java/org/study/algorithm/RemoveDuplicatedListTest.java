package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatedListTest {
    private RemoveDuplicatedList removeDuplicatedList;
    @BeforeEach
    void setUp() {
        removeDuplicatedList = new RemoveDuplicatedList();
    }

    @Test
    void deleteDuplicates() {
        ListNode l6 = new ListNode(5);
        ListNode l5 = new ListNode(4, l6);
        ListNode l4 = new ListNode(3, l5);
        ListNode l3 = new ListNode(2, l4);
        ListNode l2 = new ListNode(1, l3);
        ListNode head1 = new ListNode(1, l2);

        ListNode n2 = new ListNode(1);
        ListNode n1 = new ListNode(1, n2);
        ListNode head2 = new ListNode(1, n1);

        ListNode result1 = removeDuplicatedList.deleteDuplicates(head1);
        ListNode result2 = removeDuplicatedList.deleteDuplicates(head2);

        assertEquals(1, result1.val);
        assertEquals(2, result1.next.val);
        assertEquals(3, result1.next.next.val);
        assertEquals(4, result1.next.next.next.val);
        assertEquals(5, result1.next.next.next.next.val);
        assertNull(result1.next.next.next.next.next);

        assertEquals(1, result2.val);
        assertNull(result2.next);
    }
}