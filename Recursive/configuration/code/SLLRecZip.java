public class SLLRecZip {

    public static void main(String[] args) {

        SLL left = buildList(args.length);
        SLL right = buildList(args.length);
        SLL zipped = zip(left, right);
    }

    private static SLL buildList(int argsLength) {

        SLL x = null;
        SLL y = null;

        for (int i = 0; i < argsLength; i++) { // resolved by nondeterminism
            y = new SLL();
            y.next = x;
            x = y;
        }

        return x;
    }

    private static SLL zip(SLL left, SLL right) {

        if(left == null)  {
            return right;
        }

        SLL first = left;
        return zipRight(first, first.next, right);
    }

    private static SLL zipLeft(SLL current, SLL left, SLL right) {

        if(left == null) {
            current.next = right;
            return current;
        } else {
            current.next = left;
            return zipRight(left, left.next, right);
        }
    }

    private static SLL zipRight(SLL current, SLL left, SLL right) {

        if(right == null) {
            current.next = left;
            return current;
        } else {
            current.next = right;
            return zipLeft(right, left, right.next);
        }
    }



}