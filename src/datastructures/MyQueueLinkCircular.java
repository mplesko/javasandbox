package datastructures;

public class MyQueueLinkCircular {

	private Node endNode;

	public Object front() {
		if (endNode == null) {
			return null;
		} else {
			return endNode.nodeLink.item;
		}
	}
	
	public void enqueue(Object obj) {
		Node newNode = new Node(obj);
		
		if (this.endNode == null) {
			this.endNode = newNode;
			this.endNode.nodeLink = newNode;
			
		} else {
			Node firstNode = endNode.nodeLink;
			newNode.nodeLink = firstNode;
			endNode.nodeLink = newNode;
			endNode = newNode;			
		}
	}
	
	public void dequeue() {
		if (endNode == null) {
			return;
		} else if (endNode == endNode.nodeLink) {
			endNode = null;
		} else {
			endNode.nodeLink = endNode.nodeLink.nodeLink;
		}		
	}
	
	class Node {
		Object item;
		
		Node nodeLink;
		
		public Node(Object item) {
			this.item = item;
			nodeLink = null;
		}
		public String toString() {
			return (String)item;
		}
	}
}