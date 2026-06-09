import java.util.ArrayList;

public class MaxMin {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static ArrayList<Integer> findMaxMin(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Node minNode = root;
        while (minNode.left != null) {
            minNode = minNode.left;
        }

        Node maxNode = root;
        while (maxNode.right != null) {
            maxNode = maxNode.right;
        }

        ans.add(maxNode.data);
        ans.add(minNode.data);

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(15);
        root.left.right = new Node(25);
        root.right.left = new Node(35);
        root.right.right = new Node(45);

        System.out.println(findMaxMin(root));
    }
}