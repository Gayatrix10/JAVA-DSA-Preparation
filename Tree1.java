import java.util.LinkedList;
import java.util.Queue;

class TreeOps {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    Node createNode(int val) {
        return new Node(val);
    }

    void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    void levelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {

            Node curr = que.poll();

            System.out.print(curr.data + " ");

            if (curr.left != null) {
                que.add(curr.left);
            }

            if (curr.right != null) {
                que.add(curr.right);
            }
        }
    }
}

public class Tree1 {
    public static void main(String[] args) {

        TreeOps tree = new TreeOps();

        TreeOps.Node root = tree.createNode(10);

        root.left = new TreeOps.Node(20);
        root.right = new TreeOps.Node(30);
        root.left.left = new TreeOps.Node(40);
        root.left.right = new TreeOps.Node(50);

        System.out.print("Preorder: ");
        tree.preOrder(root);

        System.out.println();

        System.out.print("Inorder: ");
        tree.inOrder(root);

        System.out.println();

        System.out.print("Postorder: ");
        tree.postOrder(root);

        System.out.println();

        System.out.print("Level Order: ");
        tree.levelOrder(root);
    }
}