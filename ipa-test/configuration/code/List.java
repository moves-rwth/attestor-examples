public class List{

	private List next;
	
	public List( List next ){
		this.next = next;
	}

    public static List buildList(){
        return null; //this method should never be called, since a contract is provided.
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
