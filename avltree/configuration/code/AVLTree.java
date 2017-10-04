public class AVLTree {	

	public static void main( String [] args ){
		AVLTree leaf1 = new AVLTree( null, null, null, 0 );
		//leaf1 = insert( leaf1, 5 );
		//leaf1 = insert( leaf1, 42 );
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

	static AVLTree leftTraversal(AVLTree n) {	
		while(n.left != null) {
			n = n.left;
		}
		return n;
	}

	static AVLTree rightTraversal(AVLTree n) {	
		while(n.right != null) {
			n = n.right;
		}
		return n;
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
	
	static AVLTree searchAndBack(AVLTree n, int value) {	
		
        n = search(n, value);
        n = climbUpwards(n);

        return n;
    }
    
    static AVLTree searchAndSwitchSubtrees(AVLTree n, int value) {	
		
        n = search(n, value);
        //n = switchSubtrees(n);

        while(n != null && n.parent != null) {
            n = switchSubtrees(n);
            n = n.parent;
        }
        
        return n;
    }
    
    static AVLTree switchSubtrees(AVLTree n) {
        AVLTree t = n.left;
        
        if(n.balance == -1) {
            n.balance = 1;
        } else if(n.balance == 1) {
            n.balance = -1;
        }
        
        n.left = n.right;
        n.right = t;
        t = null;
        
        return n;
    }
    
    static AVLTree climbUpwards(AVLTree n) {
    
        while(n != null && n.parent != null) {
            n = n.parent;
        }

        return n;
    }
	
	public static void addNoRebalance(AVLTree n, int value) {
		
		if(n == null) {
			n = new AVLTree(null, null, null, 0);
			return;
		}
		
		while(n != null) {
            if( n.key == value) {    
            	return; // value already exists
			} else if(value < n.key) {
				
				if(n.left == null) {
					
					AVLTree newNode = new AVLTree(n, null, null, 0);
					n.left = newNode;
					rebalance(newNode);
					return;
				} else {
					
					n = n.left;
				}
				
				
            } else {
            	
            	if(n.right == null) {
            		
            		AVLTree newNode = new AVLTree(n, null, null, 0);
            		n.right = newNode;
            		//rebalance(n);
            		return;            		
            	} else {
            		
            		n = n.right;
            	}
            	
            }
        }		
	}
    
    //insert the element at the left-most-position instead of searching
    public AVLTree pseudoInsert(){
        AVLTree n = this;
        AVLTree leftMost = leftTraversal( n );
        AVLTree newNode = new AVLTree( leftMost , null, null, 0 );
        leftMost.left = newNode;
        
        AVLTree returnNode = rebalance( newNode );
       
       
        while( returnNode.parent != null ){
            returnNode = returnNode.parent;
        }
        
        return returnNode;
    }
	
	public  void insert(AVLTree n, int value) {
		
		if(n == null) {
			n = new AVLTree(null, null, null, 0);
			return;
		}
		
		while(n != null) {
            if( n.key == value) {    
            	return; // value already exists
			} else if(value < n.key) {
				
				if(n.left == null) {
					
					AVLTree newNode = new AVLTree(n, null, null, 0);
					n.left = newNode;
					rebalance(newNode);
					return;
				} else {
					
					n = n.left;
				}
				
				
            } else {
            	
            	if(n.right == null) {
            		
            		AVLTree newNode = new AVLTree(n, null, null, 0);
            		n.right = newNode;
            		rebalance(n);
            		return;            		
            	} else {
            		
            		n = n.right;
            	}
            	
            }
        }		
	}
	
	static AVLTree rotateRightAndBack(AVLTree x) {
		
		x = rotateRight(x);
		
		while(x.parent != null) {
			
			x = x.parent;
		}
		
		return x;
	}
	
	static AVLTree rotateRight(AVLTree x) {
		AVLTree y = x.left;
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
		
		y.balance = 0;
		x.balance = 0;
		
		return y;
	}
	
	static AVLTree rotateLeftAndBack(AVLTree x) {
		
		x = rotateLeft(x);
		
		while(x.parent != null) {
			
			x = x.parent;
		}
		
		return x;
	}
	
	static AVLTree rotateLeft(AVLTree x) {
		AVLTree y = x.right;
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
		
		y.balance = 0;
		x.balance = 0;
		
		return y;
	}
	
	static AVLTree rotateRightLeft(AVLTree x) {
		AVLTree a = x;
		AVLTree b = x.right;
		AVLTree c = x.right.left;
		if( c != null ){
			int balance = c.balance;
			x.right = rotateRight(x.right);
			x = rotateLeft(x);
			if( balance == -1  ){
				b.balance = 1;
			}else if( balance == 1 && a != null ){
				a.balance = -1;
			}
		}else{
			x.right = rotateRight(x.right);
			x = rotateLeft(x);
		}
		return x;
	}
	
	static AVLTree rotateRightLeftAndBack(AVLTree x) {
		
		rotateRightLeft(x);
		
		while(x.parent != null) {
			
			x = x.parent;
		}
		
		return x;
	}
	
	static AVLTree rotateLeftRight(AVLTree x) {
		AVLTree a = x;
		AVLTree b = x.left;
		AVLTree c = x.left.right;
		if( c != null ){
			int balance = c.balance;
			x.left = rotateLeft(x.left);
			x = rotateRight(x);
		
			if( balance == -1 && a != null ){
				a.balance = 1;
			}else if( balance == 1 ){
				b.balance = -1;
			}
		}else{
			x.left = rotateLeft(x.left);
			x = rotateRight(x);
		}
		return x;
	}
	
	static AVLTree rotateLeftRightAndUp(AVLTree x) {
		
		rotateLeftRight(x);
		
		while(x.parent != null) {
			
			x = x.parent;
		}
		
		return x;
	}
	
	static void executeRebalance( AVLTree z ){
		
		AVLTree t = rebalance( z );	
	}
	
    //rebalance after Insert (Assumes inserted to be a freshly inserted node )
	static AVLTree rebalance( AVLTree inserted ) {
        
        if( inserted.parent == null ){
               return inserted;
        }
		
		AVLTree localRoot = inserted.parent;
        if( localRoot.right == inserted ){
            if( localRoot.balance == 0 ){
                localRoot.balance = 1;
            }else if( localRoot.balance == -1 ){
                localRoot.balance = 0;
                return localRoot;
            }
            //localRoot.balance = 1
            //kann im ersten schritt nicht passieren, da wir rechts neu eingefügt haben
            
        }else if( localRoot.left == inserted ){
            if( localRoot.balance == 0 ){
                localRoot.balance = -1;
            }else if( localRoot.balance == 1 ){
                localRoot.balance = 0;
                return localRoot;
            }
            //localRoot.balance = -1
            //kann im ersten schritt nicht passieren, da wir links neu eingefügt haben
        }
        
        if( localRoot.parent == null ){
               return localRoot;
        }
        
        inserted = localRoot;
        localRoot = localRoot.parent;
       
		while( true ) {
			
			if(localRoot.right == inserted ) { 
				
				if( localRoot.balance == 1) {
					
					if( inserted.balance == -1) {
						rotateRightLeft( localRoot );
                        return inserted.parent;
					} else {
						rotateLeft( localRoot );
                        return inserted;
					}
					
				} else if( localRoot.balance == -1) {
					localRoot.balance = 0;
					return localRoot;
				} else {
					localRoot.balance = 1;
				}
			} else {

				if( localRoot.balance == -1) {
					
					if( inserted.balance == 1) {
						rotateLeftRight( localRoot );
                        return inserted.parent;
					} else {
						rotateRight( localRoot );
                        return inserted;
					}
					
				} else if( localRoot.balance == 1) {
					localRoot.balance = 0;
					return localRoot;
				} else {
					localRoot.balance = -1;
				}
			}
			
			if( localRoot.parent != null ){
                inserted = localRoot;
                localRoot = localRoot.parent;
            }else{
                return localRoot;
            }
		}
		
	}
	
	static AVLTree originalRebalance( AVLTree z ) {
		
		AVLTree x = z.parent;
		AVLTree p1 = null;
		AVLTree p2 = null;
		while(x != null) {
			
			if(x.right == z) { 
				
				if(x.balance == 1) {
					
					if(z.balance == -1) {
						rotateRightLeft(x);
					} else {
						rotateLeft(x);
					}
					
					break;
					// adapt parent?
					
				} else if(x.balance == -1) {
					x.balance = 0;
					break;
				} else {
					x.balance = 1;
					z = x;
				}
			} else {

				if(x.balance == -1) {
					
					if(z.balance == 1) {
						rotateLeftRight(x);
					} else {
						rotateRight(x);
					}
					
					break;
					// adapt parent?
					
				} else if(x.balance == 1) {
					x.balance = 0;
					break;
				} else {
					x.balance = -1;
					z = x;
				}
			}
			
			p2 = p1;
			p1 = z;
			x = z.parent;
		}
		
		if( p2 != null ){
			return z.parent;
		}
		return x;
	}
    
    /*
    public static List listToAVL( ){
     
        List list = null;
        for( int i = 0; i < 10; i++ ){
            List newList = new List();
            newList.next = list;
            list = newList;    
        }
        AVLTree tree = new AVLTree( null, null, null, 0 );
        
        if( list != null ){
            tree = tree.pseudoInsert( );
            list = list.next;
        }
                
        return list;
    }*/
    
}
	
