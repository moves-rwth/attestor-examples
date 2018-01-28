public class SLLTraverse {

	private SLL next;
	
	public static void traverse( SLL head ){

		SLL cur = head;
		while( cur.next != null ){
			cur = cur.next;
		}
	}

	public static void main( String [] args ){

	}
}
