package stack;

public class StackUArray<E> {
	
	private E[] array;
	private int size;
	private int top;
	
	public StackUArray() {
		array = (E[])new Object[2];
		size = 0;
		top = -1;
	}
	
	public E peek() {
		if(size == 0 || top == -1) {
			throw new ArrayIndexOutOfBoundsException("Empty list");
		}
		return array[top];
	}
	
	public E pop() {
		if(size == 0 || top == -1) {
			throw new ArrayIndexOutOfBoundsException("Empty list");
		}
		E data = array[top];
		top--;
		size--;
		return data;
	}
	
	public boolean isEmtpy() {
		return size == 0;
	}
	
	public void push(E data) {
		if(array.length == size) {
			E[] newArray = (E[]) new Object[array.length * 2];
			int index = 0;
			for(E e: array) {
				newArray[index] = e;
				index++;
			}
			array = newArray;
		}
		top++;
		size++;
		array[top] = data;
	}
}
