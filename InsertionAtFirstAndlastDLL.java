
import com.sun.jdi.Value;

public class InsertionAtFirstAndlastDLL {
    private  ListNode head;
    private  ListNode tail;
    private int length;

      private class ListNode{
        int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;

        }
      }
       public InsertionAtFirstAndlastDLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;

       }
        public boolean IsEmpty(){
            return length ==0;

        }
         public int length(){
            return length;
         }
          public void displayForward() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    ListNode current = head;
    while (current != null) {
        System.out.print(current.data + "---->");
        current = current.next;
    }
    System.out.println("null");
}
          public void InsertAtFirst(int data){
            ListNode newNode = new ListNode(data);
             if(IsEmpty()){
                // list was empty, new node is both head and tail
                tail = newNode;
             }else{
                // link new node before current head
                 head.previous = newNode;
             }
              // connect new node to the old head
              newNode.next = head;
              
              head = newNode;
              
              // if tail was null (empty list) ensure it's set (already handled above)
            
              
              length++;
          }

          public void InsertAtLast(int data){
              ListNode newNode = new ListNode(data);
             if(IsEmpty()){
                head  = newNode;
             }else{
                tail.next = newNode;
                newNode.previous = tail;
             }
              tail = newNode;
              length++;
          }
           public static void main(String[] args) {
               InsertionAtFirstAndlastDLL obj = new InsertionAtFirstAndlastDLL();
               obj.InsertAtFirst(5);
               obj.InsertAtFirst(8);
               obj.InsertAtLast(9);

            obj.displayForward();
           }
         
    
}
