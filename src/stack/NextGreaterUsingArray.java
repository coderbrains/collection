package stack;

public class NextGreaterUsingArray {
	
	public static void main(String[] args) {
		int[] array = {2,5,4,14,7,8,10,8};
		int[] greaterStore = new int[array.length];
		
		
		for(int i = 0; i < array.length; i++) {
			int max = array[i];
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] > max) {
					max = array[j];
					break;
				}
			}
			if(array[i] != max) {
				greaterStore[i] = max; 
			}else {
				greaterStore[i] = -1;
			}
			
		}
		
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i: greaterStore) {
			System.out.print(i + " ");
		}
	}

}
