package stack;

import java.util.Stack;

public class MinStackProblem {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int data) {
		if(stack.isEmpty() || minStack.isEmpty()) {
			stack.push(data);
			minStack.push(data);
			return;
		}
		
		stack.push(data);
		if(minStack.peek() > data) {
			minStack.push(data);
		}else {
			minStack.push(minStack.peek());
		}
	}
	
	public int peek() {
		if(!stack.isEmpty()) {
			return stack.peek();
		}
		throw new IndexOutOfBoundsException();
	}
	
	public int pop() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		minStack.pop();
		return stack.pop();
	}
	
	public int getMin() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		return minStack.peek();
	}
		
		
		
		
	

}
