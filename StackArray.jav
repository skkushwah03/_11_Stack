package _11_Stackk;

class StackArray { 
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize stack
    public StackArray(int size) {  // Fixed constructor name
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1; // stack is initially empty
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        int value = stackArray[top--];
        System.out.println(value + " popped from stack.");
        return value;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5); // Use correct class name

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        stack.push(60); // Should show overflow

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.pop();

        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Should show underflow
    }
}
