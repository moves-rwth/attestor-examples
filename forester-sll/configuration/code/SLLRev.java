class SLLRev {

    public static void main(String[] args) {

        SLL x = null;
        SLL y = null;

        for(int i=0; i < args.length; i++) { // resolved by nondeterminism
            y = new SLL();
            y.next = x;
            x = y;
        }

        SLL z = null;

        while(x != null) {
            y = x;
            x = x.next;
            y.next = z;
            z = y;
        }
        

        while(y != null) {
            x = y;
            y = y.next;
            x = null;
        }
    }
}