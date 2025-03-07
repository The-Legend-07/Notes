
public class SinglyLinkedList {

	//an SLL has 0 or more nodes
	public Node head;	//the star of the list or null (if empty)
	private int size;	//how many Node objs?
	
	public SinglyLinkedList() {
		
		head = null;
		size = 0;
		
	}
	
	//getter/setter/helper methods
	public int size() {
		return size;
	}
	
	
	//adding Nodes!
	public void add(Node newNode) {
		
		//what must be updated to add a new node?
		size += 1;
		
		//does the Head node need to be updated
		if (head == null) {
			
			head = newNode;
			
		} else {
			
//			//visit every node in the list
//			// if you find one that has a null next reference, you found where to add the new node
//			
//			Node temp = head;	//this temporary node references beginning of list
//			while(temp.next != null) {
//				
//				//move to the next node
//				temp = temp.next;
//			}
//			
//			//ready to add; temp is now the last node (end of list)
//			temp.next = newNode; 	//adding the newNode
			
			
			
			
			//call the helper method
			add(head, newNode);
			
		}
		
	}
	
	
	//recursive private add helper method
	private void add(Node curr, Node newNode) {
		
		//base case
		if (curr.next == null) {	//@ the last node - no next reference
			curr.next = newNode;
		} else {
			
			//using a method call, move to next node
			add(curr.next, newNode);	//the curr.next is what jumps from one node to the next
			
		}
		
	}
	
	
	
	//remove & return the removed Node
	public Node remove(int index) {
		
		if (index < 0 || index >= size) {
			return null;
		} else {
			int curr = 0;
			size--;
			return remove(head, index, curr);
		}
		
	}
	
	//helper method for remove
	private Node remove(Node curr, int index, int currIndex) {
		
		if(currIndex==index-1) {
			Node temp = curr.next;
			curr.next = curr.next.next;
			return temp;
			
		} else if (index == 0){
			Node temp = curr;
			curr = curr.next;
			curr.next = curr.next.next;
			return temp;
		}
		
		{
			
			return remove(curr.next, index, currIndex+1);
			
		}
		
	}
	
	//helper method for remove
//	private Node remove(Node curr, int index, int currIndex) {
//		
//		Node temp = null;
//		
//		if(index == currIndex) {
//			temp = curr;
//			Object data = (curr.next).getData();
//			curr.setData(data);
//			return remove(curr.next, index, currIndex+1);
//			
//		} 
//		
//		else if((currIndex > index) && (currIndex < size-1)){
//			Object data = (curr.next).getData();
//			curr.setData(data);
//			return remove(curr.next, index, currIndex+1);
//			
//		} 
//		
//		else if (currIndex >= size-1){
//			Object data = (curr.next).getData();
//			curr.setData(data);
//			return temp;
//			
//		} 
//		
//		else {
//			return remove(curr.next, index, currIndex+1);
//		}
//		
//	}
	
	
	
	//return the node at the index
	public Node get(int index) {
		
		//check index
		if (index < 0 || index >= size) {
			return null;	//invalid index
		} else {
			
//			//use a loop to figure out
//			Node temp = head;
//			int curr = 0;
//			while (curr < index-1) {
//				temp = temp.next;
//				curr++;
//			}
////			for (int i = 1; i < index; i++) {
////				temp = temp.next;
////			}
//			
//			//the previous Node is the only node referencing the node that we want
//			return temp.next;
			
			int curr = 0;
			return get(head, index, curr);
			
		}
	}
	
	
	//recursive get method - helper method
	public Node get(Node curr, int index, int currIndex) {
		if(currIndex == index) {
			return curr;
		} else {
			return get(curr.next, index, currIndex+1);
		}
	}
	
	
	int counter = 0;
	public String toString() {
		
		//end
		if(counter >= size-1) {
			int x = counter;
			counter = 0;
			return get(x).getData() + "]";
			
		} 
		//start
			else if (counter == 0){
			counter ++;
			return "[" + get(0).getData() + ", " +  toString();
			
		} 
			//everything else
			else {
			
			Node temp = get(counter);
			counter++;
			return temp.getData()  + ", " + toString();
		}
	}
	
	
	
}
