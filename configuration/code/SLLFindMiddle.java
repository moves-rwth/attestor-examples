public class SLLFindMiddle {

	public static SLL findMiddle( SLL head ){

		SLL slow = head;
		SLL fast = head;
		while( fast != null ){

			fast = fast.next;
			if(fast != null) {
				fast = fast.next;
			}

			slow = slow.next;
		}

		return slow;
	}

	public static SLL findMiddleFaulty( SLL head ){

		SLL slow = head;
		SLL fast = head;
		while( fast != null ){

			fast = fast.next;
			slow = slow.next;
			if(fast != null) {
				slow = fast.next;
			}

		}

		return slow;
	}

	public static void main( String [] args ){

	}
}
