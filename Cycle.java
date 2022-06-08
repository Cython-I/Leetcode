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
public class Cycle {
    public boolean hasCycle(ListNode head) {
        if(head == null)
        {
            return false;
        }
        //Two pointers
        ListNode fast = head;
        ListNode slow = head;
        
        try{
             fast = fast.next.next;
            slow = slow.next;
        while(fast != slow)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
        }
        catch(Exception e)
        {
            System.out.println("A null value appeared");
            return false;
        }
        }
    }
