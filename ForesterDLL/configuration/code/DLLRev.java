
public class DLLRev {

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

        y = x;
        x = null;

        while(y != null) {
            DLL z = y;
            y = y.next;
            if(y != null) {
                y.prev = null;
            }
            z.next = x;
            z.prev = null;
            if(x != null) {
                x.prev = z;
            }
            x = z;
        }

        while(x != null) {
            y = x;
            x = x.next;
            y = null;
        }
    }
}