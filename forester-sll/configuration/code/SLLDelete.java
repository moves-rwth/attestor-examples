class SLLDelete {

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

            if(args.length == 42) { // resolved by nondeterminism

                if(z != null) {
                    z.next = x.next;
                } else {
                    y = y.next;
                }
                x = null;
                break;
            }
            z = x;
            x = x.next;
        }

    }
}