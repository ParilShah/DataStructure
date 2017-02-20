
public class DoublyLinkedList {
	Head head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data, Node prev, Node next){
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}
	
	static class Head{
		Node next;
		public void setNextNodeForHead(Node next){
			this.next = next;
		}
		public Node getHead(){
			return this.next;
		}
	}
		
	public void traverseLinkedList(DoublyLinkedList l){
		if(l.head.next != null){
			Node node = l.head.next;
			while(node != null){
				System.out.println(node.data);
				node = node.next;
			}
		}
	}
	
	public void addNodeAtFirst(DoublyLinkedList l, int data){
		Node node;
		if(l.head.next == null){
			node = new Node(data,null,null);
		}else{
			Node nextNode = l.head.next;
			node = new Node(data,null,nextNode);
		}

		l.head.next = node;
	}
	
	public void addNodeToLast(DoublyLinkedList l, int data){
		Node node = l.head.next;
		while(node.next != null){
			node = node.next;
		}
		Node newNode = new Node(data,node,null);
		node.next = newNode;
	}
	
	public void removeNodefromFirst(DoublyLinkedList l){
		Node node = l.head.next;
		if(node.next == null){
			l.head.next = null;
		}else{
			Node secondNode = node.next;
			l.head.next = secondNode;
		}
	}
	
    public void removeNodefromLast(DoublyLinkedList l){
		Node node = l.head.next;
		while(node.next.next != null){
			node = node.next;
		}
		node.next = null;
	}
    
    public void addNodeAfterNode(DoublyLinkedList l, int nodeNumber, int data){
		int numberOfNodes = l.numberOfNodes(l);
		Node node = l.head.next;
		if(nodeNumber>numberOfNodes || numberOfNodes<nodeNumber){
			System.out.println("There are only "+numberOfNodes);
			return;
		}

		for(int i=1; i<nodeNumber; i++){
			if(nodeNumber != 1){
				node = node.next;
			}
		}

		Node newNextNode = node.next;
		Node newNode = new Node(data, node, newNextNode);
		node.next = newNode;
	}
    
    public void removeNode(DoublyLinkedList l, int nodeNumber){
		int numberOfNodes = l.numberOfNodes(l);
		Node node = l.head.next;
		if(nodeNumber>numberOfNodes || numberOfNodes<nodeNumber){
			System.out.println("There are only "+numberOfNodes);
			return;
		}

		for(int i=1; i<nodeNumber; i++){
			node = node.next;
		}

		Node nodeNext = node.next;
		Node nodePrev = node.prev;
		nodeNext.prev = nodePrev;
		nodePrev.next = nodeNext;

	}


	public int numberOfNodes(DoublyLinkedList l){
    	Node node = l.head.next;
    	int numberOfNode = 0;
    	while(node != null){
    		numberOfNode ++;
    		node = node.next;
		}
		return numberOfNode;
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.head = new Head();
		list.addNodeAtFirst(list, 10);
		list.addNodeToLast(list, 20);
		list.addNodeToLast(list, 30);
		list.addNodeToLast(list, 40);
		list.addNodeToLast(list, 50);
		list.addNodeAtFirst(list, 5);
		list.traverseLinkedList(list);
		list.removeNodefromFirst(list);
		System.out.println("Remove Node from First-------");
		list.traverseLinkedList(list);
		list.removeNodefromLast(list);
		System.out.println("Remove Node from Last-------");
		list.traverseLinkedList(list);
		System.out.println("Number of Nodes = " + list.numberOfNodes(list));
		list.addNodeAfterNode(list, 1,15);
		System.out.println("Add Node after Node-------");
		list.traverseLinkedList(list);
		list.removeNode(list, 3);
		System.out.println("Remove Node-------");
		list.traverseLinkedList(list);
	}

}
