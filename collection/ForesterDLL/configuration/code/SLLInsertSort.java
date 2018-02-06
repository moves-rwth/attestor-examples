class SLLInsertSort {

    public static void main(String[] args) {

        SLL x = null;
        SLL y = null;

        for(int i=0; i < args.length; i++) { // resolved by nondeterminism
            y = new SLL();
            y.next = x;
            x = y;
        }

        SLL sorted = null;
        SLL pred = null;
        SLL z = null;

        while(x != null) {
            y = x;
            x = x.next;
            pred = null;
            z = sorted;

            for(int i=0; z != null && i < args.length; i++) { // second conjunct corresponds to nondeterminism
                pred = z;
                z = z.next;
            }

            y.next = z;
            if(pred != null) {
                pred.next = y;
            } else {
                sorted = y;
            }
        }

        while(sorted != null) {
            x = sorted;
            sorted = sorted.next;
            x = null;
        }

    }
}