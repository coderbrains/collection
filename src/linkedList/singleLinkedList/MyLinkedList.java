package linkedList.singleLinkedList;

public class MyLinkedList {
	
	Node head = null;
	int size = 0;
	
	public void add(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			size++;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
		size++;
	}
	
	public void remove(int index) {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		if(index < 0 || index >= size) {
			System.out.println("Invalid index");
			return;
		}
		if(index == 0) {
			head = head.next;
			size--;
			return;
		}
		Node prev = head;
		Node current = head;
		int traversal = 0;
		while(index != traversal) {
			prev = current;
			traversal++;
			current = current.next;
		}
		prev.next = current.next;
		size--;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		Node current = head;
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
	}
	
}
