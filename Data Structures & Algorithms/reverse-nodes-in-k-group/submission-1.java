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

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode groupPrev=dummy;
        dummy.next=head;
        while(true){
            ListNode kth=getKth(groupPrev,k);
            if(kth==null) break;
            ListNode groupNext=kth.next;
            ListNode prev=kth.next;
            ListNode curr=groupPrev.next;
            while(curr!=groupNext){
                ListNode nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
            }
            ListNode temp=groupPrev.next;
            groupPrev.next=kth;
            groupPrev=temp;
        }
        return dummy.next;
        
    }
    public ListNode getKth(ListNode curr,int k){
        while(curr!=null && k>0){
            curr=curr.next;
            k--;
        }
        return curr;
    }
}
