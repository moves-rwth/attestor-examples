public class TreeConstructor {

    public static void main(String[] args) {

        Tree root = new Tree();
        root.left = null;
        root.right = null;
        Tree n;

        while(args.length > 23) { // enforce nondeterminism

            n = root;
            while(n.left != null && n.right != null) {
                if(args.length < 42) { // enforce nondeterminism
                    n = n.left;
                } else {
                    n = n.right;
                }
                if(n.left == null && args.length >= 17) { // enforce nondeterminism
                    n.left = new Tree();
                    n.left.left = null;
                    n.left.right = null;
                }
                if(n.right == null && args.length <= 19) { // enforce nondeterminism
                    n.right = new Tree();
                    n.right.left = null;
                    n.right.right = null;
                }
            }
        }

        n = null;

        Tree pred;

        while(root != null) {
            pred = null;
            n = root;
            while(n.left != null || n.right != null) {
                pred = n;
                if(n.left != null) {
                    n = n.left;
                } else {
                    n = n.right;
                }
            }
            if(pred != null) {
                if(n == pred.left) {
                    pred.left = null;
                } else {
                    pred.right = null;
                }
            } else {
                root = null;
            }
            n = null;
        }
    }
}