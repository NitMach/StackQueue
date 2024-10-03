public class Main {
    public static void main(String[] args) {
        StackArray<Integer> mystack = new StackArray<>();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);

        System.out.println(mystack.peek());


        QueueArray<Integer> q = new QueueArray<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());


        StackLL<Integer> satack = new StackLL<>();
        satack.push(1);
        satack.push(2);
        satack.push(3);
        satack.push(4);
        satack.push(75);
        System.out.println(satack.peek());


        QueueLL<Integer> queue = new QueueLL<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());

        MinStack minStack = new MinStack();

        // Push values onto the stack
        minStack.push(5);
        minStack.push(2);
        minStack.push(7);
        minStack.push(1);

        System.out.println("Minimum value: " + minStack.getMin());

        System.out.println("Top value: " + minStack.top());

        minStack.pop();

        System.out.println("Minimum value after pop: " + minStack.getMin());
        System.out.println("Top value after pop: " + minStack.top());

        minStack.pop();
        System.out.println("Minimum value after second pop: " + minStack.getMin());
    }
}