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
class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if (l1 == null && l2 != null){
            return l2;
        }
        if(l2 == null && l1 !=null){
            return l1;
        }
        boolean carry = false;
        ListNode alphaNode = l1;
        ListNode betaNode = l2;
        ListNode result = new ListNode(0);
        ListNode temp = result;
   
        
        while(alphaNode != null || betaNode != null){
            //get the numerical value of the current nodes
            int alpha = 0;
            int beta = 0;
            if(alphaNode != null){
            alpha = alphaNode.val;
            }else if(alphaNode == null){
                alpha = 0;
            }
            if(betaNode != null){
            beta = betaNode.val;
            }else if(betaNode == null){
                beta = 0;
            }
            
            int res = 0;
            //if the carry is not on...
            if(carry == false){
                res = (alpha + beta) % 10;
            }else{
                res = (alpha + beta + 1) % 10;
                if(alpha + beta + 1 >= 10){
                    carry = true;
                }else{
                carry = false;
                }
            }
            if((alpha + beta) >= 10){
                carry = true;
            }
            
            ListNode x = new ListNode(res);
            temp.next = x;
            
            temp = temp.next;
            if(alphaNode != null){
            alphaNode = alphaNode.next;
            }
            if(betaNode != null){
            betaNode = betaNode.next;
            }
    
        }
        if(carry){
            ListNode x = new ListNode(1);
            temp.next = x;
        }
        return result.next;
        }
    }
        
        
        /*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

 

Constraints:

    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.


        
    */