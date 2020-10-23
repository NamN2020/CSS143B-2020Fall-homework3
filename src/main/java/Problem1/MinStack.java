package Problem1;
/*
    Nam Nguyen
    October 24, 2020
    CSS 143B
    Homework_3
 */

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private Integer[] stack;
    private Integer[] minStack = {Integer.MAX_VALUE};

    int size;

    public MinStack(int size) {
        // homework
        super(size);
        stack = new Integer[size];
    }

    @Override
    public boolean push(Integer val) {
        // homework
        if(minStack[0] > val){
            minStack[0] = val;
        }

        if(size < stack.length) {
            stack[size] = val;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public Integer pop() {
        // homework
        if(size == 0){
            System.out.println("Stack is empty");
        }
        Integer val = stack[size - 1];
        size--;
        return val;
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        if(minStack[0] == Integer.MAX_VALUE || minStack == null){
            return null;
        }

        return minStack[0];
    }
}

