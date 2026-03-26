/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution445 {

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
        ListNode rl1=reverseList(l1);
        ListNode rl2=reverseList(l2);
        while(rl1!=null || rl2!=null || carry!=0){
            int sum=carry;
            if(rl1!=null){
                sum+=rl1.val;
                rl1=rl1.next;
            }
            if(rl2!=null){
                sum+=rl2.val;
                rl2=rl2.next;
            }
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
        }
        return reverseList(dummy.next);
    }
}