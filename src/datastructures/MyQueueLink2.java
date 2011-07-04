package datastructures;

public class MyQueueLink2 {

	private Node node;
	private Node endNode;

	public int getSize() {
		return getSize(node);
	}
	private int getSize(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + getSize(node.nodeLink);
	}

	public int getNumberOfElements() {
		return getSize();
	}
	
	public Object front() {
		if (node == null) {
			return null;
		} else {
			return node.item;
		}
	}
	
	public void enqueue(Object obj) {
		Node newNode = new Node(obj);
		
		if (this.node == null) {
			this.node = newNode;
		} else {
			endNode.nodeLink = newNode;
		}
		endNode = newNode;
	}
	
	public void dequeue() {
		if (node == null) {
			return;
		} else {
			this.node = this.node.nodeLink;
		}		
	}
	
	class Node {
		Object item;
		
		Node nodeLink;
		
		public Node(Object item) {
			this.item = item;
			nodeLink = null;
		}
	}
}