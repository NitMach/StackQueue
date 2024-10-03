import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArray<T>{
    private ArrayList<T> data;
    public StackArray() {
        data = new ArrayList<>();  //new arrayList is created once the class is called
    }

    public void push(T Element){
        data.add(Element);
    }

    public T peek(){
        if(isEmpty()) throw new EmptyStackException();
        return data.get(data.size()-1);
    }

    public T pop(){
        if(isEmpty()) throw new EmptyStackException();
        return data.remove(data.size()-1);
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }
}
