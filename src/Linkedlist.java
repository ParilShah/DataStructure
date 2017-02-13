//@description : Create a Single Linked list without tail.
//@developer : Paril Shah
//@date:02/07/2017

public class Linkedlist {
	// Node class contains value for each node and pointer to Next Node. Default value of next Node is NULL.  
	static class Node{
		int value;
		Node next;
		public Node(int d){	// Constructor
			value = d;
		}
	}
	
	Node head;	// Create a head Node for Linkedlist.
	
	public static void main(String[] args){
		Linkedlist list = new Linkedlist();	//
		list.head = new Node(1);	
		Node secondNode = new Node(44);
		Node thirdNode = new Node(100);
		list.head.next = secondNode;
		secondNode.next = thirdNode;
		list.traversalLinkedlist(); 	// Do traversal for Linkedlist
		System.out.println("******************");
		list.addNodeatFront();			// Add a node to front of Linkedlist
		list.traversalLinkedlist();		// Again do traversal for checking addNodeatFront operation.
		System.out.println("******************");
		list.removeNodefromFront();		// Remove a node from front of Linkedlist
		list.traversalLinkedlist();		// Again do traversal for checking removeNodefromFront operation.
		System.out.println("******************");
		list.addNodeatLast();			// Add a node at Last of a Linkedlist
		list.traversalLinkedlist();		// Again do traversal for checking addNodeatLast operation.
		System.out.println("******************");
		list.removeNodefromLast();		// Remove a node from last of Linkedlist
		list.traversalLinkedlist();		// Again do traversal for checking removeNodefromLast operation.
		System.out.println("******************");
	}
	
	// Traversal of Linkedlist.
	public void traversalLinkedlist(){
		Node node = this.head;
		while(node != null){
			System.out.println(node.value);
			node = node.next;
		}
	}

	// Add node to Front of the Linkedlist 
	public void addNodeatFront(){
		Node node = this.head;
		Node newNode = new Node(12);
		this.head = newNode;
		this.head.next = node;
	}
	
	// Remove node from Front of the Linkedlist 
	public void removeNodefromFront(){
		Node node = this.head.next;
		this.head = node;
	}
	
	// Get Last Node
	public Node getLastNode(){
		Node node = this.head;
		while(node.next != null){
			node = node.next;
		}
		return node;
	}
	
	public Node getSecondLastNode(){
		Node node = this.head;
		while(node.next.next != null){
			node = node.next;
		}
		return node;
	}
	
	// Add node to Front of the Linkedlist 
	public void addNodeatLast(){
		Node node = this.getLastNode();
		Node newNode = new Node(50);
		node.next = newNode;
	}
		
		// Remove node from Front of the Linkedlist 
	public void removeNodefromLast(){
		Node node = this.getSecondLastNode();
		node.next = null;
	}
	
}
