package stack.array.stackofstrings;

public class FixedCapacityStackOfStrings {
	
	public String[] arr;
	public int n = 0;

	public FixedCapacityStackOfStrings(int capacity) {
		arr = new String[capacity]; 	
	}
	
	public boolean isEmpty() {
		if(arr.length == 0) {return true;}
		return false;
	}
	
	public void push(String text) {
		arr[n++] = text;
	}
	
	public String pop() {
		String ref = arr[--n];
		arr[n--] = null;
		return ref;
		
	}
	
	public int size() {
		return n;
		
	}
	
	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
