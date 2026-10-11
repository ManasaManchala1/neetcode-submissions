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
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode node=slow.next,prev=null,nextNode;
        slow.next=null;
        while(node!=null){
            nextNode=node.next;
            node.next=prev;
            prev=node;
            node=nextNode;
        }
        ListNode list1=head,list2=prev,nextNode1,nextNode2;
        while(list2!=null){
            nextNode1=list1.next;
            nextNode2=list2.next;
            list1.next=list2;
            list2.next=nextNode1;
            list1=nextNode1;
            list2=nextNode2;
        }
        
    }
}
