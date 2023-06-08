//implementing a doubly linked list in java 

class Node{
    int data;
    Node previous;
    Node next;

    
    public Node(int data){
        this.data=data;
        this.previous = null;
        this.next = null;
    }

}
class doublylinkedlist {
    Node head=null;
    Node tail=null;

    public void addNode(int data){
         Node newNode = new Node(data);
         if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public void displayNodeForward(){
        Node current = head;
        if(head == null){
            System.out.println("The list is empty")
        }

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        
    }

    public void displayNodeBackward(){
        Node current = tail;

        if(head==null){
            System.out.println("The Doubly Linked list is empty");
        }
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.previous;
        }
        System.out.println();
    }

    
}

class Main {
    public static void main(String[] args){
        doublylinkedlist l1 = new doublylinkedlist();
  
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);
  
        System.out.println("Doubly Linked list Forward: ");
        l1.displayNodeForward();
        System.out.println("Doubly Linked List Backward: ");
        l1.displayNodeBackward();
      }
}
