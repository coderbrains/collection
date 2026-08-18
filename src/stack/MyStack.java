package stack;

public class MyStack<E> {
	private int size;
	private Node<E> bottom;
	private Node<E> top;
	
	public void push(E data) {
		Node<E> node = new Node<E>(data);
		if(top == null || bottom == null || size == 0) {
			bottom = top = node;
			size++;
			return;
		}
		
		top.next = node;
		top = node;
		size++;		
	}
	
	public E peek(E data) {
		if(top == null || bottom == null || size == 0) {
			throw new IndexOutOfBoundsException("Empty stack");
		}
		return top.data;
	}
	
	public E pop() {
		if(top == null || bottom == null || size == 0) {
			throw new IndexOutOfBoundsException("Empty stack");
		}
		if(bottom.next == null) {
			E returnableData = top.data;
			top = bottom = null;
			size--;
			return returnableData;
		}
		Node<E> prev = bottom;
		Node<E> current = bottom;
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		E returnableData = top.data;
		top = prev;
		prev = null;
		size--;
		return returnableData;
	}
	
	public boolean isEmpty() {
		return size==0;
	}

}
