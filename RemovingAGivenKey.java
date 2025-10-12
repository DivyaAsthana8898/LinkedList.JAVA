
// public class RemovingAGivenKey {
//     private ListNode head;

//     private static class ListNode{
//         private int data ;
//         private ListNode next;

//         ListNode(int data ){
//             this.data  = data;
//             this.next = null;
//         }
//     }
//     public void display (){
//         ListNode current = head;
//         while(current != null){
//             System.out.println(current.data + "-->");
//             current = current.next;
//         }
//          System.out.println("null");
//     } 

//   public ListNode removeListNode(int key){
//     // if( current  !=null && current==key){
//     //        head = current.next;
//     //        return head;
//     // }
//     ListNode current = head;
//     ListNode temp = null;
//      if( current !=null && current.data==key){
//            head = current.next;
//            return head;
//     }
//     while(current !=null && current.data !=key){
//         temp = current;
//         current = current.next;
//     }
//     if(current == null) return head;
//      temp.next = current.next;
//      return head;


//   }

//     public static void main(String[] args) {
//         RemovingAGivenKey obj = new RemovingAGivenKey();
//          obj.head = new ListNode(7);
//          ListNode second  = new ListNode(6);
//             ListNode third  = new ListNode(6);
//             ListNode fourth  = new ListNode(4);
//             ListNode fifth  = new ListNode(4);
//             obj.head.next = second;
//             second.next = third;
//             third.next = fourth;
//             fourth.next = fifth;
//             fifth.next = null;
//             System.out.println("BEFORE DELETION");
//             obj.display();
//             int key = 4;
//             obj.removeListNode(key);
//             System.out.println("AFTER DELETION");
//             obj.display();
//          }
//         } 


public class RemovingAGivenKey {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode removeListNode(int key) {
        // Case 1: Empty list
        if (head == null) return null;

        // Case 2: Key found at head
        if (head.data == key) {
            head = head.next; // remove head
            return head;
        }

        // Case 3: Search for the key
        ListNode current = head;
        ListNode prev = null;

        while (current != null && current.data != key) {
            prev = current; // store previous node // PREV WAS FIRSTLY SETTED TO NULL SO ITS NEXT WAS FIRST NULL NOW IT IS CURRENT
            current = current.next; // move ahead
        }

        // If key not found
        if (current == null) return head;

        // Unlink the node to delete it
        prev.next = current.next;

        return head;
    }

    public static void main(String[] args) {
        RemovingAGivenKey obj = new RemovingAGivenKey();
        obj.head = new ListNode(7);
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("BEFORE DELETION:");
        obj.display();

        int key = 4;
        obj.removeListNode(key);

        System.out.println("AFTER DELETION:");
        obj.display();
    }
}

