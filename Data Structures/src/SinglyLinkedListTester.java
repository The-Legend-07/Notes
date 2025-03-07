import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTester {

	@Test
	void testEmptyListSize() {
		
		//test that a newly created list is size 0
		SinglyLinkedList list = new SinglyLinkedList();
		assertTrue(list.size() == 0);

	}
	
	@Test
	void testAdd() {
	
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.add(new Node(9));
		assertTrue(list.size() == 1);
		
		list.add(new Node(1));	//basically the .get(0) can't reference the first thing, it references the second 
								//thing which is why we need to add another one

		assertTrue(list.get(0) != new Node(1));
	}
	
	@Test
	void testGet() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
//		list.add(new Node(9));
//		list.add(new Node(1));
//		list.add(new Node(7));
		
		Node a = new Node(9);
		Node b = new Node(1);
		Node c = new Node(7);
		list.add(a);
		list.add(b);
		list.add(c);
		
		assertTrue(list.get(0).equals(a));
		assertTrue(list.get(1).equals(b));
		
	}
	
	@Test
	void testRemove() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		Node a = new Node(9);
		Node b = new Node(1);
		Node c = new Node(7);
		Node d = new Node(3);
		Node e = new Node(5);
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		
		System.out.println(list.toString());
		list.remove(0);
		System.out.println(list.toString());
//		assertTrue(list.remove(2).equals(c));
		
	}
	
	
	@Test
	void testString() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		Node a = new Node(9);
		Node b = new Node(1);
		Node c = new Node(7);
		list.add(a);
		list.add(b);
		list.add(c);
		
//		System.out.println(list.toString());
		assertTrue(list.toString().equals("[9, 1, 7]"));

		Node d = new Node(3);
		list.add(d);
//		System.out.println(list.toString());

		assertTrue(list.toString().equals("[9, 1, 7, 3]"));
		
	}
	

}
