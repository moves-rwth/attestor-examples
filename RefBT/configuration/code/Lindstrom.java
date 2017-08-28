public class Lindstrom{
		
	static void traverse(Tree root){
		
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
	
	public static void main(String[] args) {
   
    }
}