import java.util.LinkedList;
public class RotateK {
    public static ListNode rotateRight(ListNode head, int k){
        if (head == null || k <= 0 || head.next == null){
            return head;
        }
        int n;
        ListNode tail = head;
        for (n = 1; tail.next != null; n++){
            tail = tail.next;
        }
        tail.next = head;   //Set tail pointing to head

        ListNode currTail = head;
        int trueK = k%n;
        int i;
        for (i = 1; i < n - trueK; i++){
            currTail = currTail.next;
        }
        ListNode currHead = currTail.next;
        currTail.next = null;

        return currHead;
    }
}
