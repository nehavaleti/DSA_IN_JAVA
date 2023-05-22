//implementing a linked list in java
//insert method
//display method

class Node {
   int data 
   Node next;

   Node(int data){
      this.data = data;
      this.next=null;
   }
}

class LinkedList{


   Node head;

   public void insert(int data){
      Node newNode = new Node(data);

      if(head == null){
         head = newNode;
      }else{
         Node current = head;
         while(current.next!=null){
            current = current.next;
         }

         current.next=newNode;
      }
   }

   public void display(){
      if(head == null){
         System.out.println("List is empty");
         return;
      }

      Node current = head;
      while(current != null){
         System.out.println(current.data + " ");
         current = current.next;
      }
      
   }
}

public class Main {
   public static void main(String[] args){
      LinkedList l1 = new LinkedList();

      l1.insert(1);
      l1.insert(2);
      l1.insert(3);
      l1.insert(4);
      l1.insert(5);

      l1.display();
   }
}