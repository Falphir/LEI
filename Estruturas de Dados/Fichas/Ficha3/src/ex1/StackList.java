package ex1;

public class StackList<T> {
    public int count;
    public int top;
    public T[] stackArray;

    public int maxCapacity;


    public StackList(int defaultcapacity) {
        this.top = -1;
        this.stackArray = (T[]) new Object[defaultcapacity];
        this.count = count;
        this.maxCapacity = defaultcapacity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public T[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(T[] stackArray) {
        this.stackArray = stackArray;
    }

    public void push(T item) {
        if(isStackFull()) {
            System.out.println("Stack is full");
            System.out.println("Increasing stack size");
            doubleStackCapacity();
        }

        System.out.println("Adding: " + item);
        this.stackArray[++top] = item;
        count ++;
    }

    public T pop() throws EmptyStackException {

        if(isEmpty()) {
            throw new EmptyStackException("ERROR: Stack is empty");
        }

        T item = this.stackArray[top--];
        System.out.println("Removed item: " + item);
        count--;
        return item;

    }

    private boolean isStackFull() {
        if(this.top+1 == this.maxCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public T peek() {

        System.out.println("First item in stack: " + this.stackArray[top]);

        return stackArray[top];
    }

    public Boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        int size = top + 1;
        System.out.println("Stack size is " + size);
        return top + 1;
    }

    public void doubleStackCapacity() {

        int newCapacity = 2*maxCapacity;

        T[] array = (T[]) new Object[newCapacity];

        int count = 0;

        while (count < top) {
            array[count] = stackArray[count];
            count++;
        }

        maxCapacity = newCapacity;

        this.stackArray = array;

    }

    @Override
    public String toString() {
        return "";
    }

}
