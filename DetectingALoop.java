public class DetectingALoop {
    private ListNode  head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }
     public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.println(current.data + "-->");
            current = current.next;
        }
         System.out.println("null");

            
        }
     
      public boolean detectALoop(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr != null && fastptr.next !=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){
                return true;
            }

        }
          return false;
 
      }
        public static void main(String[] args) {
            DetectingALoop obj = new DetectingALoop();
            obj.head = new ListNode(1);
            ListNode second = new ListNode(2);
            ListNode third = new ListNode(3);
            ListNode fourth = new ListNode(4);
            ListNode fifth = new ListNode(5);
            obj.head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            // Creating a loop for testing
            fifth.next = second; // Comment this line to test without loop
    
            boolean hasLoop = obj.detectALoop();// boolean ke case me store karenge
            if(hasLoop){
                System.out.println("Loop detected in the linked list.");
            } else{
                System.out.println("No loop detected in the linked list.");
            }
        }
    }

    

