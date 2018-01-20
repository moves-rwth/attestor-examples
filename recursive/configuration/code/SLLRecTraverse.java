class SLLRecTraverse {

    public static void main(String[] args) {

        SLL list = buildList(args.length);
        list = traverse(list);
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

    private static SLL traverse(SLL list) {

        if(list == null) {
            return null;
        } else if(list.next == null) {
            return list;
        } else {
            return traverse(list);
        }
    }

}