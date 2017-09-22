public class ListNodeAlt{

	private ListNodeAlt nextAlt;
	
	public ListNodeAlt( ListNodeAlt next ){
		this.nextAlt = next;
	}
	
	public void setNext( ListNodeAlt next ){
		this.nextAlt = next;
	}
	
	public static void reverseList( ListNodeAlt head ){
		
		ListNodeAlt reversedPart = null;
		ListNodeAlt current = head;
		while (current != null) {
			ListNodeAlt next = current.nextAlt;
			current.nextAlt = reversedPart;
			reversedPart = current;
			current = next;
		}
			
	}
	
	public static ListNodeAlt buildList(){
		ListNodeAlt list = new ListNodeAlt(null);
		for( int i = 0; i < 10; i++ ){
			list = new ListNodeAlt( list );
		}
		
		return list;
	}
	
	public static void traverseList( ListNodeAlt head ){
	
		ListNodeAlt cur = head;
		while( cur.nextAlt != null ){
			cur = cur.nextAlt;
		}
		
	}
	
	public static void traverseListWithNullVisit( ListNodeAlt head ){
	
		ListNodeAlt cur = head;
		while( cur != null ){
			cur = cur.nextAlt;
		}
		
	}
	
	public static void main( String [] args ){
		ListNodeAlt head = buildList();
		

		
		/*ListNodeAlt tail = head;
		while( tail.nextAlt != null ){
			tail = tail.nextAlt;
		}
		*/
		

		
		
		ListNodeAlt reversedPart = null;
		ListNodeAlt current = head;
		while (current != null) {
			ListNodeAlt next = current.nextAlt;
			current.nextAlt = reversedPart;
			reversedPart = current;
			current = next;
		}
		
		
		
	
		
		
		//traverseList( list );
		//reverseList( head );
	}
}
