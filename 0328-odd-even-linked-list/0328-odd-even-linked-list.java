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
    public ListNode oddEvenList(ListNode head) {
//brute force (replacing the value)
        if(head == null || head.next  == null){
            return head;
        }
        // ListNode temp = head;
        // ArrayList<Integer> arr = new ArrayList<>();
        // while(temp != null && temp.next != null){
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp != null){
        //     arr.add(temp.val);
        // }
    
        // temp = head.next;
        // while(temp != null && temp.next != null){
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp != null){
        //     arr.add(temp.val);
        // }

        // temp = head;
        // int i = 0;
        // while(temp != null){
        //     temp.val = arr.get(i);
        //     i++;
        //     temp = temp.next;
        // }
        // return head;


//changing the links
         ListNode odd = head;
         ListNode even = head.next;
         ListNode even1 = head.next;

         while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
         }
         odd.next = even1;

         return head;
    }

}