public class DeleteLastNode {
    private ListNode head;

    private static class ListNode{
      private  int data ;
      private ListNode next;

        public ListNode(int data ) {
            this.data = data;
            this.next = null;
        }
    }
            public void display(){
               ListNode current = head;
                while(current!=null){
                    System.out.println(current.data+"-->");
                    current = current.next;

                }
                 System.out.println("null");
            }

                 public ListNode DeleteLastNode(){
                    if(head ==null ||head.next==null){
                        return head;
                    }
                    ListNode current = head;
                    ListNode previous = null;
                    while(current.next!=null){
                        previous = current;
                        current = current.next;
                    }
                     previous.next = null;
                     return current; 

                    
                    }
                
            
                  public static void main(String[] args) {
                    DeleteLastNode obj = new DeleteLastNode();
                    obj.head = new ListNode(8);
                    ListNode Second = new ListNode(9);
                    ListNode Third = new  ListNode(6);
                    ListNode fourth = new ListNode(4);
                    ListNode fifth = new  ListNode(3);
                    obj. head.next = Second;
                    Second.next=Third;
                    Third.next=fourth;
                    obj.display();
                    obj.DeleteLastNode();
                  }
                    



                    
                  }

                
