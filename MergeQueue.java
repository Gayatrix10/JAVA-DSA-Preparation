import java.util.LinkedList;
import java.util.Queue;

public class MergeQueue {

    public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {

        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {

            if (q1.peek() <= q2.peek()) {
                result.add(q1.poll());
            } else {
                result.add(q2.poll());
            }
        }

        while (!q1.isEmpty()) {
            result.add(q1.poll());
        }

        while (!q2.isEmpty()) {
            result.add(q2.poll());
        }

        return result;
    }

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q1.add(1);
        q1.add(3);
        q1.add(5);
        q1.add(7);

        q2.add(2);
        q2.add(4);
        q2.add(6);
        q2.add(8);

        Queue<Integer> merged = mergeQueues(q1, q2);

        System.out.println("Merged Queue:");

        while (!merged.isEmpty()) {
            System.out.print(merged.poll() + " ");
        }
    }
}