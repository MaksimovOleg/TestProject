package common;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseLinkedList {
    public static ListNode main() {

        ListNode third = new ListNode(3);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);
        ListNode head = new ListNode();
//        ---------------------------------------------------------------------------------

        ListNode current = head.next;
        ListNode next = null;
        ListNode reverse = new ListNode(head.val);
        if (head == null) {
            return null;
        }

        while (current !=null && current.next != null) {
            next = current.next;
            reverse = new ListNode(current.val, reverse);
            current = next;
        }
        if (current != null) {
            reverse = new ListNode(current.val, reverse);
        }
        return reverse;
    }


    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
