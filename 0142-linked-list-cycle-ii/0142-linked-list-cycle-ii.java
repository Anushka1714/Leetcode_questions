/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int findLength(ListNode slow, ListNode fast){
        int cnt = 1;
        fast = fast.next;
        while(slow != fast){
            cnt++;
            fast = fast.next;
        }
        return cnt;
    } 
    public ListNode detectCycle(ListNode head) {
        // HashMap<ListNode,Integer>mp = new HashMap<>();
        // ListNode temp = head;
        // int timer = 1;
        // while(temp != null){
        //     if(mp.containsKey(temp)){
        //         return temp;
        //     }
        //     mp.put(temp,1);
        //     timer++;
        //     temp = temp.next;
        // }
        // return null;

        

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                // return findLength(slow,fast);
                 int len = findLength(slow,fast);

                 ListNode first = head;
                 ListNode second = head;

                 while(len-- > 0){
                     second = second.next;
                }

                 while(first != second){
                     first = first.next;
                     second = second.next;
                }

    return first;
            }
        }
        return null;
} 
}