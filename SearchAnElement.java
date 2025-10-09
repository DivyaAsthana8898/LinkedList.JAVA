public class SearchAnElement {
    private ListNode head;

    public static class ListNode {
        private  int data ;
          private ListNode next;

          ListNode (int data){
            this .data = data;
            this .next = null;
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
           public   boolean find(ListNode head, int searchKey){
            if(head == null){
                return false;
            }
            ListNode current = head ;
            while(current != null){
                if(current.data == searchKey){
                    return true;
                }
                 current = current.next;
                
            }
              return false;
        }
           public static void main(String[] args) {
            SearchAnElement obj = new SearchAnElement();
            obj.head = new ListNode (7);
            ListNode Second = new ListNode(6);
            ListNode Third = new ListNode(5);
            ListNode fourth = new ListNode(8);
            obj.head.next = Second;
            Second.next = Third;
            Third.next = fourth;
            obj.display();
            int searchKey= 8;
            obj.find(obj.head ,searchKey); // object ka nam // method(Argument) ;
            boolean result= obj.find(obj.head ,searchKey);//Hey obj, please run the find method starting from your head node and search for the value stored in searchKey.”
            if(result){
                System.out.println(searchKey + " :ElementFound in the linkedlist");
            }else{
                System.out.println(searchKey + " :Element not found");

            }
            }


           }
        
            
            