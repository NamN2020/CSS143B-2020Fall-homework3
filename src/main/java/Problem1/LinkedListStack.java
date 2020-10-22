package Problem1;
/*
    Nam Nguyen
    October 24, 2020
    CSS 143B
    Homework_3
 */

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        // homework
        data.push(val);
        return true;
    }

    @Override
    public T pop() {
        // homework
        T val = data.pop();

        return val;
    }

    @Override
    public T peek() {
        // homework
        T val = data.peek();
        return val;
    }

    @Override
    public int size() {
        return data.size();
    }
}
