public class PrintingLinkedList {
    private ListNode head;//header pointer of the linkedlist

    private static class ListNode{
        private int data;// value stored in the node (right now only integer containing)
        private ListNode next;// reference to the next node ;
           //constructor
        public  ListNode(int data){
            this.data = data;//ye wale data ki baat hor hi h instance variable belongs to class listnode
            this.next = null;
        }

    }
   
 public void display(){
    ListNode current = head;
    while(current!=null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.print("null");
 }
   
   public static void main(String[] args) {
      PrintingLinkedList sll = new PrintingLinkedList();// creating the object
      sll.head = new ListNode(5);
      ListNode Second = new ListNode(9);
       ListNode Third = new ListNode(7);
        ListNode fourth = new ListNode(8);
        sll.head.next = Second;
        Second.next = Third;
        Third.next = fourth;
        sll.display();
      

      

      

        
    }
    
}
