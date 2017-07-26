public class List{

	private List next;
	
	public List( List next ){
		this.next = next;
	}

    public static List buildList(){
        List list = new List(null);
        for( int i = 0; i < 10; i++ ){
            list = new List( list );
        }
        return list;
    }

	public static void main( String [] args ){
		List head = buildList();
		
		List reversedPart = null;
		List current = head;
		while (current != null) {
			List next = current.next;
			current.next = reversedPart;
			reversedPart = current;
			current = next;
		}
	}
}
