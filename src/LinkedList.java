import java.util.ArrayList;
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

    void append(int data){
        try{
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    void insert(int position, int data) {
        Node node = head;
        while(position != 1){
            position--;
            node = node.next;
        }
        Node newNode = new Node(data);
        newNode.next = node.next;
        node.next = newNode;
    }

    int pop(){
        Node data = new Node();
        try {
            data.data = head.data;
            head = head.next;
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        return data.data;
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
        linkedList.append(70);
        linkedList.insert(1, 30);
        linkedList.display();
        System.out.println("\n"+linkedList.pop()+"\n");
        linkedList.display();

    }

}