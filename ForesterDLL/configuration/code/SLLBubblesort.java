class SLLBubblesort {

    public static void main(String[] args) {

        SLL x = null;
        SLL y = null;

        for(int i=0; i < args.length; i++) { // resolved by nondeterminism
            y = new SLL();
            y.next = x;
            x = y;
        }

        if(x == null) {
            return;
        }

        SLL pred;
        SLL succ;

        boolean sorted = false;

        while(!sorted) {
            sorted = true;
            y = x;
            pred = null;
            while(y != null && y.next != null) {
                if(args.length < 42) { // nondeterminism
                    succ = y.next;
                    if(pred != null) {
                        pred.next = succ;
                    } else {
                        x = succ;
                    }
                    y.next = succ.next;
                    succ.next = y;
                    sorted = false;
                }
                pred = y;
                y = y.next;
            }
        }

        while(x != null) {
            y = x;
            x = x.next;
            y = null;
        }

    }
}