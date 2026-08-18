package linkedList.singleLinkedList;
public class CustomLinkedList{
	
	class Node{
		int data; 
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
		Node head;
		int size=0;
		
		public void add(int data) {
			Node node = new Node(data);
			if(head==null) {
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
		
		public void print() {
			if(head == null) {
				System.out.println("Empty list");
				return;
			}
			Node current = head;
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		
		public void remove(int index) {
			if(head == null) {
				System.out.println("Empty list");
				return;
			}
			if(size <= index || index < 0) {
				System.out.println("invalid index");
				return;
			}
			if(index == 0) {
				head = head.next;
				size--;
				return;
			}
			
			Node current = head;
			Node prev = head;
			int traversal = 0;
			while(index != traversal) {
				prev = current;
				current = current.next;
				traversal++;
			}
			prev.next = current.next;
			size--;
		}
	
	public static void main(String[] args) {
		CustomLinkedList customLinkedList = new CustomLinkedList();
		customLinkedList.add(20);
		customLinkedList.add(25);
		customLinkedList.add(26);
		customLinkedList.add(27);
		customLinkedList.add(28);
		customLinkedList.add(29);
		customLinkedList.print();
		customLinkedList.remove(3);
		customLinkedList.print();
	}
}
