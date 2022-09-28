import java.util.Arrays;
import java.util.LinkedList;

public class Link {

    public static void main(String[] args) {
        ListNode head = createSingleList();
        printList(head);
//        ListNode rotate = RotateK.rotateRight(head,2);
//        printList(rotate);

//        ListNode remove = RemoveEle.removeElements(head, 3);
//        printList(remove);

//        ListNode swap = Swap.swapNodes(head, 3);
//        printList(swap);

    }

    private static ListNode createSingleList(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
//        node.next.next.next= new ListNode(4);
//        node.next.next.next.next = new ListNode(5);

        return node;
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.printf(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
