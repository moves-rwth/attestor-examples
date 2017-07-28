
public class BTNodeAlt {


    private BTNodeAlt leftAlt;
    private BTNodeAlt rightAlt;
    
    public BTNodeAlt(){
        this.leftAlt = null;
        this.rightAlt = null;
    }

    public static BTNodeAlt getLeft(BTNodeAlt cur){
        
        cur = cur.leftAlt;
        return cur;
    }
    
    public static BTNodeAlt buildTree(){
        BTNodeAlt root = new BTNodeAlt();
        
        BTNodeAlt left = new BTNodeAlt();
        BTNodeAlt right = new BTNodeAlt();
        root.leftAlt = left;
        root.rightAlt = right;
        
        return root;
    }
    
    public static void main(String[] args) {
    
        BTNodeAlt root = buildTree();
        getLeft(root);
    }
    
}
