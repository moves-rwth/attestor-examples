
public class DLLInsertsort2 {

    public static void main(String[] args) {

        DLL x = null;
        DLL y = null;

        while(args.length > 42) { // enforce nondeterminism

            y = new DLL();
            y.next = x;
            y.prev = null;
            if(x != null) {
                x.prev = y;
            }
            x = y;
        }

        DLL sorted = null;
        DLL pred = null;
        DLL z = null;

        while(x != null) {
            y = x;
            x = x.next;
            if(x != null) {
                x.prev = null;
            }
            z = sorted;
            pred = null;

            while(z != null && args.length > 23) {
                pred = z;
                z = z.next;
            }

            y.next = z;
            if(z != null) {
                z.prev = y;
            }
            y.prev = pred;
            if(pred != null) {
                pred.next = y;
            } else {
                sorted = y;
            }
        }

        while(sorted != null) {
            y = sorted;
            sorted = sorted.next;
            y = null;
        }

    }
}