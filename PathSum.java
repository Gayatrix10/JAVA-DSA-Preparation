import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PathSum {

    static void Path(Node root, int target,
                          List<Integer> path, int sum) {

        if (root == null)
            return;

        path.add(root.data);
        sum += root.data;

        // Leaf node
        if (root.left == null && root.right == null) {
            if (sum == target) {
                System.out.println(path);
            }
        }

        Path(root.left, target, path, sum);
        Path(root.right, target, path, sum);

        path.remove(path.size() - 1); // backtrack
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.right = new Node(13);
        root.right.left = new Node(4);
        root.right.right = new Node(7);
        root.left.left.left = new Node(2);
        root.left.left.left.left = new Node(1);

        int target = 22;

        Path(root, target, new ArrayList<>(), 0);
    }
}