public class SLLRecursiveReverse {


	public static void reverseList( SLL head ){

		SLL first;
		SLL rest;

		if(head == null) {
			return;
		}

		first = head;
		rest = first.next;

		if(rest == null) {
			return;
		}

		reverseList(rest);

		first.next.next = first;
		first.next = null;

		head = rest;

	}

	public static void main( String [] args ) {

	}

}
