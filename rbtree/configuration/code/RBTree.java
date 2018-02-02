public class RBTree{
 
    boolean isBlack; //red = 0; black = 1;
    RBTree left,right,parent;
    
    int key = 42; //will not be represented by attestor
    
    public RBTree(){
        this.isBlack = false;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
    
    public void setRed(){
        this.isBlack = false;
    }
    
    public boolean isRed(){
        return !this.isBlack;
    }
    
    public void setBlack(){
        this.isBlack = true;
    }
    
    public boolean isBlack(){
        return this.isBlack;
    }
	
	public RBTree traverseLeft(){
			
		RBTree curr = this;
		while( curr.left != null ){
			curr = curr.left;
		}
		
		return curr;
	}
	
	public RBTree search( int value ){
			
		RBTree curr = this;
		while( curr != null ){
			if( curr.key < value ){
				curr = curr.left;
			}else if( curr.key > value	){
				curr = curr.right;
			}else{
				return curr;
			}
		}
		
		return curr;
	}
    
    public void insert( int value ){
        RBTree node, great, grand, parent;
        
        RBTree y = null;
        RBTree x = this;
        while( x != null ){
            y = x;
            if( value < x.key ){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        
        RBTree z = new RBTree();
        z.parent = y;
        if( value < y.key ){
            y.left = z;
        }else{
            y.right = z;
        }
        
        insertFixup( z );
    }
    
    private void insertFixup( RBTree z ){
        
        while( z.parent != null && z.parent.isRed() ){
            
            if( z.parent.parent == null ){
                z.parent.setBlack();
                return;
            }
            
            if( z.parent == z.parent.parent.left ){
                RBTree y = z.parent.parent.right;
                if( y.isRed() ){
                    z.parent.setBlack();
                    y.setBlack();
                    z.parent.parent.setRed();
                    z = z.parent.parent;
                }else{ 
                    if( z == z.parent.right ){
                        z = z.parent;
                        leftRotate( z );
                    }
                    z.parent.setBlack();
                    z.parent.parent.setRed();
                    rightRotate( z );
                }
    
            }else{
                RBTree y = z.parent.parent.left;
                if( y.isRed() ){
                    z.parent.setBlack();
                    y.setBlack();
                    z.parent.parent.setRed();
                    z = z.parent.parent;
                }else{
                    if( z == z.parent.left ){
                        z = z.parent;
                        rightRotate( z );
                    }
                    z.parent.setBlack();
                    z.parent.parent.setRed();
                    leftRotate( z );
                }
                
            }
        }
        
    }
    
    	static RBTree leftRotate(RBTree x) {
		RBTree y = x.right;
		x.right = y.left;
		if( y.left != null ){
			y.left.parent = x;
		}
		y.parent = x.parent;
		if( x.parent != null ){
			//x is root
			if( x == x.parent.left ){
				x.parent.left = y;
			}else{
				x.parent.right = y;
			}
		}
		y.left = x;
		x.parent = y;
	
		
		return y;
	}
    
    	static RBTree rightRotate(RBTree x) {
		RBTree y = x.left;
		x.left = y.right;
		if( y.right != null ) {
			y.right.parent = x;
		}
        
		y.parent = x.parent;
        if( x.parent != null ){
        	//x is root
            if( x == x.parent.right ){
            	x.parent.right = y;
            }else{
            	x.parent.left = y;
            }
        }
        y.right = x;
        x.parent = y;
		
		
		return y;
	}
    
    
    
    public static void main( String [] args ){
        
        RBTree testTree = new RBTree();
		if( ! testTree.isBlack ) {
			testTree.setBlack();
		}
		
        testTree.setRed();
		testTree.setBlack();
    }
}