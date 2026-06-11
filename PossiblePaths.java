import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PossiblePaths {

    static void findPaths(Node root, int targetSum,
                          List<Integer> path, int currentSum) {

        if (root == null)
            return;

        path.add(root.data);
        currentSum += root.data;

        // Leaf node
        if (root.left == null && root.right == null) {

            // Print every root-to-leaf path
            System.out.println("Path: " + path);

            // Check target sum
            if (currentSum == targetSum) {
                System.out.println("Target Path: " + path);
            }
        }

        findPaths(root.left, targetSum, path, currentSum);
        findPaths(root.right, targetSum, path, currentSum);

        // Backtracking
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(11);

        root.right.left = new Node(13);
        root.right.right = new Node(4);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);

        root.right.right.right = new Node(1);

        int targetSum = 22;

        findPaths(root, targetSum, new ArrayList<>(), 0);
    }
}
