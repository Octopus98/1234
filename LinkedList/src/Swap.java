public class Swap {
    public static ListNode swapNodes (ListNode head, int k){
        if (head == null || k <= 0 || head.next == null){
            return head;
        }
        int n;
        ListNode tail = head;
        for (n = 1; tail.next != null; n++){
            tail = tail.next;
        }
        ListNode temp = new ListNode(0);
        ListNode swap1 = head;
//        ListNode prev1 = temp;
        ListNode swap2 = head;
//        ListNode prev2 = temp;
        temp.next = head;
        for (int i = 1; i < k; i++){
            swap1 = swap1.next;
//            prev1 = prev1.next;
        }
        for (int j = 1; j < n-k+1; j++){
            swap2 = swap2.next;
//            prev2 = prev2.next;
        }
//        ListNode next1 = swap1.next;
//        ListNode next2 = swap2.next;
//        prev1.next = swap2;
//        swap2.next = next1;
//        prev2.next = swap1;
//        swap1.next = next2;
        int data = swap2.val;
        swap2.val = swap1.val;
        swap1.val = data;

        return head;
    }
}
