package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTwoLinkedListsTest {
    private IntersectionTwoLinkedLists intersectionTwoLinkedLists;

    @BeforeEach
    void setUp() {
        intersectionTwoLinkedLists = new IntersectionTwoLinkedLists();
    }

    @Test
    void getIntersectionNode() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);

        ListNode intersectionNode = new ListNode(3);

        headA.next = intersectionNode;
        headB.next = intersectionNode;

        // Test case 1: Both lists are empty
        assertNull(intersectionTwoLinkedLists.getIntersectionNode(null, null));
        // Test case 2: One list is empty
        assertNull(intersectionTwoLinkedLists.getIntersectionNode(headA, null));
        assertNull(intersectionTwoLinkedLists.getIntersectionNode(null, headB));

        // Test case 3: Both lists are the same
        ListNode sameList = new ListNode(4);
        sameList.next = new ListNode(5);
        assertSame(sameList, intersectionTwoLinkedLists.getIntersectionNode(sameList, sameList));

        // Test case 4: Lists intersect at the beginning
        ListNode common = new ListNode(7);
        ListNode listA = new ListNode(8);
        listA.next = common;
        ListNode listB = new ListNode(9);
        listB.next = common;
        assertSame(common, intersectionTwoLinkedLists.getIntersectionNode(listA, listB));

        // Test case 5: Lists intersect at the end
        ListNode intersect = new ListNode(10);
        ListNode list1 = new ListNode(11);
        list1.next = new ListNode(12);
        list1.next.next = intersect;
        ListNode list2 = new ListNode(13);
        list2.next = intersect;
        assertSame(intersect, intersectionTwoLinkedLists.getIntersectionNode(list1, list2));
    }

    @Test
    void getIntersectionNode2() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);

        ListNode intersectionNode = new ListNode(3);

        headA.next = intersectionNode;
        headB.next = intersectionNode;

        // Test case 1: Both lists are empty
        assertNull(intersectionTwoLinkedLists.getIntersectionNode2(null, null));
        // Test case 2: One list is empty
        assertNull(intersectionTwoLinkedLists.getIntersectionNode2(headA, null));
        assertNull(intersectionTwoLinkedLists.getIntersectionNode2(null, headB));

        // Test case 3: Both lists are the same
        ListNode sameList = new ListNode(4);
        sameList.next = new ListNode(5);
        assertSame(sameList, intersectionTwoLinkedLists.getIntersectionNode2(sameList, sameList));

        // Test case 4: Lists intersect at the beginning
        ListNode common = new ListNode(7);
        ListNode listA = new ListNode(8);
        listA.next = common;
        ListNode listB = new ListNode(9);
        listB.next = common;
        assertSame(common, intersectionTwoLinkedLists.getIntersectionNode2(listA, listB));

        // Test case 5: Lists intersect at the end
        ListNode intersect = new ListNode(10);
        ListNode list1 = new ListNode(11);
        list1.next = new ListNode(12);
        list1.next.next = intersect;
        ListNode list2 = new ListNode(13);
        list2.next = intersect;
        assertSame(intersect, intersectionTwoLinkedLists.getIntersectionNode2(list1, list2));
    }
}