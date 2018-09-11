package stack.test;

import stack.linked.stackofstrings.LinkedStackOfStrings;

public class StackTest {

	public static void main(String[] args) {
		LinkedStackOfStrings lss = new LinkedStackOfStrings();
		System.out.println(lss.isEmpty());
		lss.push("a");
		System.out.println(lss.isEmpty());
		System.out.println(lss.size());
		lss.push("r");
		lss.push("j");
		lss.push("u");
		System.out.println(lss.size());
		System.out.println(lss.pop());

		

	}

}
