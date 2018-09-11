package stack.linked.stackofstrings;

public class LinkedStackOfStrings {
	
	private Node first = null;
	private int size = 0;
	

	public LinkedStackOfStrings() {	
	}
	
	public boolean isEmpty() {
		if(first == null) {return true;}
		return false;
		
	}
	
	public void push(String item) {
		Node oldFirst = first;
		first = new Node();
		first.text= item;
		first.next = oldFirst;
		size = size+1;	
	}
	
	public String pop() {
		String ret = first.text;
		first = first.next;
		size=size-1;
		return ret;
		
	}
	
	public int size() {
		return this.size;
		
	}
	
	
class Node{
	
	 Node next;
	 String text;
		
	}
}
