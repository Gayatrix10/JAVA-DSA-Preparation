import java.util.LinkedList;
import java.util.Queue;

public class BST {

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

    static Node buildTree(Integer[] arr) {
        if (arr.length == 0) return null;

        Queue<Node> que = new LinkedList<>();
        Node root = new Node(arr[0]);
        que.add(root);

        int i = 1;

        while (!que.isEmpty() && i < arr.length) {
            Node curr = que.poll();

            if (i < arr.length && arr[i] != null) {
                curr.left = new Node(arr[i]);
                que.offer(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                curr.right = new Node(arr[i]);
                que.offer(curr.right);
            }
            i++;
        }

        return root;
    }

    static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val >= root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node curr = que.poll();

            if (curr.data == key) return true;

            if (curr.left != null) que.offer(curr.left);
            if (curr.right != null) que.offer(curr.right);
        }

        return false;
    }

    static int height(Node root) {
        if (root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    static boolean isValidBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data > max)
            return false;

        return isValidBST(root.left, min, root.data) &&
               isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = buildTree(new Integer[]{30, 20, 40, 15, 25, 35, 45});

        inOrder(root);
        System.out.println();

        root = insert(root, 41);
        inOrder(root);
        System.out.println();

        root = insert(root, 41);
        inOrder(root);
        System.out.println();

        System.out.println(search(root, 55));

        boolean res = isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(res);
    }
}