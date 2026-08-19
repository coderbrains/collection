package stack;

import java.util.Stack;

public class MinStackFind  {
	
	Stack<Integer>  stack = new Stack<Integer> ();
	Stack<Integer>  minStack = new Stack<Integer> ();
	
	public void push(Integer data) {
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
	
	public Integer pop() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException("Empty");
		}
		minStack.pop();
		return stack.pop();
	}
	
	public Integer peek() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException("Empty");
		}
		return stack.peek();
	}
	
	public Integer getMin() {
		if(stack.isEmpty() || minStack.isEmpty()) {
			throw new IndexOutOfBoundsException("Empty");
		}
		return minStack.peek();
	}

}
