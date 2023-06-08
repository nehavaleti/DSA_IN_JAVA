//implementing a circular linked list in java


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class circularLinkedList {
    Node head = null;
    Node tail = null;

    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display(){
        Node current = head;

        if(head != null){
            do{
                System.out.print(current.data + " ");
                current = current.next;
            }while(current!=head);
        }
    }
}

class Main{
    public static void main(String[] args){
        circularLinkedList list = new circularLinkedList();

        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        System.out.println("The circular linked list is :");
        list.display();
    }
}
