// class  Linkedlist{
//     class Node{
//         int data;
//         public Node next ;
//         public Node prev ;
//         public Node(int data) {
//            this.data = data;
//            this.next = null;
//            this.prev = null;
//        }
//     }

//     Node head;
//     public void addNode(int data){
//         Node ptr = head;
//         if (head == null){
//             Node head = new Node(data);
//             head.next = null;
//             head.prev = null;
//         }
//         else{
//             while (ptr.next != null){
//                 ptr = ptr.next;
//             }
//             Node newN = new Node(data);
//             newN.prev = ptr;
//             ptr.next = newN;
//             newN.next = null;

//         }
//     }

//     public void display(){
//         Node ptr = head;
//         while(ptr != null){
//             System.out.println(" "+ptr.data+ " ");
//             ptr = ptr.next;
//         }
//         System.out.println(" "+ptr.data+ " ");
//     }

//     // Node head(){
//     //     Node head = new Node();
//     //     head.data(10);
//     //     head.next(null);
//     //     head.prev(null);
//     //     return head;
//     // }

//     // void addNode(Node head,int d){
//     //     Node newNode = new Node();
//     //     newNode.data(d);
//     //     Node ptr = head;
//     //     while (ptr.next != null){
//     //         ptr = ptr.next;
//     //     }
//     //     head.next(newNode);
//     //     newNode.prev(head);
//     //     newNode.next(null);
//     // }
//     // void display(Node head){
//     //     Node ptr = head;
//     //     while (ptr.next != null ) {
//     //         System.out.print(" " + ptr.data + " ");
//     //     }
//     // }
// }


// public class DoublyLinkedLIst {
//  public static void main(String[] args) {
//     Linkedlist list1 = new Linkedlist();
//     list1.addNode(10);
//     list1.addNode(20);
//     list1.addNode(40);
//     list1.display();
    
//  }   
// }


class  Linkedlist{
    class Node{
        int data;
        public Node next ;
        public Node prev ;
        public Node(int data) {
           this.data = data;
           this.next = null;
           this.prev = null;
       }
    }

    Node head;
    public void addNode(int data){
        Node ptr = head;
        if (head == null){
            Node head = new Node(data);
            head.next = null;
            head.prev = null;
        }
        else{
            while (ptr.next != null){
                ptr = ptr.next;
            }
            Node newN = new Node(data);
            newN.prev = ptr;
            ptr.next = newN;
            newN.next = null;

        }
    }

    public void display(){
        Node ptr = head;
        while(ptr != null){
            System.out.println(" "+ptr.data+ " ");
            ptr = ptr.next;
        }
        System.out.println(" "+ptr.data+ " ");
    }

    // Node head(){
    //     Node head = new Node();
    //     head.data(10);
    //     head.next(null);
    //     head.prev(null);
    //     return head;
    // }

    // void addNode(Node head,int d){
    //     Node newNode = new Node();
    //     newNode.data(d);
    //     Node ptr = head;
    //     while (ptr.next != null){
    //         ptr = ptr.next;
    //     }
    //     head.next(newNode);
    //     newNode.prev(head);
    //     newNode.next(null);
    // }
    // void display(Node head){
    //     Node ptr = head;
    //     while (ptr.next != null ) {
    //         System.out.print(" " + ptr.data + " ");
    //     }
    // }
}


public class DoublyLinkedLIst {
 public static void main(String[] args) {
    Linkedlist list1 = new Linkedlist();
    list1.addNode(10);
    list1.addNode(20);
    list1.addNode(40);
    list1.display();
    
 }   
}