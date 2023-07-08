package common;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseLinkedList {
    public static ListNode main() {

        ListNode third = new ListNode(3);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);


//        Stack<ListNode> stack = new Stack<>();
//        if (Objects.isNull(first)) {
//            return first;
//        }
//        ListNode currentElement = first;
//        while (Objects.nonNull(currentElement)) {
//            stack.push(first);
//            currentElement = currentElement.next;
//        }
//        ListNode node = stack.pop();
//        ListNode next;
//        while (stack.size()>0){
//        }
        return null;
    }

//    private static ListNode get(ListNode node) {
//        if (node.next==null) {
//            return node;
//        } else {
//            get(node);
//        }
//    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
