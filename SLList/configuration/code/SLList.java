public class SLList{

	private SLList next;
	
	public SLList( SLList next ){
		this.next = next;
	}

    public static SLList buildSLList(){
        SLList SLList = new SLList(null);
        for( int i = 0; i < 10; i++ ){
            SLList = new SLList( SLList );
        }
        return SLList;
    }

	public static void main( String [] args ){
		SLList head = buildSLList();
		
		SLList reversedPart = null;
		SLList current = head;
		while (current != null) {
			SLList next = current.next;
			current.next = reversedPart;
			reversedPart = current;
			current = next;
		}
	}
}
