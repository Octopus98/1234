public class Split {
    public static ListNode[] splitListToParts(ListNode head, int k){
        int lenList = 0;
        ListNode[] arr = new ListNode[k];
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            lenList++;
        }

        int lenArr = lenList/k;
        int lenFirst = lenList%k;

        temp = head;
        for (int i = 0; i < k && temp != null; i++){
            arr [i] = temp;
            for (int j = 0; j < lenArr + (lenFirst >0 ? 1:0) -1; j++){
                temp = temp.next;
            }
            ListNode arrTemp = temp.next;
            temp.next = null;
            temp = arrTemp;
            lenFirst--;
        }
        return arr;
    }
}
