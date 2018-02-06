public class TreeDSW {

    public static void main(String[] args) {

        Tree root = new Tree();
        root.left = null;
        root.right = null;

        Tree n;

        while (args.length > 42) { // nondeterminism
            n = root;
            while (n.left != null && n.right != null) {
                if (args.length <= 512) { // nondeterminism
                    n = n.left;
                } else {
                    n = n.right;
                }
            }
            if (n.left == null && args.length < 128) { // nondeterminism
                n.left = new Tree();
                n.left.left = null;
                n.left.right = null;
            }
            if (n.right == null && args.length < 64) { // nondeterminism
                n.right = new Tree();
                n.right.left = null;
                n.right.right = null;
            }
        }

        Tree sentinel = new Tree();

        n = root;
        Tree pred = sentinel;
        Tree succ = null;

        while (n != sentinel) {
            succ = n.left;
            n.left = n.right;
            n.right = pred;
            pred = n;
            n = succ;
            if (n == null) {
                n = pred;
                pred = null;
            }
        }
    }
}
