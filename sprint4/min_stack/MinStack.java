package min_stack;

public class MinStack {

    private int[] stack;
    private int[] minStack;
    private int top;

    public MinStack() {
        stack = new int[1];
        minStack = new int[1];
        top = -1;
    }

    public void push(int val) {
        increaseArraySize();
        stack[++top] = val;
        if (top == 0 || val < minStack[top - 1]) {
            minStack[top] = val;
        } else {
            minStack[top] = minStack[top - 1];
        }
    }

    public void pop() {
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return minStack[top];
    }

    private void increaseArraySize() {
        if (top + 1 == stack.length) {
            int newCapacity = stack.length * 2;
            stack = java.util.Arrays.copyOf(stack, newCapacity);
            minStack = java.util.Arrays.copyOf(minStack, newCapacity);
        }
    }

}
