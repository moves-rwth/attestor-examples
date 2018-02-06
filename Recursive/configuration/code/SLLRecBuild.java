public class SLLRecBuild {

    public static void main(String[] args) {

        SLL list = buildList(args.length, null);
    }

    private static SLL buildList(int argLength, SLL list) {

            if(argLength < 42) { // nondeterminism
                SLL nextElement = new SLL();
                nextElement.next = list;
                return buildList(argLength, nextElement);
            }
            return list;
    }

}