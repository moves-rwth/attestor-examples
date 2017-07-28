public class ListNodeAlt{

	private ListNodeAlt nextAlt;
	
	public ListNodeAlt( ListNodeAlt next ){
		this.nextAlt = next;
	}
	
	public void setNext( ListNodeAlt next ){
		this.nextAlt = next;
	}
	
	public static void reverseList( ListNodeAlt list ){
		
		ListNodeAlt reversedPart = null;
		ListNodeAlt current = list;
		while (current != null) {
			ListNodeAlt next = current.nextAlt;
			current.nextAlt = reversedPart;
			reversedPart = current;
			current = next;
		}
		list = reversedPart;
			
	}
	
	public static ListNodeAlt buildList(){
		ListNodeAlt list = new ListNodeAlt(null);
		for( int i = 0; i < 10; i++ ){
			list = new ListNodeAlt( list );
		}
		
		return list;
	}
	
	public static void traverseList( ListNodeAlt list ){
	
		ListNodeAlt curr = list;
		while( curr.nextAlt != null ){
			curr = curr.nextAlt;
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
