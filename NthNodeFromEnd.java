public class NthNodeFromEnd {
    private ListNode head;

    private static class  ListNode{
        private int data;
        private ListNode next;
    
    
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
          public void display(){
            ListNode current = head;
            while(current != null){
              System.out.print(current.data + "-->");
              current = current.next;
            }
          }
           public ListNode NthnodeFromEnd(int position){
            ListNode mainptr = head ;
            ListNode refptr = head;
            int count = 0;
            while(count < position){
                refptr = refptr.next;
                count++;
            }
            while(refptr !=null){
                refptr =refptr.next;
                mainptr =mainptr.next;
            }
             return mainptr;
            }
             public static void main(String[] args) {
                NthNodeFromEnd obj = new NthNodeFromEnd();
                obj.head = new ListNode(7);
                 ListNode Second = new ListNode (1);
                ListNode third = new ListNode(8);
                obj.head.next = Second;
                Second.next = third;
                third.next = null;
                System.out.println("Linked list is");
                obj.display();  
               int position = 2;
        ListNode result = obj.NthnodeFromEnd(position);

        if (result != null)
            System.out.println("\nNode " + position + " from end is: " + result.data);
        else
            System.out.println("\nNode not found");

        obj.display();
    }
}
