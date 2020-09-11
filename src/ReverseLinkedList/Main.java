package ReverseLinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Main{
    public static void main(String[] args) {
        ListNode last = new ListNode(0);
        ListNode second = new ListNode(1, last);
        ListNode third = new ListNode(2,second);
        ListNode fourth = new ListNode(3,third);
        ListNode fifth = new ListNode(4,fourth);
        ListNode sixth = new ListNode(5,fifth);
        ListNode seventh = new ListNode(6,sixth);

        printListNode(seventh);
        printListNode(reverseListNodeIterative(null));
        printListNode(reverseListNodeRecursive(seventh));
    }

    public static void printListNode(ListNode head){
        while (head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println("\n");
    }

    public static ListNode reverseListNodeRecursive(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseListNodeRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public static ListNode reverseListNodeIterative(ListNode head){
        if(head == null){
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        while(current.next != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        current.next = previous;
        return current;
    }

}