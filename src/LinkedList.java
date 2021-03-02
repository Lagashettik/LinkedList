import java.util.Scanner;

public class LinkedList {
    Node head = null;
    Node tail = null;
    Scanner scan = new Scanner(System.in);

    void add(int data){
        Node node = new Node(data);
        if(tail != null){
            tail.next = node;
            tail = node;
        }
        else{
            head = node;
            tail = node;
        }
    }

    void display(){
        Node node = head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
    }

}
