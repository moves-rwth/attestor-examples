class RecursiveTreeTraverse {

    public static void main(String[] args) {

        Tree tree = buildTree(args.length);
        tree = traverse(tree);
    }

    private static Tree traverse(Tree tree) {

        if(tree == null) {
            return null;
        } else {
            traverse(tree.left);
            traverse(tree.right);
            return tree;
        }
    }

    private static Tree buildTree(int argsLength) {

        Tree root = new Tree();
        root.left = null;
        root.right = null;

        Tree n;

        while (argsLength > 42) { // nondeterminism
            n = root;
            while (n.left != null && n.right != null) {
                if (argsLength <= 512) { // nondeterminism
                    n = n.left;
                } else {
                    n = n.right;
                }
            }
            if (n.left == null && argsLength < 128) { // nondeterminism
                n.left = new Tree();
                n.left.left = null;
                n.left.right = null;
            }
            if (n.right == null && argsLength < 64) { // nondeterminism
                n.right = new Tree();
                n.right.left = null;
                n.right.right = null;
            }
        }

        return root;

    }


}