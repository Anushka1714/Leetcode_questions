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
    public ListNode reverseList(ListNode head) {

    //using stack
        if(head == null || head.next == null){
            return head;
        }
        Stack<Integer>st = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        } 
        temp = head;
        while(temp != null){
            temp.val = st.peek();
            st.pop();
            temp = temp.next;
        }
        return head;


    //reversing the links
        // if  (head == null || head.next == null){
        //     return head;
        // }
        // ListNode temp = head;
        // ListNode prev = null;

        // while(temp != null){
        //     ListNode front = temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = front;
        // }
        // return prev;
    }
}