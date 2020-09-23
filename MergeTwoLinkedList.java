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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode k = new ListNode(-1);
        ListNode head = k;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                k.next = l1;
                l1 = l1.next;
            }
            
            else{
                k.next = l2;
                l2 = l2.next;
            }
            
            k = k.next;
               
        }
        
        if(l1 != null){
            k.next = l1;
        }
        if(l2 != null){
            k.next = l2;
        }
        
        
        
        return head.next;
        
    }
}

