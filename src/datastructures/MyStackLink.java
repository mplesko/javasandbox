package datastructures;

public class MyStackLink {

	private Node node;

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


	public Object top() {
		if (node == null) {
			return null;
	} else {
			return node.item;
		}
	}
	
	public void push(Object obj) {
		Node newNode = new Node(obj);
		newNode.nodeLink = this.node;
		this.node = newNode;
	}
	
	public void pop() {
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