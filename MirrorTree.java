class MirrorTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isMirror(Node a, Node b) {

        if (a == null && b == null)
            return true;

        if (a == null || b == null)
            return false;

        return (a.data == b.data)
                && isMirror(a.left, b.right)
                && isMirror(a.right, b.left);
    }

    static boolean isSymmetric(Node root) {
        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(20);

        root.left.left = new Node(30);
        root.left.right = new Node(40);

        root.right.left = new Node(40);
        root.right.right = new Node(30);

        System.out.println(isSymmetric(root));
    }
}