public class SLLTraverse {

	public static void traverse( SLL head ){

		SLL cur = head;
		while( cur.next != null ){
			cur = cur.next;
		}
	}


	public static void traverseFaulty( SLL head ){

		SLL cur = head;
		while( cur != null ){
			cur = cur.next;
		}
	}


	public static void main( String [] args ){

	}
}
