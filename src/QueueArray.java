import java.util.ArrayList;

public class QueueArray<T> {
    private ArrayList<T> data;
    public QueueArray() {
        data = new ArrayList<>(); //new arrayList is created once the class is called
    }

    public void enqueue(T Element){
        data.add(Element);
    }

    public T dequeue(){
        if(isEmpty()) throw new NullPointerException();
        return data.remove(0);
    }

    public T peek(){
        if(isEmpty()) throw new NullPointerException();
        return data.get(0);
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }
}
