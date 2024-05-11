package scaler.linkedlist;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromeList {

    public static void main(String[] args) {

        int[] val = new int[]{1, 3, 2};
        ListNode head = new ListNode(val[0]);
        ListNode temp = head;

        for(int i = 1; i<val.length; i++){
            temp.next = new ListNode(val[i]);
            temp = temp.next;
        }
//        temp = head;
//
//        while(temp != null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }

        System.out.println(isPalindrome(head));


    }

    public static int isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        ListNode h1 = reverse(head2);
        ListNode h2 = head;

        while(h1 != null){
            if(h1.val != h2.val){
                return 0;
            }
            h1 = h1.next;
            h2 = h2.next;
        }

        return 1;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
