import java.util.*;

public class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    public void insertNode(int value){
        Node node = new Node(value, null);
        node.next = this.head;
        if(this.tail == null){
            this.tail = this.head;
        }
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int value, Node next){
            this.data = value;
            this.next = next;
        }
    }
}