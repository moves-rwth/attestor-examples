public class Traverse{
	
	static public void traverse(Tree tree){
		if(tree != null){
			traverse(tree.left);
			traverse(tree.right);
		}
	}
	
	public static void main(String[] args) {
   
    }
	
}