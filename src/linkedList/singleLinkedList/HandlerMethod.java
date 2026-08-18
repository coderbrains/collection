package linkedList.singleLinkedList;

public class HandlerMethod {
	
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(10);
		linkedList.add(11);
		linkedList.add(12);
		linkedList.add(13);
		linkedList.add(14);
		linkedList.add(15);
		linkedList.add(10);
		linkedList.add(16);
		linkedList.add(17);
		linkedList.print();
		System.out.println();
		linkedList.remove(5);
		linkedList.print();
	}
}
