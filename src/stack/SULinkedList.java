package stack;

public class SULinkedList<E> {
	
	Node<E> top;
	
	public void push(E data) {
		Node<E> node = new Node<E>(data);
		if(top == null) {
			top = node;
			return;
		}
		
		Node<E> secondTop = top;
		node.next = secondTop;
		top = node;
	}
	
	public E peek() {
		if(top == null) {
			throw new IndexOutOfBoundsException("Empty Stack");
		}
		
		return top.data;
	}
	
	public E pop() {
		if(top == null) {
			throw new IndexOutOfBoundsException("Empty Stack");
		}
		E data = top.data;
		top = top.next;
		return data;
	}
	
	public boolean isEmtpy() {
		return top == null;
	}

}
