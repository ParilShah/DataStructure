
//@description : Create a Stack using Linked list.
//@developer : Paril Shah
//@date:02/10/2017

public class DS_Stack {
	
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
		
		// Push value in the Stack with LIFO manner.
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
		
		// Pop a value from the Stack with LIFO manner. 
		void pop(Linkedlist l){
			if(this.isEmpty(l)){
				System.out.println("The Stack is an Empty.");
			}else{
				Node n1 = l.head.firstNode.next;
				l.head.firstNode = n1;
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
			DS_Stack stack = new DS_Stack();
			stack.push(list, 4);
			stack.push(list, 7);
			stack.pop(list);
			stack.push(list, 23);
			stack.push(list, 44);
			stack.pop(list);
			stack.push(list, 100);
			stack.push(list, 150);
			stack.traversalLinkedlist(list);
		}
				
}
