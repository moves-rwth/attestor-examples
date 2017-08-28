public class TreeFlatten{
	
	public static List flatten(Tree tree) {
		List<Tree> stack = new List<Tree>();
		List<Data> result = new List<Data>();
		 
		if(tree != null)
			stack.push(tree);
		 
		while (!stack.isEmpty()) {
            tree = stack.pop();
            result.add(tree.data);
            if(tree.right != null)
		  	   stack.push(tree.right);
            if(tree.left != null)
		  	   stack.push(tree.left);
        }	
		
		return result;
	}
	
	public static void main(String[] args) {
   
    }
    
    public void push(){
        Data data = new Data();
        
        List<Data> result = new List<Data>();
        
        result.push(data);
    }
}