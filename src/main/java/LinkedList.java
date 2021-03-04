import java.util.ArrayList;
import java.util.List;
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

    int popLast(){
        Node node = head;
        try{
            while (node.next != null){
                tail = node;
                node = node.next;
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        tail.next = null;
        return node.data;
    }

    boolean search(int key){
        Node node = head;
        try {
            while (node.data != key) {
                node = node.next;
            }
        }catch (NullPointerException e){
            return false;
        }
        return true;
    }


}