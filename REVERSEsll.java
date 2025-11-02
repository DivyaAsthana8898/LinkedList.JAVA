public class REVERSEsll {
    private ListNode head;


    private static class ListNode{
        private int data ;
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
          System.out.println("null");
        } //< -------- MAIN LOGIC IS UNDER ME -------------->
         public ListNode reverse(ListNode head){// 2 arg connected with obj.head
          ListNode current = head;
          ListNode previous = null;
          ListNode next = null;
          while(current!=null){
            next = current.next;
            current.next=previous;
            previous = current;
            current = next;
          }
          return previous;
        }
//<------------------------BOILER PLATE ------------------------->
        public static void main(String[] args) {
          REVERSEsll obj = new REVERSEsll();
          obj.head = new ListNode(4);
          ListNode Second = new ListNode(9);
          ListNode third= new ListNode(7);
          ListNode fourth = new ListNode(6);
          ListNode fifth= new ListNode(8);
          obj.head.next =Second;
          Second.next = third;
          third.next= fourth;
          fourth.next = fifth;
          fifth.next = null;
          System.out.println("before reverse");
          obj.display();
          obj.head = obj.reverse(obj.head);//2
          System.out.println("After reversing");
          obj.display();
        }
      }

