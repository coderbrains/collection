package stack;

public class ReverseStack<E>{
	
	E[] stack; 
	int top, size;
	
	public ReverseStack() {
		stack = (E[])new Object[2];
		top = -1;
		size = 0;
	}
	
	public void push(E data) {
		if(size == stack.length) {
			E[] newArray = (E[]) new Object[stack.length * 2];
			int index = 0;
			for(E e : stack ) {
				newArray[index] = e;
				index++;
			}
			stack = newArray;
		}
		top++;
		size++;
		stack[top] = data;
	}
	
	public E peek() {
		if(size == 0) {
			throw new IndexOutOfBoundsException();
		}
		return stack[top];
	}
	
	public E pop() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("Emtpy list");
		}
		E data = stack[top];
		top--;
		size--;
		return data;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void reverseStack() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("Empty list");
		}
		E[] copy = (E[]) new Object[stack.length];
		int copyTop = -1;
		while(!isEmpty()) {
			copyTop++;
			copy[copyTop] = pop();
		}
		stack = copy;
		top = copyTop;
		size = top+1;
	}
	
	public void reverseStackUsingTwoPointer() {
		int left = 0;
		int right = top;
		while(left < right) {
			E leftData = stack[left];
			stack[left]  = stack[right];
			stack[right] = leftData;
			left++;
			right--;
		}
	}
	
	
	public static void main(String[] a) {
		ReverseStack<Integer> reverse = new ReverseStack<Integer>();
		reverse.push(10);
		reverse.push(20);
		reverse.push(30);
		reverse.push(40);
		
		reverse.reverseStack();
		
		reverse.reverseStackUsingTwoPointer();
		
		System.out.println(reverse.pop());
		System.out.println(reverse.pop());
		System.out.println(reverse.pop());
		System.out.println(reverse.pop());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
