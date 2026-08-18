package stack;

public class StackArray<E>{
	
	private int top = -1;
	private int size = 0;
	private E[] array;
	
	public StackArray() {
		top = -1;
		size = 0;
		array = (E[])new Object[2];
	}
	
	public void push(E data) {
		if(size == array.length) {
			E[] newArray = (E[])new Object[array.length * 2];
			int index = 0;
			while(index < array.length) {
				newArray[index] = array[index];
				index++;
			}
			array = newArray;
		}
			top++;

		array[top] = data;
		size++;
		
	}
	
	public E pop() {
		if(size == 0) {
			throw new IndexOutOfBoundsException();
		}
		int index = top;
		top--;
		size--;
		return array[index];
	}
	
	public E peek() {
		if(size == 0) {
			throw new IndexOutOfBoundsException();
		}
		return array[top];
	}
	
	public boolean isEmpty() {
		return size==0;
	}

}
