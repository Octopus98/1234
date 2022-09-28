public class RemoveEle {
    public static ListNode removeElements(ListNode head, int val){
        if (head == null){
            return null;
        }
//        ListNode tail = head;
//        for (int n = 1; tail.next != null; n++){
//            tail = tail.next;
//        }
        ListNode tempNode = new ListNode(0);
        tempNode.next =head;

        ListNode previousNode = tempNode;
        while (head != null){
            if (head.val == val){
                previousNode.next = head.next;
            }else {
                previousNode = head;
            }
            head = head.next;
        }
        return tempNode.next;
    }
}
