package stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		int[] array = {2,4,5,9,12,80,21,15,75};
		
		int[] nextGreater = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			int max = array[i];
			for(int j= i + 1 ; j < nextGreater.length; j++) {
				if(max < array[j]) {
					max = array[j];
					break;
				}
			}
			if(max == array[i]) {
				nextGreater[i] = -1; 
			}else {
				nextGreater[i] = max;
			}
		}
		
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : nextGreater) {
			System.out.print(i + " ");
		}
	}

}
