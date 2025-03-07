import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTester {

	@Test
	void testSize() {
		
		//1 - create a stack
		Stack<Double> stack = new Stack<Double>();
		
		//2 - check the size
		assertTrue(stack.size()==0);
	}
	
	@Test
	void testPush() {
		
		//1 - create a stack
		Stack<Integer> s = new Stack<Integer>();
		
		//2 - add 1 element
		s.push(1);
		System.out.println(s);
		
		//3 - check content using toString
		assertTrue(s.toString().equals("[1]"));
		
		//4 - add one more to continue checking
		s.push(5);
		System.out.println(s);
		assertTrue(s.toString().equals("[1, 5]"));
	
	}
	
	@Test
	void testEmpty() {
		Stack<Integer> s = new Stack<Integer>();
		assertTrue(s.size() == 0);
		s.push(3);
		assertTrue(s.empty() == false);
	}
	
	@Test
	void testPop() {
		Stack<Integer> s = new Stack<Integer>();
		assertTrue(s.pop() == null);
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		assertTrue(s.pop() == 3);
		System.out.println(s);
		assertTrue(s.size() == 2);
	}
	
	@Test
	void testPeek() {
		Stack<Integer> s = new Stack<Integer>();
		assertTrue(s.peek() == null);
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		assertTrue(s.peek() == 3);
		assertTrue(s.size() == 3);
	}
	
}
