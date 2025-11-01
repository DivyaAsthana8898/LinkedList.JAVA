import java.util.NoSuchElementException;

public class DeletionAtFirstANdATlastDLL {
   private  ListNode head;// SETTING THE HEAD 
    private  ListNode tail;// SETTING //THE TAIL 
    private int length;// SETTING THE LENGTH

      private class ListNode{
        int data;// // STRONING THE VALUE 
        private ListNode next;// THE NEXT POINTER
        private ListNode previous;// THE PREVIOUS POINTER

        public ListNode(int data){
            this.data = data;// 

        }
      } 
       public DeletionAtFirstANdATlastDLL(){// creating the constructor 
        this.head = null;// HEAD FIRSLLY WILL PT TO NULL
        this.tail = null;// HEAD SECONDALY WILL PT TO NULL
        this.length = 0;//  // LENGTH AT FIRST 0

       }
        public boolean IsEmpty(){//
            return length ==0;

        }
         public int length( ){
            return length;
         }
          public void display() {
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
//<-----------MAIN LOGIC STARTS FROM HERE --------------->
   public void InsertAtFirst(int data){
            ListNode newNode = new ListNode(data);
             if(IsEmpty()){
                // list was empty, new node is both head and tail
                tail = newNode;
             }else{
                // link new node before current head
                 head.previous = newNode;// ENGINE HEAD// NEWNODE WOOGIE C1
             }
              // connect new node to the old head
              newNode.next = head;// C2
              
              head = newNode;
              
              // if tail was null (empty list) ensure it's set (already handled above)
            
              
              length++;
          }
 public  void  deleteAtFirst(int data){
    ListNode newNode = new ListNode(data);
     if(IsEmpty ()){
         throw new  NoSuchElementException();
     }
      ListNode temp = head;
       if(head == tail){
        tail = null;
       }else{
        head.next.previous = null;// niche wla arro <---

       }
        head = head.next;// ----->
        temp.next = null;

       }
     public void deleteAtLast(int data){
         ListNode newNode = new ListNode(data);
     if(IsEmpty ()){
         throw new  NoSuchElementException();
     }
      ListNode temp = tail;
      if(head == tail ){
        head = null;
      }else{
        tail.previous.next = null;
      }
       tail = tail.previous;
       temp.previous = null;
       

     }
        public static void main(String[] args) {
            DeletionAtFirstANdATlastDLL obj = new DeletionAtFirstANdATlastDLL();
            obj.InsertAtFirst(18);
            obj.InsertAtFirst(9);
            obj.InsertAtFirst(7);
            obj.deleteAtFirst(7);
            obj.deleteAtLast(18);
            obj.display();
        
            
         

        }

 }


