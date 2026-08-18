package linkedList.doublyLinkedList;

import java.util.Objects;

public class MyDoublyLinkedList<E> {
	int size = 0;
	Node<E> head;
	
	public void add(E data) {
		Node<E> node = new Node<E>(data);
		if(head == null) {
			head = node;
			size++;
			return;
		}
		Node<E> current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
		node.prev = current;
		size++;
	}
	
	public void removeLast() {
		if(Objects.isNull(head)) {
			System.out.println("Empty list");
			return;
		}
		if(head.next == null) {
			head = null;
			size--;
			return;
		}
		Node<E> current = head;
		while(current.next != null) {
			current = current.next;
		}
		Node<E> prev = current.prev;
		prev.next = null;
		current.prev = null;
		size--;
		
	}
	
	
	
}
