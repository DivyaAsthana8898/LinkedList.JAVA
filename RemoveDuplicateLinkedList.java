public class RemoveDuplicateLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void   display(){
        ListNode current = head;
        while(current!=null){
            System.out.println(current.data+"-->");
            current = current.next;
        }
         System.out.println("null");
    }
       public void removingDuplicates(){
          ListNode current = head;
          while(current != null && current.next !=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
    }
        public static void main(String[] args) {
        RemoveDuplicateLinkedList obj = new RemoveDuplicateLinkedList();
         obj.head = new ListNode(7);
            ListNode second  = new ListNode(6);
            ListNode third  = new ListNode(6);
            ListNode fourth  = new ListNode(4);
            ListNode fifth  = new ListNode(4);
            obj.head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = null;
            obj.removingDuplicates();
            obj.display();
         }
        }