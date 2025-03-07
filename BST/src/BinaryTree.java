
public class BinaryTree {
	
	//root node (top of the tree)
	Node root;
	int size;
	
	public BinaryTree() {
		root = null;
		size = 0;
	}
	
	
	
	
	//this is the long way to add a new node - no recursion
	public void add(Node newNode) {
		
		//empty tree - set the root
		if (root == null) {
			root = newNode;
			size+=1;
		} else {
			
			size+=1;
			
			//figure out if you need to go left or right from current node
			Node curr = root;
			
			while(curr.left != null || curr.right != null) {
				
				//if you need to traverse
				if (curr.left!= null && newNode.getData() < curr.getData()) {
					curr = curr.left;
				} else if (curr.right!= null && newNode.getData() >= curr.getData()){
					curr = curr.right;
				} else if (curr.left== null && newNode.getData() < curr.getData()){
					//needs to go left but no left node
					curr.left = newNode;
				} else {
					curr.right = newNode;
				}
			}
			
		}
	}
	
	
	
	//this is a better way to add a new node - recursion
	public void add (Node curr, Node newNode) {
		
		//base case?
		if (newNode.getData() < curr.getData()) {
			
				//add - don't recurse
			if (curr.left == null) {
				curr.left = newNode;
				return;
			} else {
				//recursively call add
				add(curr.left, newNode);
			}
			
		} else {
			if (curr.right == null) {
				curr.right = newNode;
				return;
			} else {
				add(curr.right, newNode);
			}
		}
		
		
	}
	
	
	public String toString() {
		//for now - implement any way of printing your tree so you can check its content
		
		
		if ()
		return root.toString();
		
		
	}
	
	

}
