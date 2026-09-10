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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
    //     Stack<Integer>st = new Stack<>();
    //     ListNode temp = head;
    //     int curr = 1;
    //     while(curr < left){
    //         temp = temp.next;
    //         curr++;
    //     }
    //    ListNode start = temp;
    //     while(curr <= right){
    //         st.push(temp.val);
    //         temp = temp.next;
    //         curr++;
    //     }
    //     temp = start;
    //     while(!st.empty()){
    //         temp.val = st.pop();
    //         temp = temp.next;
    //         curr++;
    //     }
    //     return head;


          ListNode dummy = new ListNode(0);
          dummy.next = head;
          ListNode prev = dummy;

          for(int i=1;i<left;i++){
            prev = prev.next;
          }
          ListNode curr = prev.next;
          for(int i=0;i<right-left;i++){
            ListNode front = curr.next;
            curr.next = front.next;
            front.next = prev.next;
            prev.next = front;
          }
          return dummy.next;
    }
}