package Solution;

import model.ListNode;
import sun.applet.Main;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * 给定两个链表，返回其相加的结果。注意链表是倒序的，即第一个节点是个位。
 */
public class AddTwoNumbers{

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        //初始化
        ListNode value = new ListNode(0);
        ListNode current = value;
        int shi = 0;
        while (l1 != null || l2 != null || shi == 1){
            //数据校验进位
            int temp = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + shi;
            if (temp >= 10){
                temp = temp % 10;
                shi = 1;
            }else{
                temp = temp % 10;
                shi = 0;
            }
            ListNode temp2 = new ListNode(temp);
            value.next = temp2;
            value = value.next;
            //数据处理
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        return current.next;
    }

}
