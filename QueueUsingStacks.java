import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // Enqueue
    void enqueue(int x) {
        st1.push(x);
    }

    // Dequeue
    int dequeue() {

        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);

        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
    }
}