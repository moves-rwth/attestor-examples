public class SLLReverse {

	private SLL next;


	public static void reverseList( SLL head ){

		SLL reversedPart = null;
		SLL current = head;
		while (current != null) {
			SLL nextElement = current.next;
			current.next = reversedPart;
			reversedPart = current;
			current = nextElement;
		}

	}

	public static SLL buildList(int length){
		SLL list = new SLL(null);

		// enforce nondeterminism due to user input
		for( int i = 0; i < length; i++ ){
			list = new SLL( list );
		}

		return list;
	}

	public static void main( String [] args ){

		SLL head = buildList(args.length);

		SLL reversedPart = null;
		SLL current = head;
		while (current != null) {
			SLL nextElement = current.next;
			current.next = reversedPart;
			reversedPart = current;
			current = nextElement;
		}
	}
}
