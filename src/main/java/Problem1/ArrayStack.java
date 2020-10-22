package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;


    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework

    }

    @Override
    public boolean push(T val) {
        // homework
        if(size >= data.length) {
            data[size++] = val;
            return true;
        } else {
            System.out.println("Stack Overloaded");
            return false;
        }
    }

    @Override
    public T pop() {
        // homework
        T val = data[size--];
        return val;
    }

    @Override
    public T peek() {
        // homework
        T val = data[size];
        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
