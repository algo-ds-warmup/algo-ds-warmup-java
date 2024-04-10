package stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        queue1.add(x);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
    }

    public int pop() {
        return queue1.remove();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

}
