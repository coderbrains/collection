package stack;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int data) {
		stack.push(data);
		if(minStack.isEmpty()) {
			minStack.push(data);
			return;
		}
		if(minStack.peek() > data) {
			minStack.push(data);
			return;
		}
		minStack.push(minStack.peek());
	}
	
	public Integer pop() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		minStack.pop();
		return stack.pop();
	}
	
	public Integer peek() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
//		minStack.pop();
		return stack.peek();
	}
	
	public Integer getMin() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		return minStack.peek();
	}
	

}
