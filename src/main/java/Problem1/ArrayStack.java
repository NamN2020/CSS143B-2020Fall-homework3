package Problem1;
/*
    Nam Nguyen
    October 25, 2020
    CSS 143B
    Homework_3

    Sources:
    https://stackoverflow.com/questions/18581002/how-to-create-a-generic-array/18581313
 */

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;


    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        size = 0;
        data = (T[]) new Object[capacity];
    }

    @Override
    public boolean push(T val) {
        // homework
        if(size < data.length) {
            data[size] = val;
            size++;
            return true;
        }
            return false;
    }

    @Override
    public T pop() {
        // homework
        if(size == 0){
            System.out.println("Stack is empty");
        }
        T val = data[size - 1];
        size--;
        return val;
    }

    @Override
    public T peek() {
        // homework
        if(size == 0){
            System.out.println("Stack is empty");
        }

        T val = data[size - 1];
        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
