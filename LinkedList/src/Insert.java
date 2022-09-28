public class Insert {
    public static ListNode insert(ListNode head, int insertVal){
        if (head == null){
            ListNode createNode = new ListNode(insertVal, null);
            createNode.next = createNode;
            return createNode;
        }

        ListNode insert = head;
        while (true){
            if ((insert.val <= insertVal && insert.next.val >= insertVal)
                    || (insert.val > insert.next.val && insertVal > insert.val)
                    || (insert.val > insert.next.val && insertVal < insert.next.val)
                    || (insert.next == head)){
                ListNode createNode = new ListNode(insertVal, insert.next);
                insert.next = createNode;
                break;
            }else {
                insert = insert.next;
            }
        }
        return head;
    }
}
