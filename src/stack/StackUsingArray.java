package stack;

public class StackUsingArray<E> {

	private E[] arr;
	private int size;
	private int top = -1;
	
	public StackUsingArray() {
		arr = (E[])new Object[2];
		size=0;
	}
	
	public void push(E data) {
		if(size == 0) {
			arr[0] = data;
			top = 0;
			size++;
			return;
		}
		if(size == arr.length) {
			E[] newArray = (E[])new Object[arr.length*2];
			int index = 0;
			while(index != top+1) {
				newArray[index] = arr[index];
				index++;
			}
			arr = newArray;
			top++;
			size++;
			arr[top] = data;
			return;
		}
		top++;
		size++;
		arr[top] = data;
		
	}
	
	public E pop() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("Empty stack");
		}
		E data = arr[top];
		top--;
		size--;
		return data; 
	}
	
	public E peek() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("Empty stack");
		}
		return arr[top];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
}
