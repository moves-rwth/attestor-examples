public class SLLRecursiveReverse {


    public static SLL reverseList( SLL head ){

		SLL first;
		SLL rest;

		if(head == null) {
			return head;
		}

		first = head;
		rest = first.next;

		if(rest == null) {
			return first;
		}

		rest = reverseList(rest);

		first.next.next = first;
		first.next = null;

		head = rest;
		return head;

	}

	public static void main( String [] args ) {

	}

}
