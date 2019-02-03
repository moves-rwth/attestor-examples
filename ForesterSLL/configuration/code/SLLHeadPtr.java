public class SLLHeadPtr {

    private SLLHeadPtr next;
    private SLLHeadPtr head;

    public static void main(String[] args) {

        SLLHeadPtr head = new SLLHeadPtr();
        head.next = null;
        head.head = head;

        SLLHeadPtr x = head;

        for(int i=0; i < args.length; i++) { // nondeterminism

            x.next = new SLLHeadPtr();
            x.next.next = null;
            x.next.head = head;
            x = x.next;
        }

        x = head;

        while(x != null) {
            x = x.next;
        }

        x = head;

        while(x != null) {
            SLLHeadPtr y = x;
            x = x.next;
            y = null;
        }

    }

}