
public class DLList {


    private DLList nextAlt;
    private DLList prevAlt;
    
    public DLList(){
        this.nextAlt = null;
        this.prevAlt = null;
    }
    
    public DLList(DLList cur) {
    
        this.nextAlt = cur;
        this.prevAlt = null;
        cur.prevAlt = this;
    }
    
    public static void traverse(DLList head) {

		DLList cur = head;

        while(cur != null){

            cur = cur.nextAlt;
        }
    }

    public static void traverseInverse(DLList head) {

		DLList pos = head;

		while(pos != null){

			pos = pos.prevAlt;
		}
	}

	public static DLList findFirst(DLList head) {

		DLList pos = head;

		while(pos.prevAlt != null){

			pos = pos.prevAlt;
		}

		return pos;
	}

	public static DLList findLast(DLList head) {

		DLList pos = head;

		while(pos.nextAlt != null){

			pos = pos.nextAlt;
		}

		return pos;
	}

	public static DLList walkAround(DLList head) {

    	DLList pos = findLast(head);
    	pos = findFirst(pos);
    	return pos;
	}


	public void reverseIncomplete(DLList head){
				
		DLList pos = head;
				
		while(pos.nextAlt != null){
			
			DLList tmp = pos.nextAlt;
			
			pos.nextAlt = pos.prevAlt;
			pos.prevAlt = tmp;
			
			pos = pos.prevAlt;
		}
		
		head = pos;				
	}
	
	public void reverse(DLList head){

		DLList pos = head;

		while(pos != null){

			DLList tmp = pos.nextAlt;

			pos.nextAlt = pos.prevAlt;
			pos.prevAlt = tmp;

			pos = pos.prevAlt;
		}

		head = pos;
	}


    public static DLList buildList(){
        DLList list = new DLList();
        for( int i = 0; i < 10; i++ ){
            list = new DLList( list );
        }
        return list;
    }
	
	public DLList testDelete(){
		DLList head = buildList();
		DLList next = head.nextAlt;
		if( next != null ){
			next.prevAlt = null;
		}
		return next;
	}

	public void reverseAndTraverseBack(DLList head) {

		reverse(head);

	}
    
    public static void main(String[] args) {
    
        DLList head = buildList();
        traverse(head);
    }
    
}
