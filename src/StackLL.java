
public class StackLL<T> {

    private Node<T> head;

    private class Node<T> {
        private T val;
        private Node<T> next;

        public Node(T val) {
            this.val = val;
            this.next = null;
        }
    }

    public StackLL() {
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return head.val;
    }


    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T topElement = head.val;
        head = head.next;
        return topElement;
    }

}
