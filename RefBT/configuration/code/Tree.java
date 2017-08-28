public class Tree{

	Tree right;
	Tree left;
		
	static void traverseLindstrom(Tree root){
		
		if(root == null) return;
		Tree sen = new Tree();		
		
		Tree prev = sen;
		Tree cur  = root;
		
		while(cur != sen){
			Tree next = cur.left;
					
			cur.left = cur.right;
			cur.right = prev;
			
			prev = cur;
			cur  = next;
		
			if (cur == null){
				cur  = prev;
				prev = null;
			}
		}	
	}
	
	static public void traverseRecursive(Tree tree){
		if(tree != null){
			traverseRecursive(tree.left);
			traverseRecursive(tree.right);
		}
	}
	
	public static void main(String[] args) {
   
    }
	
}