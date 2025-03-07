
public class Node {

	private int data;
	public Node left;
	public Node right;
	
	
	
	public Node (int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public String toString() {
		return ""+data;
	}
	
}


