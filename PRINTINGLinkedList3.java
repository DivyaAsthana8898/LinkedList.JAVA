public class PRINTINGLinkedList3 {
    private ListNode head;

    private static class  ListNode{
        private int data;
        private ListNode next ;

          ListNode(int data) {
            this.data =  data;
            this .next = null;
          } 
    }
     public void display(){
        ListNode current = head ;
        while(current!=null){
            System.out.println( current.data + "-->");
            current = current.next;

        }
         System.out.println("null");
     }
      public int length (){// for finding outh length of the linnked list
        int count = 0;
        ListNode current = head;
        while (current != null ){
          count ++; 
          current = current.next;

        } return count; 


      }
      //  public void insertAtLast(int value ){
      //   ListNode newnode = new ListNode(value);
      //     if(head==null ){
      //       head = newnode;
      //       return;
      //     }
      //      ListNode current = head;
      //      while(current.next != null){
      //       current = current.next;
      //      }current.next= newnode;
           
      //   }
       
       


      //  public void insertAtFirst(int value){// inserting the value at first node 
      //   ListNode newnode = new ListNode(value);
      //   newnode.next = head ;
      //   head = newnode;
      //  }


        public void InsertAtAny( int position,int value){// printing the value at any position
        ListNode node = new ListNode(value);
        if(position == 1) {
          node.next = head;
          head = node;

        }else {
          ListNode previous = head;
          int count = 1;
          while (count < position - 1 && previous != null) {
            previous = previous.next;
            count++;
          }
          ListNode current = previous.next;
          node.next=current;
          previous.next = node;
          }
        }
         public  ListNode deleteAtFirst(int value){
          if(head == null){
            return null;
          }
            ListNode temp = head ;
            head = head.next;
            temp.next=null;
            return temp;

         }
       public static void main(String[] args) {
         PRINTINGLinkedList3 obj = new PRINTINGLinkedList3();
         // Example usage to ensure obj is read and no errors occur
         obj.InsertAtAny(1, 10);
         obj.InsertAtAny(2, 20);
        System.out.println("Length: " + obj.length());
        System.out.println(obj.deleteAtFirst(10));
         obj.display();
        //  System.out.println("Length: " + obj.length());
        // System.out.println(obj.deleteAtFirst(9));
        
      }
}
