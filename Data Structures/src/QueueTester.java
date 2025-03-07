import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTester {

	@Test
	void test() {
		
		//create a queue
		Queue<Integer> myQ = new Queue<Integer>();
		
		//add one element
		myQ.enqueue(1);
		System.out.println(myQ);
		assertTrue(myQ.dequeue()==1);
		System.out.println(myQ);
		
		assertTrue(myQ.empty() == true);
		assertTrue(myQ.size() == 0);
		
		myQ.enqueue(2);
		myQ.enqueue(3);
		System.out.println(myQ);
//		myQ.dequeue();
//		System.out.println(myQ.toString());
		assertTrue(myQ.dequeue()==2);
		System.out.println(myQ);
		
		myQ.enqueue(4);
		myQ.enqueue(5);
		assertTrue(myQ.peek() == 3);
		System.out.println(myQ);
		assertTrue(myQ.empty() == false);
		
		assertTrue(myQ.size() == 3);
		System.out.println(myQ);
		assertTrue(myQ.toString().equals("[3, 4, 5]"));
		
	}

}
