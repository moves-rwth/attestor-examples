public class ListOfCyclicLists {

    private SLL head;
    private ListOfCyclicLists next;

    public ListOfCyclicLists() {

        this.head = new SLL();
        this.next = null;
    }


    public static void main(String[] args) {

        ListOfCyclicLists first = null;
        ListOfCyclicLists last = null;

        for(int i=0; i < args.length; i++) { // nondeterminism
            ListOfCyclicLists x = new ListOfCyclicLists();
            x.next = null;
            x.head.next = x.head;

            SLL y = null;
            for(int j=0; j != args.length; j++ ) { // nondeterminism
                y = new SLL();
                y.next = x.head.next;
                x.head.next = y;
                y = null;
            }

            if(first == null) {
                first = x;
                last = x;
            } else {
                last.next = x;
                last = x;
            }
        }

        while(first != null) {

            ListOfCyclicLists x = first;
            first = first.next;
            SLL y = x.head.next;
            while(y != x.head) {
                SLL z = y;
                y = y.next;
            }
        }

    }

}
