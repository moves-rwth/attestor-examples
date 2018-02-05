
public class DLLBuildAndInsert {

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

        while (y != null) {
            if (args.length < 42) { // enforce nondeterminism
                DLL z = new DLL();
                z.next = y.next;
                z.prev = y;
                y.next = z;
                if(z.next != null) {
                    z.next.prev = z
                }
                break;
            }
            y = y.next;
        }

        while(x != null) {
            y = x;
            x = x.next;
            y = null;
        }
    }
}