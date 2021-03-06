/**
 * @author: nautilis
 **/
public class MergeTwoSortedLists21 {
    class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                if(head == null) {
                    head = l1;
                    tail = head;
                } else {
                    tail.next = l1;
                    tail = tail.next;
                }
                l1 = l1.next;
            } else {
                if(head== null) {
                    head= l2;
                    tail = head;
                } else {
                    tail.next = l2;
                    tail = tail.next;
                }
                l2 = l2.next;
            }
        }
        if(l1 == null && l2 == null) {
            return head;
        } else if(l1 != null) {
            if(head == null){
                head= l1;
            } else {
                tail.next = l1;
            }
        } else if (l2 != null){
            if(head== null){
                head= l2;
            } else {
                tail.next = l2;
            }
        }
        return head;
    }

}
