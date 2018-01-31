public class BuildCyclicDLL {

    public static void main(String[] args) {

        DLL x = null;
        DLL y = null;

        x = new DLL();
        x.next = x;
        x.prev = x;

        while(args.length > 42) { // enforce nondeterminism

            y = new DLL();
            y.next = x.next;
            y.next.prev = y;
            y.prev = x;
            x.next = y;
            y = null;
        }

        y = x.next;

        while(y != x) {
            DLL z = y;
            y = y.next;
            z = null;
        }

        x = null;
    }
}
