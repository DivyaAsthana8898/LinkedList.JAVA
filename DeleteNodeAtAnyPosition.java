

public class DeleteNodeAtAnyPosition {
    private ListNode head;

     private static class ListNode{
        private int data;
        private ListNode next;
        ListNode(int data){
        this.data = data;
        this.next = null;
      }
    }
    
      public void display(){
        ListNode current = head ;
        while(current!= null){
            System.out.println(current.data +"-->");
             current = current.next;
       // System.out.println("null");

      }
       System.out.println("null");
    }
    public void deleteNodeAtAnyPosition(int position){
        if(position == 1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1 && previous != null){
                previous = previous.next;
                count++;
            }
            if(previous != null && previous.next != null){
                ListNode current = previous.next;
                previous.next = current.next;
            }
        }
    }
        public static void main(String[] args) {
            DeleteNodeAtAnyPosition obj = new DeleteNodeAtAnyPosition();
             obj.head = new ListNode(5);
                ListNode second = new ListNode(9);
                ListNode third = new ListNode(9);
                ListNode fourth = new ListNode(7);
                ListNode fifth = new ListNode(8);
               obj. head.next = second;
                second.next = third;
                third.next = fourth;
                obj.display();
                System.out.println("BEFORE DELETION");
                int position =4;
                System.out.println("AFTER DELETION");
                obj.deleteNodeAtAnyPosition(position);
                obj.display();

        }

}
           