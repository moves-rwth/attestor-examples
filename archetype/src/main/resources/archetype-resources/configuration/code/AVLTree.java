public class AVLTree {    

    public static void main( String [] args ){
        AVLTree leaf = new AVLTree( null, null, null, 0 );
    }

    private AVLTree parent;
    private AVLTree left;
    private AVLTree right;
    private int balance;
    private int key = 7;

    public AVLTree( AVLTree parent, AVLTree left, AVLTree right, int balance ){
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.balance = balance;
    }
    
    static AVLTree search(AVLTree n, int value) {    
        
        while(n != null) {
            if( n.key == value ) {
                return n;
            } else if( n.key < value ) {
                if(n.right != null) {
                    n = n.right;
                } 
            } else {                                                         
                if(n.left != null) {
                    n = n.left;
                }
            }
        }
        
        AVLTree res = null;
        return res;
    }
}
    
