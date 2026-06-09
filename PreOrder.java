import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        this.data = d;
    }
}

class TreeOps {

    void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void preOrderIterator(Node root) {
        if (root == null) return;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node ele = stack.pop();
            System.out.print(ele.data + " ");

            if (ele.right != null)
                stack.push(ele.right);

            if (ele.left != null)
                stack.push(ele.left);
        }
    }

    boolean isMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        return root1.data == root2.data
                && isMirror(root1.left, root2.right)
                && isMirror(root1.right, root2.left);
    }

    int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    int getDiameter(Node root) {
        if (root == null) return 0;
        return 1 + height(root.left) + height(root.right);
    }

    boolean isEqual(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        return root1.data == root2.data
                && isEqual(root1.left, root2.left)
                && isEqual(root1.right, root2.right);
    }

    // Build tree from level-order array
    Node build(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        Queue<Node> q = new LinkedList<>();

        Node root = new Node(arr[0]);
        q.offer(root);

        int i = 1;

        while (i < arr.length) {
            Node curr = q.poll();

            if (i < arr.length && arr[i] != null) {
                curr.left = new Node(arr[i]);
                q.offer(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                curr.right = new Node(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }

        return root;
    }
}

public class PreOrder {
    public static void main(String[] args) {

        TreeOps tree = new TreeOps();

        Node root1 = tree.build(new Integer[]{10, 20, 30, 40, 50, 60, null});
        Node root2 = tree.build(new Integer[]{10, 20, 30, 40, 50, 60, null});

        System.out.println(tree.isEqual(root1, root2));
    }
}