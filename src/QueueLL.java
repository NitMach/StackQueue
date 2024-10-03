public class QueueLL<T> {
    private Node<T> head;

    private Node<T> curr;

    private class Node<T> {
        private T val;
        private Node<T> next;

        public Node(T val) {
            this.val = val;
            this.next = null;
        }
    }

    public QueueLL() {
        head = null;
        curr = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(T Element){
        if(head == null){
            head = new Node<>(Element);
            curr = head;
        }else{
            curr.next = new Node<>(Element);
            curr = curr.next;
        }
    }

    public T peek(){
        if(isEmpty()) throw  new RuntimeException("The size of the queue is 0");
        return head.val;
    }

    public T dequeue(){
        if(isEmpty()) throw  new RuntimeException("The size of the queue is 0");
        T value = head.val;
        head = head.next;
        return value;
    }


}
