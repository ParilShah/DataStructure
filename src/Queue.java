/**
 * Created by Paril on 2/20/17.
 */
public class Queue {
    static class Linkedlist{
        public Head head;	// Create a head Node for Linkedlist.
        public int count;
    }

    static class Head{
        public Node firstNode;
    }
    // Node class contains value for each node and pointer to Next Node. Default value of next Node is NULL.
    static class Node{
        int value;
        Node next;
        public Node(int d){	// Constructor
            value = d;
        }
    }

    // Push value in the Queue with FIFO manner.
    void push(Linkedlist l, int value){
        if(this.isEmpty(l)){
            Node n = new Node(value);
            l.head.firstNode = n;
        }else{
            Node n = l.head.firstNode;
            Node n2 = new Node(value);
            n2.next = n; 				// set an older node as a next node of a new node.
            l.head.firstNode = n2;		// Set new node on the Top of the Stack list
        }

        l.count ++;
    }

    // Pop a value from the Queue with FIFO manner.
    void pop(Linkedlist l){
        if(this.isEmpty(l)){
            System.out.println("The Queue is an Empty.");
        }else{
            Node node = l.head.firstNode;
            if(node.next == null){
                l.head.firstNode = null;
            }else{
                while(node.next.next != null){
                    node = node.next;
                }
                node.next = null;
            }
        }
    }

    // Check Whether the Stack is empty or not.
    boolean isEmpty(Linkedlist l){
        boolean isEmpty = (l.count == 0) ? true: false;
        return isEmpty;
    }

    // Traversal of the linkedlist.
    public void traversalLinkedlist(Linkedlist l){
        Node node = l.head.firstNode;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args){
        Linkedlist list = new Linkedlist();	//
        list.head = new Head();
        Queue queue = new Queue();
        queue.push(list, 4);
        queue.push(list, 7);
        queue.push(list, 23);
        queue.push(list, 44);
        queue.pop(list);
        queue.push(list, 100);
        queue.push(list, 150);
        queue.pop(list);
        queue.traversalLinkedlist(list);
    }

}
