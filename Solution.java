/**
 * Created by p on 2017/2/25.
 */
/**
 * Definition for singly-linked list.
 *
 * */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        int carry = 0;
        int a,b,c;
        while(l1 != null || l2!=null){
            a=b= 0;
            //节点为零的时候要加0
            if(l1!=null){
                a = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                b = l2.val;
                l2= l2.next;
            }
            c = a + b + carry;
            p.next = new ListNode(c % 10);
            p = p.next;
            carry = c /10;
        }
        //两条list上的所有节点后可能还要进1
        if(carry != 0){
            p.next = new ListNode(carry);
        }
        return head.next;
    }
}
