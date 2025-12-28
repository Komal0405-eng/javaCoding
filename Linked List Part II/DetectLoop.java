public class DetectLoop{
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


public static boolean isCycle(){
    Node slow = head;
    Node fast = head;

    while( fast != null && fast.next != null ){
        slow = slow.next; //+1
        fast = fast.next.next;//+2

        if(slow == fast){
            return true; // cycle exits
       }  
   }
    return false ; // cycle doesn't exists 
}
public static void main(String args []){
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;

    //1->2->3->1
    System.out.println(isCycle());
} }